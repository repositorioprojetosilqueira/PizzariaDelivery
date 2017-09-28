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
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(209, 27, 34, 14);
		panel.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(209, 71, 34, 14);
		panel.add(lblEmail);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o: ");
		lblFuno.setBounds(209, 119, 46, 14);
		panel.add(lblFuno);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(209, 163, 34, 14);
		panel.add(lblLogin);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(464, 71, 46, 14);
		panel.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(250, 24, 370, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(372, 163, 34, 14);
		panel.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 68, 192, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(520, 68, 100, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Administrador");
		rdbtnNewRadioButton.setBounds(261, 116, 109, 20);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Atendente");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBounds(372, 115, 86, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Entregador");
		rdbtnNewRadioButton_2.setBounds(464, 115, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(250, 156, 105, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(416, 160, 123, 20);
		panel.add(passwordField);
		
		JCheckBox chckbxDesativarUsurio = new JCheckBox("Desativar");
		chckbxDesativarUsurio.setBounds(209, 200, 71, 23);
		panel.add(chckbxDesativarUsurio);

	}
}
