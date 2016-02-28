package com.javaVet.controller;

import java.util.Scanner;

import com.javaVet.model.Animal;
import com.javaVet.model.Clinica;
import com.javaVet.model.Veterinario;

public class Controlador {

	private static Clinica clinica = new Clinica("javaVet",20);
	
	private static Scanner input = new Scanner(System.in);
	
	public static String leerAccion(){
		String interaccion = input.nextLine();
		return interaccion;
	}
	
	public static Clinica getClinica(){
		return Controlador.clinica;
	}

	public static void listarVeterinarios(){
		int numeroHumano = 1;
		for (int i = 0; i < clinica.getVeterinarios().length ; i++) {
			System.out.println(numeroHumano + ". " + clinica.getVeterinarios()[i].getNombre());
			numeroHumano++;
		}
		
	}

	public static void vetScreen(int vet_id){
		Veterinario veterinarioActual = clinica.getVeterinarios()[vet_id - 1];
		System.out.println("Bienvenido " + veterinarioActual.getNombre());
		System.out.println("Desea:");
		System.out.println("1. Dar de alta animal.");
		System.out.println("2. Nueva consulta.");
		System.out.println("V. Volver.");
		String accion = Controlador.leerAccion();
		if(accion.equals("1")){
			Controlador.altaAnimal();
		} else if (accion.equals("2")){
			System.out.println("Ir a crear consulta");
		}
	}
	
	public static void altaAnimal(){
		String tipo = "";
		System.out.println("Nombre:");
		String nombre = Controlador.leerAccion();
		System.out.println("Tipo (Perro, Gato, Conejo):");
		do{
			tipo= Controlador.leerAccion();
		}while(!tipo.equals("Perro") && !tipo.equals("Gato") && !tipo.equals("Conejo"));
		System.out.println("Raza");
		String raza = Controlador.leerAccion();
		System.out.println("Edad");
		int edad = Integer.parseInt(Controlador.leerAccion());
		Animal nuevoAnimal = new Animal(nombre, tipo, raza, edad);
		clinica.addAnimal(nuevoAnimal);
		clinica.listarAnimales();
	}
	
	public static void cambiarSeccion(String accionUsuario) {
		
		
		if(accionUsuario.equalsIgnoreCase("v")){
			
		} else {
			int vet = Integer.parseInt(accionUsuario);
			Controlador.vetScreen(vet);
		}
		
	}
}
