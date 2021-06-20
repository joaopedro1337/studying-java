 /* Entrada de dados em Java o (leia no Visualg) e (scanf no C). 
 SCANNER: Usa-se em (POO). 
 [COMO ATRIBUIR] : Scanner variavel = new Scanner(System.in);
 
 int x = variavel.nextInt();
 double y = variavel.nextDouble();
 char z = variavel.next().charAt(0);   <-- Char, por pegar 1 caractere, deixa (vazio) e coloca charAt(0), para pegar o first caractere.
 String s = varivel.nextLine();     <-- Ler nome, até a quebra de linha (o gets e fseek do C).
 variavel.close();     <-- Obrigatório sempre fechar, para liberar o recurso. do SCANNER.  */

/* LIMPEAZA DE BUFFER: Quando você for ler um texto até a quebra de linha (nextLine), mas antes o seu programa já leu algum outro dado e
deixou uma quebra de linha pendente. Por exemplo:

System.out.print("Digite sua idade: ");
idade = sc.nextInt();
System.out.print("Digite seu nome completo: ");
sc.nextLine();         <------Limpeza de buffer
nome = sc.nextLine();  <----------- Leia       */

import java.util.Locale; 
import java.util.Scanner;

public class Main {
	
		/* Initial */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner var = new Scanner(System.in);
		
		double salario1, salario2;
		String nome1, nome2;
		int idade;
		char sexo;
		
		System.out.print("Digite o nome da primeira pessoa: ");
			nome1 = var.nextLine();
		System.out.print("Digite o salário da primeira pessoa: ");
		salario1 = var.nextDouble();
		
		System.out.print("Digite o nome da segunda pessoa: ");
			var.nextLine();
			nome2 = var.nextLine();
		System.out.print("Digite o salário da segunda pessoa: ");
			salario2 = var.nextDouble();
		
		System.out.print("Digite uma idade: ");
			idade = var.nextInt();
		System.out.println("Digite um sexo: (F/M)");
			sexo = var.next().charAt(0);
			
		/* SAÍDA DE DADOS */	
			
		System.out.println("Nome 1: " + nome1);
		System.out.println("Salario 1: " + String.format("%.2f", salario1));
    	System.out.println("Nome 2: " + nome2);
		System.out.println("Salario 2: " + String.format("%.2f", salario2));
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		
		var.close(); 	
	}
}
