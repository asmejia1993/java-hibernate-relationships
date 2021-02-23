package com.hn.aduanas.proyectomaven;

import com.hn.aduanas.proyectomaven.dao.FotoDao;
import com.hn.aduanas.proyectomaven.dao.PersonaDao;
import com.hn.aduanas.proyectomaven.dto.Foto;
import com.hn.aduanas.proyectomaven.dto.Persona;

public class FotoEjecucionMain {

	public static void main( String[] args ) {
		
		//Inicializacion de la clase Dao
		FotoDao fDao = new FotoDao();
		PersonaDao pDao = new PersonaDao();
		
		
		/**
		 * Crear una nueva foto
		 */
		 Foto f = new Foto("Cascada", "Cascada de La Fortuna");
		 Persona p = pDao.obtenerPersona(40L);  //Debe existir un id en su tabla persona
		 f.setPersona(p);
		 System.out.println("Nueva foto ingresada" + fDao.nuevaFoto(f));
		 
		 
		 /**
		  * Actualizar una foto
		  */
		 Long idFoto = 9L; //Debe existir un id en su tabla foto
		 Foto fActualizada = fDao.obtenerFoto(idFoto);
		 System.out.println("Foto antes de actualizar: " + fActualizada);
		 fActualizada.setDescripcion("Cascada de Jiniguare");
		 System.out.println("Foto despues de actualizar: " + fDao.actualizaFoto(fActualizada));
		
	} 
	
}
