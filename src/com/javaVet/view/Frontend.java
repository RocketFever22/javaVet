package com.javaVet.view;

import com.javaVet.controller.Controlador;

public class Frontend {

	private static String accionUsuario;
	
	public static void main(String[] args) {

		Interaccion pantalla = new Interaccion();
		
		do {
			
			pantalla.print(Controlador.getClinica().getNombre() + " | Consultas restantes: " 
						   + Controlador.getClinica().getMascotasAtendidas() + "/" 
						   + Controlador.getClinica().getMascotasMaximas());
			pantalla.print("s - Salir");
			Controlador.listarVeterinarios();
			setAccionUsuario(Controlador.leerAccion());
			
			if(!getAccionUsuario().equalsIgnoreCase("s")){
				Controlador.cambiarSeccion(getAccionUsuario());
			}
			
		} while (!getAccionUsuario().equalsIgnoreCase("s"));
		
		pantalla.print("====> GRACIAS POR USAR JAVAVET <====");
		
	}

	public static String getAccionUsuario() {
		return accionUsuario;
	}

	public static void setAccionUsuario(String accionUsuario) {
		Frontend.accionUsuario = accionUsuario;
	}
	
}
