package aula05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Entre com um valor para x: ");
		
		x = sc.nextInt();
		
		double resultRaiz = Math.sqrt(x);
		double resultElevado = Math.pow(x,2);
		double resultAbsoluto = Math.abs(x);
		
		System.out.println(resultRaiz);
		System.out.println(resultElevado);
		System.out.println(resultAbsoluto);
	
		

	}

}
