package com.hn.aduanas.proyectomaven;



import java.util.List;
import java.util.Optional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hn.aduanas.proyectomaven.connection.HibernateConnectionUtils;
import com.hn.aduanas.proyectomaven.dao.FotoDao;
import com.hn.aduanas.proyectomaven.dao.PersonaDao;
import com.hn.aduanas.proyectomaven.dao.UsuarioDao;
import com.hn.aduanas.proyectomaven.dto.Foto;
import com.hn.aduanas.proyectomaven.dto.Persona;
import com.hn.aduanas.proyectomaven.dto.Usuario;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
    	/*
    	 * Declaracion ed variables DAO
    	 */
    	PersonaDao pDao = new PersonaDao();
    	FotoDao fDao = new FotoDao();
    	UsuarioDao uDao = new UsuarioDao();
    
    	/*
    	 * Crear la session de conexion a la base de datos
    	 */
		/*
		 * StandardServiceRegistry ssr = new
		 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		 * 
		 * SessionFactory factory = meta.getSessionFactoryBuilder().build(); Session
		 * session = factory.openSession(); Transaction t = session.beginTransaction();
		 */
		
    	//Session session = HibernateConnectionUtils.getOpenSession();
    	
		/*
		 * Crear o insertar una persona
		 */

		
		//pDao.nuevoUsuario(u);
		

	
		//System.out.println("Persona con id: " + p.getId());
		//System.out.println(pDao.obtenerPersona(p.getId()));
		
		
		//List<Persona> p1 = pDao.obtenerMultiplesPersonas();
		//p1.forEach(System.out::println);
		
		
		
		/*
		 * Insertar una nueva foto
		 */
		/*
		 * Foto f = new Foto("Bosque", "Una excelente foto"); Persona p2 =
		 * pDao.obtenerPersona(40L); f.setPersona(p2);
		 * System.out.println("Foto ingresada: ");
		 * //System.out.println(fDao.nuevaFoto(f));
		 */		  
		  //Pendiente de mostrar metodo
		  
		  
//		  Foto f1 = new Foto("Oceano", "Una excelente foto"); 
//		  f.setPersona(p2);
//		  System.out.println("Foto ingresada: ");
//		  System.out.println(fDao.nuevaFoto(f1));
		 
		
		/*
		 * Actualizar una foto
		 */
//    	Persona p2 = pDao.obtenerPersona(39L);
//		Foto f2 = new Foto("Bosque actualizado por id #4", "Una excelente foto actualizado");
//		f2.setId(4L);
//		f2.setPersona(p2);
//		
//		System.out.println("Foto actualizada: ");
//		System.out.println(fDao.actualizaFoto(f2));
		
		
		
		/*
		 * Obtener todas las fotos por persona
		 */
		//Tarea
    	//Persona p2 = pDao.obtenerPersona(40L);
    	//System.out.println(p2);
		
    	
    	
    	/*
    	 * Crear relacion de  Uno a Uno Persona => Usuario
    	 * Verificar metodo toString
    	 * 
    	 */
//		Persona p = new Persona("pruaba test#2 1 a 1", "email@test.coom", 24);
//		Usuario u = new Usuario("pruebaTestUser#2");
//		
//		p.setUsuario(u);
//		Persona pResultado = pDao.nuevaPersona(p);
//		
//		System.out.println("Persona creada con usuario");
//		System.out.println(pDao.obtenerPersona(pResultado.getId()));
		
		
		/*
		 * Obtener un usuario
		 */
		Usuario u = uDao.obtenerUsuario(2L);
		System.out.println("Usuario obtenido: " + u);
		

		/*
		 * Actualizar un usuario
		 */
		u.setNombreUsuario("pruebaActualizadaTest#2");
		System.out.println("Usuario actualizado: " + uDao.actualizarUsuario(u));
		
		
		/*
		 * Buscar una persona por id
		 */
//		Persona pEncontrada = session.find(Persona.class, id);
//		System.out.printf("Persona encontrada con id: %s\n", id);
//		System.out.println(pEncontrada);
		
		/*
		 * Actualizar un objeto de tipo persona
		 */
//		p.setNombre("Persona pruena actualizada");
//		session.update(p);
//		System.out.println("Persona ha sido actualizada\n");
//		System.out.println(p);
		
		/*
		 * Eliminar una persona
		 */
//		session.delete(p);
//		System.out.printf("Persona ha sido removida con id: %s\n", id);
//		pEncontrada = session.find(Persona.class, id);
//		System.out.println(pEncontrada);
		
		/*
		 * Obtener persona por id
		 */
		//Long idBusqueda = 2L;
		//pEncontrada = session.get(Persona.class, idBusqueda);
		//System.out.println("Obtener una persona por id: " + idBusqueda);
		//System.out.println(pEncontrada);
		
		/*
		 * Obtener todos los registros
		 */
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<Persona> criteria = builder.createQuery(Persona.class);
//		criteria.from(Persona.class);
//		List<Persona> personas = session.createQuery(criteria).getResultList();
//		System.out.println("Imprimiendo todos los registros de la tabla Persona:");
//		personas.forEach(System.out::println);
		
		/*
		 * Opcion #2
		 * Obtener todos lo registros:
		 * Forma #1 => List<Persona> personas1 = session.createQuery("from Persona", Persona.class).getResultList();
		 * Forma #2 => List<Persona> personas1 = session.createQuery("from Persona", Persona.class).list();
		 */
//		List<Persona> personas1 = session.createQuery("from Persona", Persona.class).list();
//		personas1.forEach(System.out::println);
		
		/*
		 * Obtener registros con where
		 * Haciendo uso del optional para evitar posibles valores nulos
		 */
//		Long idOp = 100L;
//		Optional<Query> query = Optional.of(session.createQuery("Select p from Persona p WHERE p.id = :idPersona").setParameter("idPersona", idOp));
//		if (query.isPresent()) {
//			System.out.println("Dentro del optional");
//			System.out.println(query.get().getResultList());
//		} else {
//			System.out.println("No existe registro con valor: " + idOp);
//		}
		
		
		/*
		 *  1. Encapsulamos nuestra conexion
		 *  2. DTO persona
		 *  3. Creanos un dao
		 * 	4
		 * 
		 * 
		 */

		
		
//		t.commit();  
//		
//		factory.close();
//		session.close();
		
		
	//HibernateConnectionUtils.close();
    }
}
