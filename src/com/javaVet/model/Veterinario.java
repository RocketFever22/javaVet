package com.javaVet.model;

public class Veterinario extends Usuario{
	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public Veterinario(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
