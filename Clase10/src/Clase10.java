import java.util.Scanner;

public class Clase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cual es el limite que queres?");
		Scanner sc = new Scanner(System.in);
		int Tope = sc.nextInt();
		int a = 1;
		int b = 1;
		int c = (a + b);
		int suma = 3;
		int contador = 0;

		System.out.println(b);
		System.out.println(c);
		do {

			a = b;
			b = c;
			c = (a + b);
			suma += c;

			contador++;

			System.out.println(c);

		} while (contador < Tope);

		System.out.println("La suma de esta basura es: " + suma);

	}// Aca ermina el main

}// Aca termina la clase
