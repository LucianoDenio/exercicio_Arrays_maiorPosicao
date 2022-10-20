package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double bigger = 0.0;
		int position = 0;
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i] > bigger) {
				bigger = vect[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", bigger);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		
		
		sc.close();

	}

}
