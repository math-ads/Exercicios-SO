package view;
import javax.swing.JOptionPane;

import controller.DividePalavras;

public class Principal {

	public static void main(String[] args) {
		
 DividePalavras divPav= new DividePalavras();
	

				String Frase;
	
	Frase = JOptionPane.showInputDialog(" Insira a Frase");
	divPav.divideFrase(Frase);
	
	
}
}
