import java.util.Scanner;

public class Ex2Funcionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario F = new Funcionario();

			System.out.println("Qual seu nome?");
			F.nome = sc.nextLine();
			System.out.println("Qual � o seu sal�rio?");
			F.salario = sc.nextDouble();

			System.out.println("Informa��es do funcion�rio: Nome:" + F.nome + "---- Sal�rio: R$" + F.salario);
			
			System.out.println("Qual a taxa de imposto?");
			F.imposto = sc.nextDouble();
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("Com quanto de taxa ser� o imposto? " + F.imposto);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Atualiza��o das informa��es: Nome:" + F.nome + "---- Sal�rio: R$" + F.salarioUp());

			
		
		sc.close();
	}
}