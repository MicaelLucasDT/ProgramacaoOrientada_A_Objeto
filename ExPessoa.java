package POO.Pessoa;

import java.util.Scanner;


public class ExPessoa {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Pessoa P = new Pessoa();
	
	System.out.println("Insira seu nome: ");
	P.nome = sc.nextLine();
	System.out.println("Insira seu sobrenome!");
	P.sobrenome = sc.next();
	System.out.println("Qual sua data de nascimento?");
	P.AnoDeNascimento = sc.nextInt();
	
	System.out.println("Se nome �: " + P.nome + " " +  P.sobrenome);
	System.out.println("Voc� nasceu na data: " + P.AnoDeNascimento);
	System.out.println("Vov� t�m " + P.idade() + " anos.");
	
	sc.close();
	}
	
}
