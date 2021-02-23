package com.hn.aduanas.proyectomaven.dao;

import org.hibernate.Session;

import com.hn.aduanas.proyectomaven.connection.HibernateConnectionUtils;
import com.hn.aduanas.proyectomaven.dto.Foto;
import com.hn.aduanas.proyectomaven.dto.Persona;

public class FotoDao {

	
	private Session session;
	private Foto foto;
	
	/**
	 * Metodo para crear un nuevo objeto de tipo Foto
	 * @param foto Foto
	 * @return foto
	 */
	public Foto nuevaFoto(Foto f){
		Long id = 0L;
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			id = (Long)session.save(f);
			foto = session.get(Foto.class, id);
			
		} catch (Exception e) {
			System.out.println("Hubo un error en el metodo nuevaFoto: " + e);
		} finally {
			HibernateConnectionUtils.close(session);
		}
		
		return foto;
	}
	
	/**
	 * Metodo para crear un nuevo objeto de tipo Foto
	 * @param foto Foto
	 * @return foto
	 */
	public Foto actualizaFoto(Foto f){
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			session.update(f);
			session.beginTransaction().commit();
			foto = session.get(Foto.class, f.getId());
			
		} catch (Exception e) {
			System.out.println("Hubo un error en el metodo actualizaFoto: " + e);
		} finally {
			HibernateConnectionUtils.close(session);
		}
		
		return foto;
	}
	
	
	/**
	 * Metodo para obtener una foto por id
	 * @param id
	 * @return Foto
	 */
	public Foto obtenerFoto(Long id) {
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			foto = session.get(Foto.class, id);
			
		} catch (Exception e) {
			System.out.println("Hubo un error en el metodo obtenerFoto, contacte al administrador: " + e.getMessage());
		} finally {
			HibernateConnectionUtils.close(session);
			
		}
		return foto;
	}
	
}
