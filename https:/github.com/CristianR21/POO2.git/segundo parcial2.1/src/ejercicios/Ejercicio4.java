package ejercicios;
/**************
 * 
 * Autor: Cristian Adair Ramirez Rodriguez
 * 
 * 
 * Fecha de creacion: 04/04/2022
 * 
 * 
 * Fecha de modificacion:06/04/2022
 * 
 * 
 * Descripcion:calcular suma_resta_division_mulitplicacion
 * 
 * 
 */
public class Ejercicio4 {
	private double a;
	private double b;
	
	

	public double sumar() {

		return a + b;

	}
	
	public double restar() {

		return a - b;

	}
	
	public double multiplicar() {

		return a * b;

	}
	
	public double dividir() {

		return a / b;

	}
	
	
	public void getResultados() {
		
		System.out.println("la suma de " + a + "+" + b + "=" + this.sumar());
		System.out.println("la resta de " + a + "-" + b + "=" + this.restar());
		System.out.println("la multiplicacion de " + a + "*" + b + "=" + this.multiplicar());
		System.out.println("la divicion de " + a + "/" + b + "=" + this.dividir());
		
	}
	//getters & setters
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
	

}