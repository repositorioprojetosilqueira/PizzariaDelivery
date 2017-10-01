package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSeparator;

public class gCliente   {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	public gCliente() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 375);
		
				
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		
		JLabel lblPesquisar = new JLabel("Pesquisar :");
		lblPesquisar.setHorizontalAlignment(SwingConstants.LEFT);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.add(lblPesquisar);
		panel_1.add(textField);
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblPesquisar, textField}));
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(42, 8, 34, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 5, 291, 20);
		textField_1.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone 1: ");
		lblTelefone.setBounds(42, 32, 58, 14);
		panel_2.setLayout(null);
		panel_2.add(lblNome);
		panel_2.add(textField_1);
		panel_2.add(lblTelefone);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(110, 29, 92, 20);
		panel_2.add(formattedTextField_1);
		
		JLabel lblTelefone_1 = new JLabel("Telefone 2:");
		lblTelefone_1.setBounds(212, 32, 55, 14);
		panel_2.add(lblTelefone_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(277, 29, 92, 20);
		panel_2.add(formattedTextField);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(42, 60, 68, 14);
		panel_2.add(lblLogradouro);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 57, 188, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setBounds(309, 60, 46, 14);
		panel_2.add(lblN);
		
		textField_3 = new JTextField();
		textField_3.setBounds(327, 57, 42, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(42, 85, 80, 14);
		panel_2.add(lblComplemento);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 82, 68, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(42, 110, 34, 14);
		panel_2.add(lblBairro);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 107, 137, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRefernciaDeEntrega = new JLabel("Refer\u00EAncia de Entrega:");
		lblRefernciaDeEntrega.setBounds(42, 135, 146, 14);
		panel_2.add(lblRefernciaDeEntrega);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(42, 153, 256, 57);
		panel_2.add(textArea);
		
		JLabel lblHistoricoDeCompras = new JLabel("Historico de Compras: ");
		lblHistoricoDeCompras.setBounds(42, 221, 120, 14);
		panel_2.add(lblHistoricoDeCompras);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setBounds(42, 236, 256, 39);
		panel_2.add(textArea_1);
	}
}
