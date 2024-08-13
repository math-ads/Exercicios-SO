package controller;

public class DividePalavras {
	public DividePalavras() {
		super();}
	
	public void divideFrase(String frase) {
		
	
	int quantidade = 0;
	
   String[]vetorPalavras = frase.split(";");
   for( String palavra: vetorPalavras ) {
	   quantidade+= 1;
	   System.out.println(palavra);
	   ;
   }
 System.out.println(quantidade);
	   
	   
	   
}
}
