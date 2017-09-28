package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class vCadTeste extends vTelaPadrao {
	private JTextField jtfIdProduto;
	private JTextField jtfProduto;
	private JTextField jtfValor;

	/**
	 * Launch the application.
	 */
		public vCadTeste() {
			super("Teste","/imagens/caixa16x16.png");
		setBounds(100, 100, 682, 424);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(29, 29, 44, 25);
		panel.add(lblNewLabel);
		
		jtfIdProduto = new JTextField();
		jtfIdProduto.setHorizontalAlignment(SwingConstants.RIGHT);
		jtfIdProduto.setText("12");
		jtfIdProduto.setForeground(Color.WHITE);
		jtfIdProduto.setEnabled(false);
		jtfIdProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtfIdProduto.setBounds(83, 27, 55, 30);
		panel.add(jtfIdProduto);
		jtfIdProduto.setColumns(10);
		
		jtfProduto = new JTextField();
		jtfProduto.setBounds(83, 68, 386, 30);
		panel.add(jtfProduto);
		jtfProduto.setColumns(10);
		
		JLabel lblCliente = new JLabel("Produto:");
		lblCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCliente.setBounds(18, 70, 55, 25);
		panel.add(lblCliente);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(27, 111, 46, 25);
		panel.add(lblValor);
		
		jtfValor = new JTextField();
		jtfValor.setToolTipText("");
		jtfValor.setColumns(10);
		jtfValor.setBounds(83, 109, 86, 30);
		panel.add(jtfValor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "2 Sabores", "3 Sabores"}));
		comboBox.setBounds(554, 72, 99, 22);
		panel.add(comboBox);
		
		JLabel lblFracionado = new JLabel("Fracionado:");
		lblFracionado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFracionado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFracionado.setBounds(479, 70, 65, 25);
		panel.add(lblFracionado);

	}
}
