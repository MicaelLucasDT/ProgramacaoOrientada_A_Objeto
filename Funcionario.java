
public class Funcionario {

	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioUp() {
		
		double upload1 = (imposto * salario) /100;
		double upload = upload1 + this.salario;
		
		return upload;
	}
	
	
	
}
