import java.util.Scanner;

public class Retangulo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		
		System.out.println("Insira os lados do Retangulo------------------------------------");
		x.altura = sc.nextDouble();
		x.largura = sc.nextDouble();		
		
		System.out.println("A �rea do ret�ngulo �: " + x.area());
		System.out.println("O per�metro do ret�ngulo �: " + x.perimetro());
		System.out.println("A diagonal do tri�ngulo �: " + String.format("%.2f",x.diagonal()));
	
		
		sc.close();
	}

}
