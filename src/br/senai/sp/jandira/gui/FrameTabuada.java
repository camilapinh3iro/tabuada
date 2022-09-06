package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class FrameTabuada {

	public String titulo; 
	public int largura;
	public int altura; 
	public Color corFundoDeTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	public Color corDoTitulo; 
	public Color corDosLabels;
	
	public void criarTela() {
		JFrame tela = new JFrame(); 
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
