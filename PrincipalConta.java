package POO.ContaBancaria;

import java.util.Scanner;

public class PrincipalConta {

	public static void main(String[] args) {

		
		
		
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Insira o número da conta: ");
		conta.setNumero(sc.nextInt()) ;

		System.out.println("Insira seu nome: ");
		conta.setNome(sc.next());
		
		System.out.println("Insira seu sobrenome: ");
		conta.setSobreNome(sc.next());
	
		String continua;
		
		do{	
		
		System.out.println("Qual sua idade? ");
		conta.setIdade(sc.nextInt());
		
			if(conta.getIdade() < 18) {
				
				System.out.println("Perdão, mas você é novo demais para criar uma conta bancária... É necessário ter 18 anos ou mais!");
			}
			}while(conta.getIdade() < 18);
			
		
		
		System.out.println("Quer realizar um depósito inicial? S/N ");
		continua = sc.next().toUpperCase();
		
		switch (continua) {
		case "S":
			System.out.println("==========================================================");
			System.out.println("Qual o valor do depósito? ");
			double saldo = sc.nextDouble();
			conta.setSaldo(saldo);
			System.out.println("Informações: ");
			System.out.println(conta);
			
			break;

		case "N": 
			System.out.println("==========================================================");
			System.out.println("Informações: ");
			System.out.println(conta);
			
		default:
			break;
		}
			
		System.out.println("==========================================================");
		System.out.println("Quantas movimentações a mais você deseja realizar na conta?");
		int mov = sc.nextInt();
		
		for(int i = 1; i <= mov ; i++) {
			System.out.println("==========================================================");
			System.out.println("Qual o tipo de movimento? Depósito ou saque? 1/2 ");
			int tipo = sc.nextInt();
			
			if(tipo == 1) {
				System.out.println("Qual o valor do depósito? ");
				 double depos = sc.nextDouble();
				 double upDep = depos + conta.deposito();
				 conta.setSaldo(upDep);
				 System.out.println("informações da conta: ");
				 System.out.println(conta);
				 
			}else {
				
				System.out.println("Qual o valor do saque? ");
				double saque = sc.nextDouble();
				double upSaque = conta.deposito() - saque - 5;
				conta.setSaldo(upSaque);
				System.out.println("informações da conta: ");
				System.out.println(conta);
				
			}
			
		}
		
		
		sc.close();
	}

}
