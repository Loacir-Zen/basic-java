package aula03;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		char sexo;
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Entre com sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Entre com seu salário: ");
		salario = sc.nextDouble();
		
		System.out.println("(F) Feminino ou (M) Masculino:");
		sexo = sc.next().charAt(0);
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Seu salário é: " + salario);
		System.out.println("Seu sexo é: " + sexo);
		
		sc.close();

	}

}
