package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Vai depositar algum valor inicial (y/n):");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();							
		System.out.println("Conta Atualizada: ");
		System.out.println("Conta: "+ conta);
		
		System.out.println();
		System.out.print("Valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Conta Atualizada: ");
		System.out.println("Conta: "+ conta);
		
		System.out.println();
		System.out.print("Valor retirada: ");
		double retirada = sc.nextDouble();
		conta.retirada(retirada);
		System.out.print("Conta: "+ conta);
		
		sc.close();
	}

}
