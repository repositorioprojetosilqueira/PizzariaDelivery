package grafica;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import view.paineis;

public class painelCliente extends paineis{

	//private JPanel jpCliente;
	
	public painelCliente(int x, int y) {
		super(486, 431);
		
		setLayout(null);
		setLocation(x, y);
		//setSize(400, 376);
		setVisible(true);
		
		componentes();
		
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
