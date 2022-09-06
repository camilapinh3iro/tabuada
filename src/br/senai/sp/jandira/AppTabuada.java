package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 400;
		tela.altura = 600;
		tela.corFundoDeTela = new Color(64, 128, 128);
		tela.corDoTextoDoBotao = new Color(0, 0, 0);
		tela.corDoBotao = new Color(192, 192, 192);
		tela.fonteDosLabels = new Font("Arial Black", Font.BOLD, 13);
		tela.corDoTitulo = new Color(255, 255, 255);
		tela.corDosLabels = new Color(192, 192, 192);
		tela.criarTela();
		
		
		
		
			
		
		
		
		
		
		
		
		
//		Tabuada tabuada = new Tabuada();
//		tabuada.multiplicador = 5;
//		tabuada.minMultiplicador = 1;
//		tabuada.maxMultiplicador = 10;
//		String[] resultado = tabuada.getTabuada();
//		
//		int contador = 0;
//		while (contador < resultado.length) {
//			System.out.println(resultado[contador]);
//			contador++;
//			
//		}
//		
//		System.out.println("FIM");
//		


	}

}
