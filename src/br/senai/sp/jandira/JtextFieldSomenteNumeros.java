package br.senai.sp.jandira;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public final class JtextFieldSomenteNumeros extends JTextField {

	private static final long serialVersionUID = 1L;

	private int maximoCaracteres = -1;

	public JtextFieldSomenteNumeros() {
		super();
		addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextFieldKeyTyped(evt);
			}
		});
	}

	public void JtextFieldSomenteLetras(int maximo) {
		setMaximoCaracteres(maximo);

		addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextFieldKeyTyped(evt);
			}
		});
	}

	private void jTextFieldKeyTyped(KeyEvent evt) {

		String caracteres = "0987654321";
		if (!caracteres.contains(evt.getKeyChar() + "")) {
			evt.consume();
		}
		if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {

			evt.consume();
			setText(getText().substring(0, getMaximoCaracteres()));

		}

	}

	public int getMaximoCaracteres() {
		return maximoCaracteres;
	}

	public void setMaximoCaracteres(int maximoCaracteres) {
		this.maximoCaracteres = maximoCaracteres;
	}
}