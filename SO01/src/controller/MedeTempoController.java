package controller;

public class MedeTempoController {
	
	public MedeTempoController() {
		super();}
	
	
	public void VetorizaMil() {
		int [] VetMil= new int [1000];
	double tempoInicial = System.nanoTime();
	for(int i = 0; i <1000;i++) {
		VetMil[i]= 0;
		}
    double tempoFinal= System.nanoTime()- tempoInicial;
    System.out.println(tempoFinal);
	}

	public void VetorizaDezMil() {
		int [] VetMil= new int [10000];
	double tempoInicial = System.nanoTime();
	for(int i = 0; i < 10000;i++) {
		VetMil[i]= 0;
		} 
    double tempoFinal= System.nanoTime()- tempoInicial;
    System.out.println(tempoFinal);
	}

	public void VetorizaCemMil() {
		int [] VetMil= new int [100000];
	double tempoInicial = System.nanoTime();
	for(int i = 0; i <100000;i++) {
		VetMil[i]= 0;
		
		}
    double tempoFinal= System.nanoTime()- tempoInicial;
    System.out.println(tempoFinal);
	}


		
	}



