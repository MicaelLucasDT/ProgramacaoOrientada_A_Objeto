package POO.ContaBancaria;

import java.util.Scanner;

public class PrincipalConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		int idade;
		
		System.out.println("Insira o número da conta: ");
		int numero = sc.nextInt();

		System.out.println("Insira seu 1° nome: ");
		String nome = sc.next();
		
		
		do{	
		
		System.out.println("Qual sua idade? ");
		idade = sc.nextInt();
		
			if(idade < 18) {
				
				System.out.println("Perdão, mas você é novo demais para criar uma conta bancária... É necessário ter 18 anos ou mais!");
			}
			}while(idade < 18);
		
		
		System.out.println("Quer realizar um depósito inicial? S/N ");
		char continua = sc.next().toLowerCase().charAt(0);  //O "0" é para que o programa leia apenas a primeira posição da resposta do usuário (não é case sensitive!)
		
		if( continua == 's' ) {
			System.out.println("==========================================================");
			System.out.println("Qual o valor do depósito? ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(nome, numero, depositoInicial);
			
		}else {
			conta = new Conta(nome, numero, idade);
		}
		
		System.out.println("Informações: ");
		System.out.println(conta);
		
		System.out.println("==========================================================");
		System.out.println("Quantas movimentações a mais você deseja realizar na conta?");
		int mov = sc.nextInt();
		
		for(int i = 1; i <= mov ; i++) {
			System.out.println("==========================================================");
			System.out.println("Qual o tipo de movimento? Depósito ou saque? 1/2 ");
			int tipo = sc.nextInt();
			
			if(tipo == 1) {
				System.out.println("Qual o valor do depósito? ");
				 conta.deposito(sc.nextDouble());
				
				 System.out.println("informações da conta: ");
				 System.out.println(conta);
				 
			}else {
				
				System.out.println("Qual o valor do saque? ");
				conta.saque(sc.nextDouble());
				
				System.out.println("informações da conta: ");
				System.out.println(conta);
				
			}
			
		}
		
		
		sc.close();
	}

}
