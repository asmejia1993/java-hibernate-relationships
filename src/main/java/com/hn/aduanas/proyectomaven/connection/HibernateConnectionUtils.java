package com.hn.aduanas.proyectomaven.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConnectionUtils {

	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			
			if (sessionFactory == null) {
				StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
				
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}
			return sessionFactory;
		} catch (Exception e) {
			System.out.println("Hubo un error en metodo buildSessionFactory, contacte al administrador: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	
	public static Session getOpenSession() {
		return getSessionFactory().openSession();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void close(Session currentSession) {
		//sessionFactory.close();
		currentSession.close();
	}
	
	public static void close() {
		sessionFactory.close();
		
	}
	
	public static boolean isOpenConnection() {
		return getOpenSession().isOpen();
	}
}
