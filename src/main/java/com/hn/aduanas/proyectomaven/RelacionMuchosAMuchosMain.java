package com.hn.aduanas.proyectomaven;

import com.hn.aduanas.proyectomaven.dao.EstudianteCursoDao;
import com.hn.aduanas.proyectomaven.dto.Curso;
import com.hn.aduanas.proyectomaven.dto.Estudiante;

public class RelacionMuchosAMuchosMain {

	public static void main(String[] args) {

		// Inicializacion de la clase Dao
		EstudianteCursoDao ecDao = new EstudianteCursoDao();

		// Curso
		Curso c = new Curso();
		c.setNombreCurso("Java");

		Curso c1 = new Curso();
		c1.setNombreCurso("Golang");

		Curso c3 = new Curso();
		c3.setNombreCurso("Typescript");

		
		// Estudiante
		Estudiante e = new Estudiante();
		e.setNombre("Marcos");
		e.getCursos().add(c);
		e.getCursos().add(c1);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Jorge");
		e1.getCursos().add(c);
		e1.getCursos().add(c1);
		e1.getCursos().add(c3);
		
		Estudiante e2 = new Estudiante();
		e2.setNombre("Pablo");
		e2.getCursos().add(c1);
		
		
		/**
		 * Insertar en las tablas correspondientes:
		 * Tablas => Estudiante
		 * 		  => Curso	
		 * 		  => cursos_estudiantes; tabla intermedia
		 */
		ecDao.crearRelacionEstudianteCurso(e);
		ecDao.crearRelacionEstudianteCurso(e1);
		ecDao.crearRelacionEstudianteCurso(e2);
		
		
		/**
		 * Obtener un objeto Estudiante y todos sus cursos
		 * 
		 */
		Long id = 13L; //Debe ser un id de sus tabla
		Estudiante resultado = ecDao.obtenerEstudianteCursoPorId(id);
		System.out.println("Estudiante obtenido: " + resultado);
		System.out.println("Listado de cursos por estudiante: ");
		resultado.getCursos().forEach(System.out::println);
		
		/**
		 * Obtener un objeto Curso y todos sus estudiantes
		 * 
		 */
		id = 8L; //Debe ser un id de sus tabla
		Curso cResultado = ecDao.obtenerCursoPorId(id);
		System.out.println("Curso obtenido: " + cResultado);
		System.out.println("Listado de estudiantes por curso: ");
		cResultado.getEstudiantes().forEach(System.out::println);
	}

}
