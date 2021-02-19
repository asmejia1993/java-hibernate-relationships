package com.hn.aduanas.proyectomaven.dao;

import java.util.Optional;

import org.hibernate.Session;

import com.hn.aduanas.proyectomaven.connection.HibernateConnectionUtils;
import com.hn.aduanas.proyectomaven.dto.Foto;
import com.hn.aduanas.proyectomaven.dto.Persona;
import com.hn.aduanas.proyectomaven.dto.Usuario;

public class UsuarioDao {
	
	private Usuario usuario = new Usuario();
	private Session session;
	private Optional<Usuario> optUsuario;
	
	/**
	 * Metodo para obtener un usuario por id
	 * @param id
	 * @return Usuario
	 */
	public Usuario obtenerUsuario(Long id) {
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			usuario = session.get(Usuario.class, id);
			
		} catch (Exception e) {
			System.out.println("Hubo un error, contacte al administrador: " + e.getMessage());
		} finally {
			HibernateConnectionUtils.close(session);
			
		}
		return usuario;
	}
	
	/**
	 * Metodo para crear un nuevo objeto de tipo Foto
	 * @param foto Foto
	 * @return foto
	 */
	public Usuario actualizarUsuario(Usuario u){
		try {
			session = HibernateConnectionUtils.getSessionFactory().openSession();
			session.update(u);
			session.beginTransaction().commit();
			usuario = session.get(Usuario.class, u.getId());
			
		} catch (Exception e) {
			System.out.println("Hubo un error en el metodo actualizaFoto: " + e);
		} finally {
			HibernateConnectionUtils.close(session);
		}
		
		return usuario;
	}
	

}
