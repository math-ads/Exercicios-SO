package view;
import controller.ImparesVerifica;
import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
	ImparesVerifica impVer= new ImparesVerifica();
	int n=0;
    int i;
	while(n<=0||n>100) {
	 n= Integer.parseInt(JOptionPane.showInputDialog("insira tamanho do vetor"));
	 int[]vetor = new int [n];
	 for( i = 0; i<n; i++) {
		vetor[i]=  Integer.parseInt(JOptionPane.showInputDialog("insira valor do vetor"));	
		
}
	 impVer.Verifica(vetor);
}
}}