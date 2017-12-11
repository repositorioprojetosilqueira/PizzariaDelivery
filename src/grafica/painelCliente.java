package grafica;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.export.GenericElementJsonHandler;
import view.paineis;

public class painelCliente extends paineis{

	public JTextField jtfNome;
	public JFormattedTextField jftTelefone1;
	public JFormattedTextField jftTelefone2;
	public JTextField jtfRua;
	public JTextField jtfNumero;
	public JTextField jtfComplemento;
	public JTextField jtfBairro;
	public JTextArea jtaReferencia;
	public JTextArea jtaHistorico;
	
	public painelCliente(int x, int y) { 
		super(487, 420);
		
		setLayout(null);
		setLocation(x, y);
		setVisible(true);
		
		componentes2();
		
	}
	
	private void componentes2() {
		
		JLabel lbNome = new JLabel("Nome: ");
		lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNome.setBounds(0, 19, 67, 14);
		
		JLabel lbTelefone1 = new JLabel("Telefone: ");
		lbTelefone1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTelefone1.setBounds(0, 66, 67, 14);
		
		JLabel lbTelefone2 = new JLabel("Telefone:");
		lbTelefone2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTelefone2.setBounds(247, 66, 73, 14);
		
		JLabel lbRua = new JLabel("Rua:");
		lbRua.setHorizontalAlignment(SwingConstants.RIGHT);
		lbRua.setBounds(8, 119, 59, 14);
		
		JLabel lbNumero = new JLabel("N\u00BA:");
		lbNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNumero.setBounds(342, 119, 38, 14);
		
		JLabel lbComplemento = new JLabel("Complemento:");
		lbComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
		lbComplemento.setBounds(247, 168, 86, 14);
		
		JLabel lbBairro = new JLabel("Bairro:");
		lbBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lbBairro.setBounds(9, 168, 58, 14);
		
		JLabel lbReferencia = new JLabel("Refer\u00EAncia de Entrega:");
		lbReferencia.setBounds(34, 214, 173, 14);
		
		JLabel lbHistorico = new JLabel("Historico de Compras: ");
		lbHistorico.setBounds(34, 323, 175, 14);
				
		
		jtfNome = new JTextField();
		jtfNome.setColumns(10);
		jtfNome.setBounds(77, 11, 395, 30);
		
		
		
		jftTelefone1 = new JFormattedTextField();
		jftTelefone1.setBounds(77, 58, 142, 30);
		
		
		jftTelefone2 = new JFormattedTextField();
		jftTelefone2.setBounds(330, 58, 142, 30);
		
		
		jtfRua = new JTextField();
		jtfRua.setColumns(10);
		jtfRua.setBounds(77, 111, 256, 30);
		
		
		jtfNumero = new JTextField();
		jtfNumero.setColumns(10);
		jtfNumero.setBounds(390, 111, 82, 30);
		
		
		jtfComplemento = new JTextField();
		jtfComplemento.setColumns(10);
		jtfComplemento.setBounds(335, 160, 137, 30);
		
		
		jtfBairro = new JTextField();
		jtfBairro.setColumns(10);
		jtfBairro.setBounds(77, 160, 173, 30);
		
		
		jtaReferencia = new JTextArea();
		jtaReferencia.setWrapStyleWord(true);
		jtaReferencia.setLineWrap(true);
		jtaReferencia.setBounds(32, 239, 440, 73);
		
		
		jtaHistorico = new JTextArea();
		jtaHistorico.setWrapStyleWord(true);
		jtaHistorico.setLineWrap(true);
		jtaHistorico.setBounds(32, 348, 440, 48);
		
		
		this.add(lbBairro);
		this.add(lbComplemento);
		this.add(lbHistorico);
		this.add(lbNome);
		this.add(lbNumero);
		this.add(lbReferencia);
		this.add(lbRua);
		this.add(lbTelefone1);
		this.add(lbTelefone2);
		
		
		
		this.add(jtfNome);
		this.add(jftTelefone1);
		this.add(jftTelefone2);
		this.add(jtfRua);
		this.add(jtfNumero);
		this.add(jtfComplemento);
		this.add(jtfBairro);
		this.add(jtaReferencia);
		this.add(jtaHistorico);
		
		jtfNome.setNextFocusableComponent(jftTelefone1);
		
		
	}
	
	
	private void componentes() {
		
		JLabel label = new JLabel("Nome: ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 36, 67, 20);
		this.add(label);
		
		JLabel label_1 = new JLabel("Telefone: ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(0, 84, 67, 20);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("Telefone:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(247, 84, 73, 20);
		this.add(label_2);
		
		JLabel label_3 = new JLabel("Rua:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(8, 132, 59, 20);
		this.add(label_3);
		
		JLabel label_4 = new JLabel("Nº:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(342, 132, 38, 20);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("Complemento:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(247, 185, 86, 20);
		this.add(label_5);
		
		JLabel label_6 = new JLabel("Bairro:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(9, 185, 58, 20);
		this.add(label_6);
		
		JLabel label_7 = new JLabel("Refer\u00EAncia de Entrega:");
		label_7.setBounds(34, 231, 173, 20);
		this.add(label_7);
		
		JLabel label_8 = new JLabel("Historico de Compras: ");
		label_8.setBounds(34, 340, 175, 20);
		this.add(label_8);
		
		JTextField textField;
		JTextField textField_1;

		JTextField textField_2;
		JTextField textField_3;
		JTextField textField_4;

		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 30, 395, 30);
		
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(77, 80, 142, 30);
		
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(330, 80, 142, 30);
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 128, 256, 30);
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(390, 128, 82, 30);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(335, 180, 137, 30);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 180, 173, 30);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(32, 256, 440, 73);
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(32, 365, 440, 48);
		
		
		this.add(textField);
		this.add(formattedTextField);
		this.add(formattedTextField_1);
		this.add(textField_1);
		this.add(textField_2);
		this.add(textField_3);
		this.add(textField_4);
		this.add(textArea);
		this.add(textArea_1);
		
		textField.setNextFocusableComponent(formattedTextField);
		}
}
