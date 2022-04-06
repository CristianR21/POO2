package ejercicios;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Multiplicar m = new Multiplicar();
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese el primer numero");
		m.setA(entrada.nextDouble());
		System.out.println("ingrese el seegundo numero");
		m.setB(entrada.nextDouble());

		m.multiplicar();

		System.out.println(m);

		entrada.close();

	}

}