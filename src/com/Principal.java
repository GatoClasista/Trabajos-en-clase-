package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese el apellido: ");
		String apellido = sc.nextLine();
		System.out.print("Ingrese la cédula: ");
		String cedula = sc.nextLine();
		Usuario us1 = new Usuario(nombre, apellido, cedula);

		System.out.print("Ingrese el servicio: ");
		String servicio = sc.nextLine();
		us1.generarServicio(servicio);
		us1.AsignarCubiculo();
		System.out.println();

		us1.mostrarInfo();
		sc.close();

	}

}
