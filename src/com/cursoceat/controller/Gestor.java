package com.cursoceat.controller;

public class Gestor {

public String nombreGestor;
private String telefono;
double importeMax;
//constructor con todos los atributos
public Gestor(String nombreGestor, String telefono, double importeMax) {
	this.nombreGestor = nombreGestor;
	this.telefono = telefono;
	this.importeMax=importeMax;
}

//constructor con solo nombre y telefono
	public Gestor(String nombreGestor, String telefono) {
	this.nombreGestor = nombreGestor;
	this.telefono = telefono;
	this.importeMax=1000; //establecemos una cantidad porque en este constructor no viene dado el dato
}
//metodo getter para consultar el telefono
public String getTelefono() {
	return telefono;
}

	void mostrarInfoGestor() {
	System.out.println("Nombre: "  + this.nombreGestor);
	System.out.println("Telefono: "+ this.telefono);
	System.out.println("Importe: " + this.importeMax+"€");
}






}
