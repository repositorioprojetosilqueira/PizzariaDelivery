package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class gUsuario extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public gUsuario() {
		super("Cadastro Usuário","/imagens/cliente16x16.png");
		setBounds(100, 100, 655, 329);
		
		JLabel label = new JLabel("Nome:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(187, 28, 54, 14);
		jpCentro.add(label);
		
		JLabel label_1 = new JLabel("E-mail:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(187, 119, 54, 14);
		jpCentro.add(label_1);
		
		JLabel label_2 = new JLabel("Fun\u00E7\u00E3o: ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(187, 71, 66, 14);
		jpCentro.add(label_2);
		
		JLabel label_3 = new JLabel("Login:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(187, 167, 54, 14);
		jpCentro.add(label_3);
		
		JLabel label_4 = new JLabel("Telefone:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(441, 119, 66, 14);
		jpCentro.add(label_4);
		
		JLabel label_5 = new JLabel("Senha:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(412, 167, 54, 14);
		jpCentro.add(label_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setText("Boi de Pinga Jogojogadoçasdf");
		textField.setBounds(248, 16, 370, 30);
		
		
		
		jpCentro.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(251, 111, 191, 30);
		jpCentro.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(509, 111, 109, 30);
		jpCentro.add(textField_2);
		
		JRadioButton radioButton = new JRadioButton("Administrador");
		buttonGroup.add(radioButton);
		radioButton.setBounds(259, 62, 109, 33);
		jpCentro.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Atendente");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(400, 62, 100, 33);
		jpCentro.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Entregador");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(509, 62, 109, 33);
		jpCentro.add(radioButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(251, 159, 158, 30);
		jpCentro.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(476, 157, 142, 30);
		jpCentro.add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("Desativar");
		checkBox.setHorizontalAlignment(SwingConstants.LEFT);
		checkBox.setBounds(518, 203, 100, 33);
		jpCentro.add(checkBox);
		
		lista();
	}
	private void lista() {
		
		String[] colunas = {"Nome","Login"};
		Object[][] FonteDeDados= {
		{"Antonio Silva", "aSilva"},
		{"Bruno Gomes", "bGomes"},
		{"Douglas Bernard", "dBernard"},
		{"Everaldo Junior", "eJunior"},
		{"Fernanda Pacheco", "fPacheco "},
		{"Geovanna Antunes", "gAntunes"},
		{" ", " "}			
		};
		
		//JTable tabela = new JTable(new DefaultTableModel(FonteDeDados,colunas));
	    JTable tabela  = new  JTable(new DefaultTableModel(FonteDeDados, colunas){  
            public boolean isCellEditable(int rowIndex, int mColIndex) {  
                return false;  
            }  
        });  


		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
		
		tabela.getColumnModel().getColumn(1).setPreferredWidth(20);
		
		JScrollPane scrollPane= new JScrollPane(tabela);
		tabela.setFillsViewportHeight(true);
		
		scrollPane.setBounds(0,0,200, 350);
		 
		jpCentro.add(scrollPane);
		//((DefaultTableModel)tabela.getModel()).addRow(new Vector()); //linha vazia
		//((DefaultTableModel)tabela.getModel()).addRow( new Object[]{"005", "Raulivan","Matriculado"});
		//Mais
	}  
}
