package ejercicios;
/**************
 * 
 * Autor: Cristian Adair Ramirez Rodriguez
 * 
 * 
 * Fecha de creacion: 04/04/2022
 * 
 * 
 * Fecha de modificacion:
 * 
 * 
 * Descripcion: conversion de dolores a pesos y pesos a dolares 
 * 
 * 
 */
public class Conversion {
	double pesos, dolares;

	public double convertirPesos(double cantidad) {

		return (cantidad * 0.05);

	}

	public double convertirDolares(double cantidad) {

		return cantidad * 20;

	}

	// getters &setters
	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

}
