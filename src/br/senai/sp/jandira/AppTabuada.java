package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JFrame;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 400;
		tela.altura = 600;
		tela.fonteDosLabels = new Font("Arial", 2, 12);
		tela.corDaFonteDescricao = new Color(77, 77, 77);
		tela.corDoTitulo = new Color(0, 0, 0);
		tela.corDoBotaoCalcular = new Color(0, 255, 0);
		tela.corDoBotaoLimpar = new Color(255, 0, 0);
		tela.corDaLista = new Color(226, 226, 226);
		tela.corFundoDeTela = new Color(223, 239, 255);
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

	}

}
