package com.cursoceat.controller;


public class CuentaCorriente {
Gestor miGestor;	//gestor que administra la cuenta
public String nombre;//se puede usar en cualquier parte
String dni;//lo puede usar las clases vecinas
private double saldo;//solo se puede usar en esta clase
static private String nombreBanco="International Java Bank";//solo se puede usar en esta clase y cuando lo asignes no cambia
//metodo get y set de nombre de banco
public static String getNombreBanco() {
		return nombreBanco;
	}
public static void setNombreBanco(String nombreBanco) {
	CuentaCorriente.nombreBanco = nombreBanco;
}
//1ºconstructor
	public CuentaCorriente(String nombre, String dni) {
	this.nombre = nombre;
	this.dni = dni;
}
	//2º constructor
		public CuentaCorriente(String dni, double saldo) {
			this.dni = dni;
			this.saldo = saldo;
			this.nombre="Sin definir";
		}
		//3ºconstructor
		public CuentaCorriente(String nombre, String dni, double saldo) {
			this.nombre = nombre;
			this.dni = dni;
			this.saldo = saldo;
		}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//asignar un nuevo objecto gestor a la cuenta
	void setGestor(Gestor miGestor) {
		this.miGestor=miGestor;
	}
	boolean egreso(double cant) {
		boolean operacionPosible;
		if (saldo>=cant) {
			saldo-=cant;
			System.out.println("Tu nuevo saldo es: "+saldo+ "€");
			operacionPosible=true;
		}else {
			System.err.println("No tiene saldo suficiente ");
			operacionPosible= false;
		}
		return operacionPosible;
	}
	void ingreso(double cant) {
	saldo += cant;
	System.out.println("Tu nuevo saldo es: "+ saldo + "€");
}

	
	void mostrarInformacion() {
		if (miGestor==null) {
			System.out.println("No tiene gestor asignado esta cuenta ");
		}else {
			System.out.println("Datos del gestor -->");
		miGestor.mostrarInfoGestor();
		}
		
		
		//mostramos informacion de la cuenta
	System.out.println("Nombre: "+ nombre);
	System.out.println("Dni: "+ dni);
	System.out.println("Saldo: "+ saldo + "€");
}
	
	
}
