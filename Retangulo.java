
public class Retangulo {

	public double altura;
	public double largura;

	public double area() {

		double area = this.altura * this.largura;

		return area;
	}

	public double perimetro() {
		
		double perimetro = 2 * (this.altura * this.largura);
		
		return perimetro;
	}
	
	public double diagonal() {
		
		double diagonal = Math.sqrt((this.altura * this.altura) + (this.largura * this.largura));
				
		return diagonal;
	}
}
