package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import View.vTelaPadrao;

public class gCadCliente extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public gCadCliente() {
	super("Cadastro Cliente","");
	
	JLabel label = new JLabel("Nome: ");
	label.setBounds(275, 31, 34, 14);
	jpCentro.add(label);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(308, 26, 476, 20);
	jpCentro.add(textField);
	
	JLabel label_1 = new JLabel("Telefone 1: ");
	label_1.setBounds(275, 75, 58, 14);
	jpCentro.add(label_1);
	
	JFormattedTextField formattedTextField = new JFormattedTextField();
	formattedTextField.setBounds(343, 72, 92, 20);
	jpCentro.add(formattedTextField);
	
	JLabel label_2 = new JLabel("Telefone 2:");
	label_2.setBounds(522, 75, 55, 14);
	jpCentro.add(label_2);
	
	JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	formattedTextField_1.setBounds(587, 72, 92, 20);
	jpCentro.add(formattedTextField_1);
	
	JLabel label_3 = new JLabel("Logradouro:");
	label_3.setBounds(275, 121, 68, 14);
	jpCentro.add(label_3);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(343, 118, 304, 20);
	jpCentro.add(textField_1);
	
	JLabel label_4 = new JLabel("N\u00BA:");
	label_4.setBounds(657, 121, 22, 14);
	jpCentro.add(label_4);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(678, 118, 42, 20);
	jpCentro.add(textField_2);
	
	JLabel label_5 = new JLabel("Complemento:");
	label_5.setBounds(275, 166, 80, 14);
	jpCentro.add(label_5);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(353, 164, 127, 20);
	jpCentro.add(textField_3);
	
	JLabel label_6 = new JLabel("Bairro:");
	label_6.setBounds(275, 213, 34, 14);
	jpCentro.add(label_6);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(319, 210, 328, 20);
	jpCentro.add(textField_4);
	
	JLabel label_7 = new JLabel("Refer\u00EAncia de Entrega:");
	label_7.setBounds(275, 247, 146, 14);
	jpCentro.add(label_7);
	
	JTextArea textArea = new JTextArea();
	textArea.setWrapStyleWord(true);
	textArea.setLineWrap(true);
	textArea.setBounds(277, 267, 507, 73);
	jpCentro.add(textArea);
	
	JLabel label_8 = new JLabel("Historico de Compras: ");
	label_8.setBounds(277, 351, 120, 14);
	jpCentro.add(label_8);
	
	JTextArea textArea_1 = new JTextArea();
	textArea_1.setWrapStyleWord(true);
	textArea_1.setLineWrap(true);
	textArea_1.setBounds(275, 376, 507, 40);
	jpCentro.add(textArea_1);
	}

}
