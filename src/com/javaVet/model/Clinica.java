package com.javaVet.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Clinica {
	private static String nombre;
	private static int mascotasMaximas;
	private static int mascotasAtendidas;
	private static Veterinario[] veterinarios = new Veterinario[5];
	private static ArrayList<Animal> animales = new ArrayList();
	
	public Clinica(String nombre, int mascotasMaximas) {
		super();
		Clinica.nombre = nombre;
		Clinica.mascotasMaximas = mascotasMaximas;
		Clinica.rellenarVeterinarios();
	}

	public static int getMascotasAtendidas() {
		return Clinica.mascotasAtendidas;
	}

	public static void setMascotasAtendidas(int mascotasAtendidas) {
		Clinica.mascotasAtendidas = mascotasAtendidas;
	}

	public static String getNombre() {
		return Clinica.nombre;
	}

	public static int getMascotasMaximas() {
		return Clinica.mascotasMaximas;
	}
	
	private static void rellenarVeterinarios(){
		Clinica.veterinarios[0] = new Veterinario("Dr. Super Mario");
		Clinica.veterinarios[1] = new Veterinario("Dr. Donkey Kong");
		Clinica.veterinarios[2] = new Veterinario("Dr. Pacman");
		Clinica.veterinarios[3] = new Veterinario("Dra. Miss Pacman");
		Clinica.veterinarios[4] = new Veterinario("Dr. Solid Snake");
	}

	public static Veterinario[] getVeterinarios() {
		return Clinica.veterinarios;
	}
	
	public static void addAnimal(Animal animal){
		Clinica.animales.add(animal);
	}
	
	public static void listarAnimales(){
		for (Iterator<Animal> iterator = animales.iterator(); iterator.hasNext();) {
			Animal animal = (Animal) iterator.next();
			System.out.println("<====" + animal.getNombre() + "====>"); 
			System.out.println("Tipo:" + animal.getTipo());
			System.out.println("Raza:" + animal.getRaza());
			System.out.println("Edad:" + animal.getEdad());
		}
	}

	
}
