package view;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


 
public class vCadUsuario extends vTelaPadrao {  
 
	public JTextField jtfNome;
	private JTextField jtfEmail;
	private JTextField jtfTelefone;
	private JTextField jtfLogin;
	private JPasswordField jpwfSenha;
	private final ButtonGroup buttonGroup = new ButtonGroup();

 
    public vCadUsuario() {
super("Cadastro Usuário","/imagens/usuario32x32.png");
		
		initLayout();
		
		listagem();
		
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
		
		jtfNome = new JTextField();
		jtfNome.setColumns(10);
		jtfNome.setText("Boi de Pinga Jogojogadoçasdf");
		jtfNome.setBounds(279, 17, 370, 30);
		
		jpCentro.add(jtfNome);
		
		jtfEmail = new JTextField();
		jtfEmail.setColumns(10);
		jtfEmail.setBounds(282, 112, 191, 30);
		jpCentro.add(jtfEmail);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setColumns(10);
		jtfTelefone.setBounds(540, 112, 109, 30);
		jpCentro.add(jtfTelefone);
		
		JRadioButton rbAdmin = new JRadioButton("Administrador");
		buttonGroup.add(rbAdmin);
		rbAdmin.setBounds(290, 63, 109, 33);
		jpCentro.add(rbAdmin);
		
		JRadioButton rbAten = new JRadioButton("Atendente");
		buttonGroup.add(rbAten);
		rbAten.setSelected(true);
		rbAten.setBounds(431, 63, 100, 33);
		jpCentro.add(rbAten);
		
		JRadioButton rbEntre = new JRadioButton("Entregador");
		buttonGroup.add(rbEntre);
		rbEntre.setBounds(540, 63, 109, 33);
		jpCentro.add(rbEntre);
		
		jtfLogin = new JTextField();
		jtfLogin.setColumns(10);
		jtfLogin.setBounds(282, 160, 158, 30);
		jpCentro.add(jtfLogin);
		
		jpwfSenha = new JPasswordField();
		jpwfSenha.setBounds(507, 158, 142, 30);
		jpCentro.add(jpwfSenha);
		
		JCheckBox jcbStatus = new JCheckBox("Desativar");
		jcbStatus.setHorizontalAlignment(SwingConstants.LEFT);
		jcbStatus.setBounds(549, 204, 100, 33);
		jpCentro.add(jcbStatus);
	}
	
	private void listagem() {
		
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

	
	
	
}
