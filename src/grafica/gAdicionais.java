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
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class gAdicionais extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;


	public gAdicionais() {
		super("Adicionais", "");
		//setBounds(100, 100, 584, 328);
		
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
		
		JLabel label_3 = new JLabel("Nome: ");
		label_3.setBounds(378, 133, 34, 14);
		jpCentro.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(414, 130, 291, 20);
		jpCentro.add(textField_2);
		
		JLabel label_4 = new JLabel("Telefone 1: ");
		label_4.setBounds(378, 157, 58, 14);
		jpCentro.add(label_4);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(446, 154, 92, 20);
		jpCentro.add(formattedTextField);
		
		JLabel label_5 = new JLabel("Telefone 2:");
		label_5.setBounds(548, 157, 55, 14);
		jpCentro.add(label_5);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(613, 154, 92, 20);
		jpCentro.add(formattedTextField_1);
		
		JLabel label_6 = new JLabel("Logradouro:");
		label_6.setBounds(378, 185, 68, 14);
		jpCentro.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(446, 182, 188, 20);
		jpCentro.add(textField_3);
		
		JLabel label_7 = new JLabel("N\u00BA:");
		label_7.setBounds(645, 185, 46, 14);
		jpCentro.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(663, 182, 42, 20);
		jpCentro.add(textField_4);
		
		JLabel label_8 = new JLabel("Complemento:");
		label_8.setBounds(378, 210, 80, 14);
		jpCentro.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(456, 207, 68, 20);
		jpCentro.add(textField_5);
		
		JLabel label_9 = new JLabel("Bairro:");
		label_9.setBounds(378, 235, 34, 14);
		jpCentro.add(label_9);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(422, 232, 137, 20);
		jpCentro.add(textField_6);
		
		JLabel label_10 = new JLabel("Refer\u00EAncia de Entrega:");
		label_10.setBounds(378, 260, 146, 14);
		jpCentro.add(label_10);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(378, 278, 256, 57);
		jpCentro.add(textArea);
		
		JLabel label_11 = new JLabel("Historico de Compras: ");
		label_11.setBounds(378, 346, 120, 14);
		jpCentro.add(label_11);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(378, 361, 256, 39);
		jpCentro.add(textArea_1);

	}
}
