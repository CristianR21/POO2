package ejercicios;
import java.util.Scanner;
public class Main7 {

	public static Factura factura;
	public static Scanner e;
	
	
	public static void main(String[] args) {
		
		e = new Scanner(System.in);
		
		System.out.println("ingrese la base para generar su factura");
		double base = e.nextDouble();
		
		factura = new Factura();
		
		factura.setBase(base);
		
		factura.getTotalFactura();
		
		
		
	}

}