package com.example.myapp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperatura {
	@Id
	@GeneratedValue
	private Long id;

	private Date fecha;

	private int grados;

	public Temperatura() {
	}

	public Temperatura(int grados) {
		this.fecha = new Date();
		this.setGrados(grados);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getGrados() {
		return grados;
	}

	public void setGrados(int grados) {
		this.grados = grados;
	}
}
