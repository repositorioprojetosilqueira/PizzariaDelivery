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
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescrio.setBounds(223, 36, 71, 14);
		panel.add(lblDescrio);
		
		textField = new JTextField();
		textField.setBounds(304, 28, 222, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(223, 94, 71, 14);
		panel.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(304, 86, 157, 30);
		panel.add(comboBox);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setBounds(223, 152, 72, 14);
		panel.add(lblPreo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(304, 144, 86, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxDesativar = new JCheckBox("Desativar");
		chckbxDesativar.setBounds(293, 202, 97, 23);
		panel.add(chckbxDesativar);

	}
}
