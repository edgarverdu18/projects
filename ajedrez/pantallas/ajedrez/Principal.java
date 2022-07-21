package ajedrez;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel icono;
	JButton button;
	JButton salida;
	public Principal() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Start");
		salida = new JButton("Exit");
		
		button.setBackground(Color.orange);
		button.setSize(100, 50);
		button.setLocation(70, 400);
		button.addActionListener(this);
		salida.setSize(100, 50);
		salida.setLocation(330, 400);
		salida.addActionListener(this);
		
		icono = new JLabel();
		icono.setIcon(new ImageIcon("images/titulo.jpg"));
		Dimension iconoSize = icono.getPreferredSize();
		icono.setBounds(0, 0, iconoSize.width, iconoSize.height);
		
		panel.setBackground(Color.white);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panel.setLayout(null);
		panel.add(button);
		panel.add(salida);
		panel.add(icono);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AJEDREZ");
		frame.pack();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		System.out.println("Hola Mundo");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String opcion = e.getActionCommand();
		if(opcion.equals("Start")) {
			System.out.println(opcion);
			new Board();
			frame.dispose();
		}else if(opcion.equals("Exit")) {
			System.out.println(opcion);
			frame.dispose();
		}
		
	}
}
