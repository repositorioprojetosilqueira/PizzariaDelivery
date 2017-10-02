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
	super("Cadastro Cliente","/imagens/cliente16x16.png");
	
	JLabel label = new JLabel("Nome: ");
	label.setHorizontalAlignment(SwingConstants.RIGHT);
	label.setBounds(275, 28, 67, 14);
	jpCentro.add(label);
	
	JLabel label_1 = new JLabel("Telefone 1: ");
	label_1.setHorizontalAlignment(SwingConstants.RIGHT);
	label_1.setBounds(275, 75, 67, 14);
	jpCentro.add(label_1);
	
	JLabel label_2 = new JLabel("Telefone 2:");
	label_2.setHorizontalAlignment(SwingConstants.RIGHT);
	label_2.setBounds(479, 75, 73, 14);
	jpCentro.add(label_2);
	
	JLabel label_3 = new JLabel("Logradouro:");
	label_3.setHorizontalAlignment(SwingConstants.RIGHT);
	label_3.setBounds(260, 128, 82, 14);
	jpCentro.add(label_3);
	
	JLabel label_4 = new JLabel("N\u00BA:");
	label_4.setHorizontalAlignment(SwingConstants.RIGHT);
	label_4.setBounds(637, 128, 44, 14);
	jpCentro.add(label_4);
	
	JLabel label_5 = new JLabel("Complemento:");
	label_5.setHorizontalAlignment(SwingConstants.RIGHT);
	label_5.setBounds(269, 228, 86, 14);
	jpCentro.add(label_5);
	
	JLabel label_6 = new JLabel("Bairro:");
	label_6.setHorizontalAlignment(SwingConstants.RIGHT);
	label_6.setBounds(275, 176, 67, 14);
	jpCentro.add(label_6);
	
	JLabel label_7 = new JLabel("Refer\u00EAncia de Entrega:");
	label_7.setBounds(277, 261, 173, 14);
	jpCentro.add(label_7);
	
	JLabel label_8 = new JLabel("Historico de Compras: ");
	label_8.setBounds(275, 361, 175, 14);
	jpCentro.add(label_8);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(343, 20, 427, 30);
	jpCentro.add(textField);
	
	JFormattedTextField formattedTextField = new JFormattedTextField();
	formattedTextField.setBounds(343, 67, 126, 30);
	jpCentro.add(formattedTextField);
	
	JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	formattedTextField_1.setBounds(555, 67, 126, 30);
	jpCentro.add(formattedTextField_1);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(343, 120, 304, 30);
	jpCentro.add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(688, 121, 82, 30);
	jpCentro.add(textField_2);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(367, 220, 152, 30);
	jpCentro.add(textField_3);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(343, 168, 304, 30);
	jpCentro.add(textField_4);
	
	JTextArea textArea = new JTextArea();
	textArea.setWrapStyleWord(true);
	textArea.setLineWrap(true);
	textArea.setBounds(276, 281, 494, 73);
	jpCentro.add(textArea);
	
	JTextArea textArea_1 = new JTextArea();
	textArea_1.setWrapStyleWord(true);
	textArea_1.setLineWrap(true);
	textArea_1.setBounds(275, 376, 494, 40);
	jpCentro.add(textArea_1);
	}

}
