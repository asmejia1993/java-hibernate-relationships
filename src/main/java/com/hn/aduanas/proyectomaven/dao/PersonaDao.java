package com.hn.aduanas.proyectomaven.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hn.aduanas.proyectomaven.connection.HibernateConnectionUtils;
import com.hn.aduanas.proyectomaven.dto.Persona;


public class PersonaDao {

	
	private Session session;
	SessionFactory sessionFactory;
	private Persona persona = new Persona();
	
	/**
	 * Metodo para crear una nueva persona
	 * @param p Persona
	 * @return p
	 */
	public Persona nuevaPersona(Persona p){
		Long id = 0L;
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			id = (Long)session.save(p);
			persona = session.get(Persona.class, id);
			
		} catch (Exception e) {
			System.out.println("Hubo un error, contacte al administrador" + e);
		} finally {
			HibernateConnectionUtils.close(session);
			
		}
		
		return persona;
	}
	
	/**
	 * Metodo para obtener una persona por id
	 * @param id
	 * @return Persona
	 */
	public Persona obtenerPersona(Long id) {
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			persona = session.get(Persona.class, id);
			
		} catch (Exception e) {
			System.out.println("Hubo un error, contacte al administrador: " + e.getMessage());
		} finally {
			HibernateConnectionUtils.close(session);
			
		}
		return persona;
	}
	
	/**
	 * Obtener todos los valores
	 * @return personas
	 */
	public List<Persona> obtenerMultiplesPersonas() {
		List<Persona> personas = new ArrayList<>();
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			personas = session.createQuery("from Persona", Persona.class).getResultList();
		} catch (Exception e) {
			System.out.println("Hubo un error, contacte al administrador: " + e.getMessage());
		} finally {
			HibernateConnectionUtils.close(session);
			
		}
		return personas;
	}
	



}
