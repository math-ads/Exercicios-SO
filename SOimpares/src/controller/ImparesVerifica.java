package controller;

public class ImparesVerifica {

	public ImparesVerifica() {
		super();}
	
	public void Verifica(int vet[]) {
		
		for ( int num: vet) {
			if (num%2!=0) {
		System.out.println(num + " impar");
	
	} else {
		if( num%10==0) {
			System.out.println(num + " par multiplo de 10");
		
	}
}
}}}

