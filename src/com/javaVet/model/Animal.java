package com.javaVet.model;

import java.util.ArrayList;

public class Animal {
	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String motivoConsulta;
	private static ArrayList<Consulta> consultas = new ArrayList();
	
	public Animal(String nombre, String tipo, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getMotivoConsulta() {
		return motivoConsulta;
	}
	
	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
	
	public void addConsulta(Consulta consulta){
		Animal.consultas.add(consulta);
	}
	
}
