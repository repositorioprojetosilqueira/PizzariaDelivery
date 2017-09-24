package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;

public class vCadTeste extends vTelaPadrao {

	/**
	 * Launch the application.
	 */
		public vCadTeste() {
			super("Teste");
		setBounds(100, 100, 790, 489);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);

	}
}
