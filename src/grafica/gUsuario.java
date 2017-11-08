package grafica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JInternalFrame;
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

import view.vTelaPadrao;

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
		super("Cadastro Usuário","/imagens/usuario32x32.png");
		
		initLayout();
		
		//listagem();
		
	}
	
	private void initLayout() {
		setBounds(100, 100, 674, 320);
		
		JLabel label = new JLabel("Nome:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(218, 25, 54, 14);
		jpCentro.add(label);
		
		JLabel label_1 = new JLabel("E-mail:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(218, 120, 54, 14);
		jpCentro.add(label_1);
		
		JLabel label_2 = new JLabel("Fun\u00E7\u00E3o: ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(218, 72, 66, 14);
		jpCentro.add(label_2);
		
		JLabel label_3 = new JLabel("Login:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(218, 168, 54, 14);
		jpCentro.add(label_3);
		
		JLabel label_4 = new JLabel("Telefone:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(472, 120, 66, 14);
		jpCentro.add(label_4);
		
		JLabel label_5 = new JLabel("Senha:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(443, 168, 54, 14);
		jpCentro.add(label_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setText("Boi de Pinga Jogojogadoçasdf");
		textField.setBounds(279, 17, 370, 30);
		
		jpCentro.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(282, 112, 191, 30);
		jpCentro.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(540, 112, 109, 30);
		jpCentro.add(textField_2);
		
		JRadioButton radioButton = new JRadioButton("Administrador");
		buttonGroup.add(radioButton);
		radioButton.setBounds(290, 63, 109, 33);
		jpCentro.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Atendente");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(431, 63, 100, 33);
		jpCentro.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Entregador");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(540, 63, 109, 33);
		jpCentro.add(radioButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(282, 160, 158, 30);
		jpCentro.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(507, 158, 142, 30);
		jpCentro.add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("Desativar");
		checkBox.setHorizontalAlignment(SwingConstants.LEFT);
		checkBox.setBounds(549, 204, 100, 33);
		jpCentro.add(checkBox);
	}
	
	/*private void listagem() {
		
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
		
		lista(colunas, FonteDeDados,3,45,220, this.getHeight()-124,105);
		campoPesquisa("Pesquisar : ", 5, 8, 70,150);
		
	}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StatusTelaComponentes(boolean status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void limpaTela() {
		// TODO Auto-generated method stub
		
	}

	
}
