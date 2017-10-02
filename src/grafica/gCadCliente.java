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
	
	initLayout();
	
	
	listagem();
	
	}
	
	private void initLayout() {
		JLabel label = new JLabel("Nome: ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(290, 28, 67, 14);
		jpCentro.add(label);
		
		JLabel label_1 = new JLabel("Telefone 1: ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(290, 75, 67, 14);
		jpCentro.add(label_1);
		
		JLabel label_2 = new JLabel("Telefone 2:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(560, 75, 73, 14);
		jpCentro.add(label_2);
		
		JLabel label_3 = new JLabel("Logradouro:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(275, 128, 82, 14);
		jpCentro.add(label_3);
		
		JLabel label_4 = new JLabel("N\u00BA:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(642, 128, 38, 14);
		jpCentro.add(label_4);
		
		JLabel label_5 = new JLabel("Complemento:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(547, 177, 86, 14);
		jpCentro.add(label_5);
		
		JLabel label_6 = new JLabel("Bairro:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(299, 177, 58, 14);
		jpCentro.add(label_6);
		
		JLabel label_7 = new JLabel("Refer\u00EAncia de Entrega:");
		label_7.setBounds(334, 223, 173, 14);
		jpCentro.add(label_7);
		
		JLabel label_8 = new JLabel("Historico de Compras: ");
		label_8.setBounds(334, 332, 175, 14);
		jpCentro.add(label_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(367, 20, 405, 30);
		jpCentro.add(textField);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(367, 67, 126, 30);
		jpCentro.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(646, 67, 126, 30);
		jpCentro.add(formattedTextField_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(367, 120, 279, 30);
		jpCentro.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(690, 120, 82, 30);
		jpCentro.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(635, 169, 137, 30);
		jpCentro.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(367, 169, 173, 30);
		jpCentro.add(textField_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(332, 248, 440, 73);
		jpCentro.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(332, 357, 440, 48);
		jpCentro.add(textArea_1);
	}
	
private void listagem() {
		
		String[] colunas = {"Nome","Telefone1","Telefone2"};
		Object[][] FonteDeDados= {
		{"Bruna Gomes", "3222-9908","9 9988-0001"},
		{"Denise Pacheco", "3232-9901","9 9988-0001"},
		{"Everaldo Junior", "3222-9908","9 9988-0001"},
		{"Fernanda Pacheco", "3222-9908","9 9988-0001"},
		{"Gabriela Xavier", "3222-9908","9 9988-0001"},
		{"Geovanna Antunes", "3222-9908","9 9988-0001"},
		{" ", " "}			
		};
		
		lista(colunas, FonteDeDados,280,  this.getHeight()-124);
	}

}
