package pruebas;
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
 * Descripcion: conversion de Kb a Mb y Mb a Kb
 * 
 * 
  */
public class Conversor{
			double Kb, Mb;

		public double convertirKb(double cantidad) {

			return (cantidad * 0.001);

		}

		public double convertirMb(double cantidad1) {

			return cantidad1 * 1000;

		}

		public double getKb() {
			return Kb;
		}

		public void setKb(double kb) {
			Kb = kb;
		}

		public double getMb() {
			return Mb;
		}

		public void setMb(double mb) {
			Mb = mb;
		}
		
	}

