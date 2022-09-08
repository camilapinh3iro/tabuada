package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicando, minMultiplicador, maxMultiplicador;

	public String[] getTabuada() {

		int tamanho = maxMultiplicador - minMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicando * minMultiplicador;
			String resultado = multiplicando + " X " + minMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minMultiplicador++;

		}

		return tabuada;

	}

}
