package com.cursoceat.controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mi objeto 1 mi Cta
		System.out.println("Indique el nombre ");
		String nombre=new Scanner(System.in).nextLine();
		System.out.println("Indique el DNI ");
		String miDni=new Scanner(System.in).nextLine();	
	CuentaCorriente miCta=new CuentaCorriente(nombre, miDni);
	//pregunto el importe a ingresar
	System.out.println("¿Cuánto quieres ingresar? ");
	double miIngreso=new Scanner(System.in).nextDouble();
	//actualiza el saldo
	miCta.ingreso(miIngreso);
	//pregunto el nombre del banco
	System.out.println("Nombre del banco");
	CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
	//pregunto el importe a retirar
	System.out.println("¿Cuánto quieres sacar? ");
	double miEgreso=new Scanner(System.in).nextDouble();
//actualizamos el saldo
	miCta.egreso(miEgreso);
//creamos el gestor1
	Gestor miGestor1=new Gestor("Jose Luis Valcarcel", "70484848q");
	miCta.miGestor=miGestor1;
	//mostramos la informacion
	
	miCta.mostrarInformacion();
	//creo mi objeto 2 miCta2
	System.out.println("---------Creo objecto 2-----------");
	System.out.println("Escriba el dni");
	miDni=new Scanner(System.in).nextLine();
	System.out.println("Indique el saldo inicial al crear la cuenta");
	Double saldoInicial=new Scanner(System.in).nextDouble();
	CuentaCorriente miCta2=new CuentaCorriente(miDni, miIngreso);
	System.out.println("Escriba el nombre");
	miCta2.nombre=new Scanner(System.in).nextLine();
	//creo mi gestor 2
	Gestor miGestor2=new Gestor("Beatriz López", "609059595p");
	miCta.miGestor=miGestor2;
	System.out.println("Datos de la cuenta 1");
	miCta.mostrarInformacion();
	System.out.println("Datos de la cuenta 2");
	miCta2.mostrarInformacion();
	
	
	}

}
