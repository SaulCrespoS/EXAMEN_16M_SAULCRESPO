package examen;
import java.util.Scanner;

public class Numero_Primo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		String divisores;
		System.out.println("Buenos días CEINMARK, soy Saul Crespo");
		do {
			try {
				System.out.print("Introduce un numero para saber si es primo o no: ");
				num = Integer.parseInt(scan.nextLine());
				divisores = isPrimoYDivisores(num);
				System.out.println((divisores.isEmpty())? "El número " + num + " es primo.":"El número " + num + " no es primo. " + 
							"\nLos divisores de " +  num + "son: " +
							"\n" + divisores);
				run = false;
			} catch (NumberFormatException e) {
				System.out.println("Por favor, introduzca un número entero válido.");
			}
		} while(run);
		System.out.println("Hasta pronto!");
		scan.close();
	}
	
	public static String  isPrimoYDivisores(int numero) {
		int num2 = numero - 1;
		String divisores = "";
		do  {
			if (numero % num2 == 0) {
				divisores += num2 + ",";
			}
			num2--;
		} while (num2 > 1);
		return divisores;
	}
}
