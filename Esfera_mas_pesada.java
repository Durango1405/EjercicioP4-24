package Actividad2;
import java.util.Scanner;
public class Esfera_mas_pesada {
public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera A:");
		a = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera B:");
		b = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera C:");
		c = entrada2.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("La esfera A es la de mayor peso");
		}
		else if(b>a&&b>c) {
			System.out.println("La esfera B es la de mayor peso");
		}
		else if(c>a&&c>b) {
			System.out.println("La esfera C es la de mayor peso");
		}
		entrada.close();
		entrada1.close();
		entrada2.close();
}
}
