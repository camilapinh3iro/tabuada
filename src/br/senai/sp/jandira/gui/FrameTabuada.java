package br.senai.sp.jandira.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.modelmbean.ModelMBean;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo; 
	public int largura;
	public int altura;  
	Icon IconeTabuada = new ImageIcon("src/br/senai/sp/jandira/imagem/imagem.png");
	
	public void criarTela() {
		JFrame tela = new JFrame(); 
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		// Para obter a instância do painel de conteúdo (Container):
		Container painel = tela.getContentPane();
		
		
		
		// Criar os componentes da tela e colocar no painel (Container):
		
	
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(70, 10, 300, 30);
		labelTabuada.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 20));
		
		JLabel labelDescricao = new JLabel();
		labelDescricao.setText("<html>Com a tabuada 1.0 os seus problemas acabaram. <br>Calcule a tabuada que desejar em segundos!</html>");
		labelDescricao.setBounds(74, 33, 400, 30);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(90, 70, 150, 30);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(200, 80, 130, 30);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador: ");
		labelMinMultiplicador.setBounds(50, 122, 200, 30);
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(200, 120, 130, 30);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador: ");
		labelMaxMultiplicador.setBounds(50, 165, 200, 30);
		
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(200, 160, 130, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(50, 220, 150, 30);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(210, 220, 125, 30);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado: ");
		labelResultado.setBounds(50, 270, 190, 30);
		
		JList listTabuada = new JList();
	
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
				} else if (textFieldMaxMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite o máximo multiplicador!");
				} else if (Integer.parseInt(textFieldMaxMultiplicador.getText()) < Integer.parseInt(textFieldMinMultiplicador.getText())) {
					JOptionPane.showMessageDialog(null, "O máximo multiplicador deve ser maior do que o mínimo multiplicador!!!!!");
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
			
			scrollPane.removeContainerListener(null);
				
			}
		});	
		
		
		
		
		
		
		
		
		
		
		
		
		
		tela.setVisible(true);
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
