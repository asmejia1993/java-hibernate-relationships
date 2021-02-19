package com.hn.aduanas.proyectomaven;

import java.util.List;

import com.hn.aduanas.proyectomaven.dao.PersonaDao;
import com.hn.aduanas.proyectomaven.dto.Persona;
import com.hn.aduanas.proyectomaven.dto.Usuario;

public class PersonaEjecucionMain {

	public static void main( String[] args ) {
		
		/**
		 * Instanciar clase Dao
		 */
		PersonaDao pDao = new PersonaDao();
		
		/**
		 * Crear una nueva persona
		 */
		Persona p = new Persona("pruaba test#2 1 a 1", "email@test.coom", 24);
		System.out.println("Objeto de tipo persona creada: " + pDao.nuevaPersona(p));
		
		/**
		 * Obtener una persona
		 */
		System.out.printf("Persona obtenida con id: %s es igual a: ", p.getId());
		System.out.println(pDao.obtenerPersona(p.getId()));
		
		
		/**
		 * Obtener todas las personas
		 */
		List<Persona> personas = pDao.obtenerMultiplesPersonas();
		personas.forEach(System.out::println);
		
		
		
		/**
		 * Crear relacion 1 a 1 entre persona y usuario 
		 */
		Persona p2 = new Persona("pruaba test#2 1 a 1", "email@test.coom", 24);
		Usuario u = new Usuario("pruebaTestUser#2");
		
		p2.setUsuario(u);
		Persona pResultado = pDao.nuevaPersona(p2);
		
		System.out.println("Persona creada con usuario");
		System.out.println(pDao.obtenerPersona(pResultado.getId()));
		
		/**
		 * Por favor completar el metodo encontrar persona
		 */
//		Persona pEncontrada = session.find(Persona.class, id);
//		System.out.printf("Persona encontrada con id: %s\n", id);
//		System.out.println(pEncontrada);
		
		/**
		 * Por favor completar el metodo actualizar persona
		 */
//		p.setNombre("Persona pruena actualizada");
//		session.update(p);
//		System.out.println("Persona ha sido actualizada\n");
//		System.out.println(p);
		
		
		
		/**
		 * Por favor completar el metodo eliminar una persona
		 */
//		session.delete(p);
//		System.out.printf("Persona ha sido removida con id: %s\n", id);
//		pEncontrada = session.find(Persona.class, id);
//		System.out.println(pEncontrada);
	}
}
