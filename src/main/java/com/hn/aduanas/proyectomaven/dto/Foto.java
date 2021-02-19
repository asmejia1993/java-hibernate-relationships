package com.hn.aduanas.proyectomaven.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "foto", schema = "dbtest")
public class Foto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tipoPaisaje;
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personaId", referencedColumnName = "id")
	private Persona persona;
	
	
	public Foto() {
		
	}

	/**
	 * @param tipoPaisaje
	 * @param descripcion
	 */
	public Foto(String tipoPaisaje, String descripcion) {
		this.tipoPaisaje = tipoPaisaje;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoPaisaje() {
		return tipoPaisaje;
	}

	public void setTipoPaisaje(String tipoPaisaje) {
		this.tipoPaisaje = tipoPaisaje;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Informacion del Objeto de tipo Foto: id=" + id + ", tipoPaisaje=" + tipoPaisaje + ", descripcion=" + descripcion + ", persona="
				+ persona + "]";
	}
	
	
	
	
}
