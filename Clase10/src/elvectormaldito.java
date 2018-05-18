import java.util.Scanner;

public class elvectormaldito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] var = new int[10];
		int may = 0;
		
		cargarVector(var);

		for (int i = 0; i < var.length; i++) {
			may = sacarElMasAlto(var[i], may);
		}

		System.out.println("El mayor es: " + may);

	}//aca termina el metodo main

	public static int sacarElMasAlto(int i, int may) {
		if (may < i) {
			may = i;
		}

		return may;
	}//aca termina el metodo que saca el mas alto - MEJORAR!!!
	
	public static void cargarVector(int var[]) {

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < var.length; i++) {
			//cosas para cargar el vector
			System.out.println("Ingrese un elemento: ");
			var[i]=sc.nextInt();
		}
	}//aca termina el metodo que carga un vector
	
}//aca termina la clase elvectormaldito
