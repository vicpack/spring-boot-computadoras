package com.rest.rest;

import com.rest.rest.model.AlumnoRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
@SpringBootApplication
public class DemoSpringBootVersionOchoApplication2 {
	public List<AlumnoRecord> alumnos;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootVersionOchoApplication2.class, args);
	}

	public DemoSpringBootVersionOchoApplication2() {
		alumnos = new ArrayList<>();
		alumnos.add(new AlumnoRecord("Angel",10, "Java","oracle"));
		alumnos.add(new AlumnoRecord("Mario",9, "C++","spring"));
		alumnos.add(new AlumnoRecord("Leonardo",8, "Groovy", "mysql"));
		alumnos.add(new AlumnoRecord("Carlos",6, "Web", "mysql"));
		alumnos.add(new AlumnoRecord("Victor",7, "Spring", "oracle"));
	}

	@GetMapping("/v1/alumnos/{materia}")
	public List<AlumnoRecord> alumnosPorCurso(@PathVariable String materia){
		/*List<Alumno> respuesta = new ArrayList<>();
		for (Alumno alumno:alumnos){
			if (alumno.getMateria().equals(materia))
				respuesta.add(alumno);
		}
		return respuesta;*/
		return alumnos.stream()
				.filter(alumno -> alumno.materia().equals(materia))
				.collect(Collectors.toList());
	}


	@GetMapping("v1/alumnos")
		public List<AlumnoRecord> alumnos(){
		System.out.println("Se solicitaron alumnos");
	    return alumnos;
	}

	@GetMapping("v2/alumnos/{curso}")
	public List<Integer> alumnosFiltrados(@PathVariable String curso){
		return alumnos.stream()
				.filter(alumno -> alumno.curso().equals(curso))
				.map(alumno -> alumno.calificacion())
				.collect(Collectors.toList());
	}
}
