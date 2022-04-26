package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversaoJanela 
{
	public static void main(String[] args) 
	{

		String valor01 = JOptionPane.showInputDialog( "Digite o salário mês 01: ").replace(",", ".");
		String valor02 = JOptionPane.showInputDialog( "Digite o salário mês 02: ").replace(",", ".");
		String valor03 = JOptionPane.showInputDialog( "Digite o salário mês 03: ").replace(",", ".");
		
		
		//		String valor1 = JOptionPane.showInputDialog( //abre uma janela para pedir o valor
		//		"Digite o primeiro número: ");
		
		double salario01 = Double.parseDouble(valor01);
		double salario02 = Double.parseDouble(valor02);
		double salario03 = Double.parseDouble(valor03);
		
		
		double soma = salario01 + salario02 + salario03;
		
		
		StringBuilder msgsoma = new StringBuilder();
		msgsoma.append("A soma dos salários no período é: R$ ").append(soma).append("!");
		JOptionPane.showMessageDialog(null, msgsoma);
		
		StringBuilder msgmedia = new StringBuilder();
		msgmedia.append("A média dos salários no período é: R$ ").append(soma / 3).append("!");
		JOptionPane.showMessageDialog(null, msgmedia);
		
	}
}
