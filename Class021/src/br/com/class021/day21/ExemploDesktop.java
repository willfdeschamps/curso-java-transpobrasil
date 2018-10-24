package br.com.class021.day21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExemploDesktop {

	public static void main(String[] args) {
		JFrame screen = new JFrame("Tela do sistem");
		JButton button = new JButton("Click Aqui");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(screen, "Olá. eu sou o Goku!!!");
			}
		});
		screen.add(button);
		screen.setSize(400, 200);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setVisible(true);
	}

}
