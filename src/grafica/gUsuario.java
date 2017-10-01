package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class gUsuario extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	public gUsuario() {
		super("Cadastro Usuário","/imagens/cliente16x16.png");
		setBounds(100, 100, 653, 322);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(151, 31, 34, 14);
		jpCentro.add(label);
		
		JLabel label_1 = new JLabel("E-mail:");
		label_1.setBounds(151, 75, 34, 14);
		jpCentro.add(label_1);
		
		JLabel label_2 = new JLabel("Fun\u00E7\u00E3o: ");
		label_2.setBounds(151, 123, 46, 14);
		jpCentro.add(label_2);
		
		JLabel label_3 = new JLabel("Login:");
		label_3.setBounds(151, 167, 34, 14);
		jpCentro.add(label_3);
		
		JLabel label_4 = new JLabel("Telefone:");
		label_4.setBounds(406, 75, 46, 14);
		jpCentro.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setText("Boi de Pinga Jogojogadoçasdf");
		textField.setBounds(192, 28, 370, 30);
		
		
		
		jpCentro.add(textField);
		
		JLabel label_5 = new JLabel("Senha:");
		label_5.setBounds(314, 167, 34, 14);
		jpCentro.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 72, 192, 30);
		jpCentro.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(462, 72, 100, 30);
		jpCentro.add(textField_2);
		
		JRadioButton radioButton = new JRadioButton("Administrador");
		radioButton.setBounds(203, 120, 109, 30);
		jpCentro.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Atendente");
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(314, 119, 86, 33);
		jpCentro.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Entregador");
		radioButton_2.setBounds(406, 119, 109, 33);
		jpCentro.add(radioButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(192, 160, 105, 30);
		jpCentro.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(358, 164, 123, 30);
		jpCentro.add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("Desativar");
		checkBox.setBounds(151, 204, 71, 33);
		jpCentro.add(checkBox);
		
		
	}
}
