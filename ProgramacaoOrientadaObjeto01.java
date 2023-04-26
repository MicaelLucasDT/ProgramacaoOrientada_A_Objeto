import java.util.Scanner;
import java.text.DecimalFormat;

public class ProgramacaoOrientadaObjeto01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Insira os lados do trinângulo 1------------------------------------");
		x.a = sc.nextInt();
		x.b = sc.nextInt();		
		x.c = sc.nextInt();
		
		System.out.println("Insira os lados do trinângulo 2------------------------------------");
		y.a = sc.nextInt();
		y.b = sc.nextInt();
		y.c = sc.nextInt();
		
		int P1 = x.a + x.b + x.c /2;
		int P2 = y.a + y.b + y.c /2;
		
		double valor = P1 * (P1 - x.a) * (P1 - x.b) * (P1 - x.c);
		double valor2 = P2 * (P2 - y.a) * (P2 - y.b) * (P2 - y.c);
		
		double raiz = Math.sqrt(valor);
		double raiz2 = Math.sqrt(valor2);
		
		System.out.println("A área do primeiro triângulo é: " + df.format(raiz));
		System.out.println("A área do primeiro triângulo é: " + df.format(raiz2));
		
		if(raiz > raiz2) {
			
			System.out.println("A área do primeiro triangulo é maior!");
			
		}else {
			
			System.out.println("A área do segundo triangulo é maior!");
		}
		
		
		sc.close();
	}

}