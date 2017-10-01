package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class gAdicionais extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;


	public gAdicionais() {
		super("Adicionais", "");
		setBounds(100, 100, 584, 328);
		
		JLabel label = new JLabel("Descri\u00E7\u00E3o:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(154, 39, 71, 14);
		jpCentro.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(235, 31, 222, 30);
		jpCentro.add(textField);
		
		JLabel label_1 = new JLabel("Tipo:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(154, 97, 71, 14);
		jpCentro.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(235, 89, 157, 30);
		jpCentro.add(comboBox);
		
		JLabel label_2 = new JLabel("Pre\u00E7o:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(154, 155, 72, 14);
		jpCentro.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(235, 147, 86, 30);
		jpCentro.add(textField_1);
		
		JCheckBox checkBox = new JCheckBox("Desativar");
		checkBox.setBounds(224, 205, 97, 23);
		jpCentro.add(checkBox);

	}
}
