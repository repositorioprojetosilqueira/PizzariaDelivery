package grafica;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class painelCliente extends JPanel{

	//private JPanel jpCliente;
	
	public painelCliente(int x, int y) {
		super();
		this.setLayout(null);
		this.setLocation(x, y);
		this.setVisible(true);

		
		JLabel label = new JLabel("Nome: ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 19, 67, 14);
		this.add(label);
		
		JLabel label_1 = new JLabel("Telefone: ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(0, 66, 67, 14);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("Telefone:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(247, 66, 73, 14);
		this.add(label_2);
		
		JLabel label_3 = new JLabel("Rua:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(8, 119, 59, 14);
		this.add(label_3);
		
		JLabel label_4 = new JLabel("N\u00BA:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(342, 119, 38, 14);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("Complemento:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(247, 168, 86, 14);
		this.add(label_5);
		
		JLabel label_6 = new JLabel("Bairro:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(9, 168, 58, 14);
		this.add(label_6);
		
		JLabel label_7 = new JLabel("Refer\u00EAncia de Entrega:");
		label_7.setBounds(34, 214, 173, 14);
		this.add(label_7);
		
		JLabel label_8 = new JLabel("Historico de Compras: ");
		label_8.setBounds(34, 323, 175, 14);
		this.add(label_8);
		
		JTextField textField;
		JTextField textField_1;

		JTextField textField_2;
		JTextField textField_3;
		JTextField textField_4;

		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 11, 395, 30);
		
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(77, 58, 142, 30);
		
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(330, 58, 142, 30);
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 111, 256, 30);
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(390, 111, 82, 30);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(335, 160, 137, 30);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 160, 173, 30);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(32, 239, 440, 73);
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(32, 348, 440, 48);
		
		
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
