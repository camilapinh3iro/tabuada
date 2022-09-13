package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.management.modelmbean.ModelMBean;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.JtextFieldSomenteNumeros;
import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo; 
	public int largura;
	public int altura; 
	public Font fonteDosLabels;
	public Color corDaFonteDescricao;
	public Color corDoTitulo;
	public Color corDoBotaoCalcular;
	public Color corDoBotaoLimpar;
	public Color corDaLista;
	public Color corFundoDeTela;
	Icon IconeTabuada = new ImageIcon("src/br/senai/sp/jandira/imagem/imagem.png");
	
	public void criarTela() {
		JFrame tela = new JFrame(); 
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		// Para obter a instância do painel de conteúdo (Container):
		Container painel = tela.getContentPane();
		painel.setBackground(corFundoDeTela);
		
		
		// Criar os componentes da tela e colocar no painel (Container):
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(70, 10, 300, 30);
		labelTabuada.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 20));
		labelTabuada.setForeground(corDoTitulo);
		
		JLabel labelDescricao = new JLabel();
		labelDescricao.setText("<html>Com a tabuada 1.0 os seus problemas acabaram. <br>Calcule a tabuada que desejar em segundos!</html>");
		labelDescricao.setBounds(74, 33, 400, 30);
		labelDescricao.setFont(fonteDosLabels);
		labelDescricao.setForeground(corDaFonteDescricao);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(90, 75, 150, 30);
		
		JTextField textFieldMultiplicando = new JtextFieldSomenteNumeros();
		textFieldMultiplicando.setBounds(200, 80, 130, 30);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador: ");
		labelMinMultiplicador.setBounds(50, 120, 200, 30);
		
		JTextField textFieldMinMultiplicador = new JtextFieldSomenteNumeros();
		textFieldMinMultiplicador.setBounds(200, 120, 130, 30);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador: ");
		labelMaxMultiplicador.setBounds(50, 160, 200, 30);
		
		JTextField textFieldMaxMultiplicador = new JtextFieldSomenteNumeros();
		textFieldMaxMultiplicador.setBounds(200, 160, 130, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(50, 220, 150, 30);
		buttonCalcular.setBackground(corDoBotaoCalcular);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(210, 220, 125, 30);
		buttonLimpar.setBackground(corDoBotaoLimpar);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado: ");
		labelResultado.setBounds(50, 270, 190, 30);
		
		JList listTabuada = new JList();
		listTabuada.setBackground(corDaLista);
		
		JScrollPane scrollPane = new JScrollPane(listTabuada);
		scrollPane.setBounds(50, 300, 300, 200);	
		
		JLabel labelIcone = new JLabel();
		labelIcone.setBounds(10, 5, 30, 30);
		labelIcone.setSize(80, 80);
		labelIcone.setIcon(IconeTabuada);
		
		
		// Adicionar componentes ao Container
		painel.add(labelTabuada);
		painel.add(labelDescricao);
		painel.add(labelMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMultiplicando);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scrollPane);
		painel.add(labelIcone);
		
		
		//Eventos
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite o multiplicando!");
					textFieldMultiplicando.requestFocus();
				} else if (textFieldMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite o mínimo multiplicador!");
					textFieldMinMultiplicador.requestFocus();
				} else if (textFieldMaxMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite o máximo multiplicador!");
					textFieldMaxMultiplicador.requestFocus();
				} else if (Integer.parseInt(textFieldMaxMultiplicador.getText()) < Integer.parseInt(textFieldMinMultiplicador.getText())) {
					JOptionPane.showMessageDialog(null, "O máximo multiplicador deve ser maior do que o mínimo multiplicador!!!!!");
					textFieldMaxMultiplicador.requestFocus();
				} else {
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
					tabuada.maxMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
					
					listTabuada.setListData(tabuada.getTabuada());
				}
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			textFieldMaxMultiplicador.setText(null);
			textFieldMinMultiplicador.setText(null);
			textFieldMultiplicando.setText(null);
			
			String[] listaVazia = {""};
			listTabuada.setListData(listaVazia);
				
			}
		});	
		
//		 Função para impedir de digitar letras
//		textFieldMultiplicando.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				textFieldMultiplicando.setText(textFieldMultiplicando.getText().replaceAll("[^0-9]", ""));
//				if (textFieldMultiplicando.getText().length() > 9) {
//					
//				}
//				
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		})
		
		tela.setVisible(true);
	}

}
