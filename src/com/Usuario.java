package com;

import java.util.Random;

public class Usuario {

	static int numTurno = 0;
	String nombre;
	String apellido;
	String cedula;
	String servicio;
	int turnoAsig;
	int numCubi;

	public Usuario(String nombre, String apellido, String cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		numTurno++;
		this.turnoAsig = numTurno;
	}

	public void generarServicio(String servicio) {
		this.servicio = servicio;

	}

	public void mostrarInfo() {
		System.out.println("<<<< INFORMACION DEL USUARIO >>>>");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Cédula: " + cedula);
		System.out.println("Servicio: " + servicio);
		System.out.println("Numero de turno: " + numTurno);
		System.out.println("Cubiculo asigando: " + numCubi);

	}

	public void AsignarCubiculo() {
		Random r = new Random();
		numCubi = r.nextInt(5) + 1;
		System.out.println("Cubiculo asigando: " + numCubi);

	}

}
