package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicador, minMultiplicador, maxMultiplicador;

	public String[] getTabuada() {

		int tamanho = maxMultiplicador - minMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicador * minMultiplicador;
			String resultado = multiplicador + " X " + minMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minMultiplicador++;

		}

		return tabuada;

	}

}
