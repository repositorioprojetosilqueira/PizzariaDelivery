package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class TestePedido extends vTelaPadrao {

	/**
	 * Launch the application.
	 */

	public TestePedido() {
		super("TestePedido","/imagens/cliente16x16.png");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(101, 96, 46, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 135, 91, 23);
		panel.add(btnNewButton);
		
		
		

	}
}
