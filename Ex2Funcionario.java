import java.util.Scanner;

public class Ex2Funcionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario F = new Funcionario();

			System.out.println("Qual seu nome?");
			F.nome = sc.nextLine();
			System.out.println("Qual é o seu salário?");
			F.salario = sc.nextDouble();

			System.out.println("Informações do funcionário: Nome:" + F.nome + "---- Salário: R$" + F.salario);
			
			System.out.println("Qual a taxa de imposto?");
			F.imposto = sc.nextDouble();
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("Com quanto de taxa será o imposto? " + F.imposto);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Atualização das informações: Nome:" + F.nome + "---- Salário: R$" + F.salarioUp());

			
		
		sc.close();
	}
}