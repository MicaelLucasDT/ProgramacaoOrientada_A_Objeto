package POO.Pessoa;

import javax.swing.JOptionPane;

public class PessoaComInterface {

	public static void main(String[] args) {

		Pessoa P = new Pessoa();
		
		P.nome = JOptionPane.showInputDialog("Insira seu nome");
		
		P.sobrenome = JOptionPane.showInputDialog("Insira seu sobrenome");
		
		P.AnoDeNascimento = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o Ano em que voc� nasceu"));
		
		JOptionPane.showMessageDialog(null, "Seu nome �: " + P.JuntaNome() + ". Nascido em " + P.AnoDeNascimento);
		JOptionPane.showMessageDialog(null, "Voc� t�m " + P.idade() + " anos.");
		
		}
		
		
	

	}


