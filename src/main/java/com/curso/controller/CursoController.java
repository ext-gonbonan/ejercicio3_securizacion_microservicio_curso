package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	CursoService service;
	
	@GetMapping(value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable("codCurso") String codCurso) {
		return service.buscarCurso(codCurso);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> obtenerCursos() {
		return service.obtenerCursos();
	}
	
	@GetMapping(value = "/precios/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosPorPrecio(@PathVariable("precioMin") double precioMin, @PathVariable("precioMax") double precioMax) {
		return service.cursosPorPrecio(precioMin, precioMax);
	}
	
	@GetMapping(value = "/precios2/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosPorPrecio2(@PathVariable("precioMin") double precioMin, @PathVariable("precioMax") double precioMax) {
		return service.cursosPorPrecio2(precioMin, precioMax);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> altaCurso(@RequestBody Curso curso) {
		return service.altaCurso(curso);
	}

	@DeleteMapping(value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable("codCurso") String codCurso) {
		return service.eliminarCurso(codCurso);
	}

	@PutMapping("/{codCurso}/{duracion}")
	public void actualizarDuracion(@PathVariable("codCurso") String codCurso, @PathVariable("duracion") int duracion) {
		service.actualizarDuracion(codCurso, duracion);
	}
	
}
