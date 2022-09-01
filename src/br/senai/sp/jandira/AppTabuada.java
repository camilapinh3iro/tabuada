package br.senai.sp.jandira;

public class AppTabuada {

	public static void main(String[] args) {
		
		int multiplicador, minMultiplicador, maxMultiplicador, tabuada;
		
		multiplicador = 9;
		minMultiplicador = 1;
		maxMultiplicador = 10;
		
		
		while(minMultiplicador <= maxMultiplicador) {
			tabuada = multiplicador * minMultiplicador;
			minMultiplicador++;
			System.out.println(tabuada);
		}
		
		
		
		
		
		
		
		

	}

}
