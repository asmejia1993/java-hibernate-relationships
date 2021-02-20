package com.hn.aduanas.proyectomaven.dao;

import org.hibernate.Session;

import com.hn.aduanas.proyectomaven.connection.HibernateConnectionUtils;
import com.hn.aduanas.proyectomaven.dto.Curso;
import com.hn.aduanas.proyectomaven.dto.Estudiante;

/*
 * 
 */
public class EstudianteCursoDao {
	
	private Session session;
	private Estudiante e = new Estudiante(); 
	private Curso c = new Curso();

	/**
	 * Metodo para guardar Relacion N:M entre Estudiante|Curso
	 * @param Estudiante e
	 */
	public void crearRelacionEstudianteCurso(Estudiante e) {
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			session.save(e);
			session.beginTransaction().commit();
			
		} catch (Exception e2) {
			System.out.println("Hubo un error en el metodo crearRelacionEstudianteCurso: " + e);
		} finally {
			HibernateConnectionUtils.close(session);
		}
	}
	
	/**
	 * Obtener Estudiante por id
	 */
	public Estudiante obtenerEstudianteCursoPorId(Long id) {
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			e = session.get(Estudiante.class, id);
			//e.getCursos().forEach(System.out::println);
		} catch (Exception e2) {
			System.out.println("Hubo un error en el metodo obtenerEstudianteCursoPorId: " + e);
		} finally {
			HibernateConnectionUtils.close(session);
		}
		return e;
	}
	
	/**
	 * Obtener Estudiante por id
	 */
	public Curso obtenerCursoPorId(Long id) {
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			c = session.get(Curso.class, id);
			//e.getCursos().forEach(System.out::println);
		} catch (Exception e2) {
			System.out.println("Hubo un error en el metodo obtenerEstudianteCursoPorId: " + e);
		} finally {
			HibernateConnectionUtils.close(session);
		}
		return c;
	}
	
}
