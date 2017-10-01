package View;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;
 
public class vCadUsuario extends vTelaPadrao {  
 private paineis jpCentro = new paineis(10, 10);
 
    public vCadUsuario() {
        super("Cadastro Usuário","/imagens/cliente16x16.png");  
        inilayout();
 
     }
    private void inilayout() {
    	
    jpCentro.setLayout(null);  
   
    
	JTextField textField = new JTextField();
	textField.setBounds(118, 86, 86, 20);
	jpCentro.add(textField);
	textField.setColumns(10);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bete", "Beto", "Bere", "Berte"}));
	comboBox.setBounds(420, 11, 97, 22);
	jpCentro.add(comboBox);
	
	JToggleButton tglbtnNewToggleButton = new JToggleButton("Coisa Linda");
	tglbtnNewToggleButton.setBounds(251, 261, 121, 23);
	jpCentro.add(tglbtnNewToggleButton);
	
	JTextPane textPane = new JTextPane();
	textPane.setBounds(164, 178, 134, 20);
	jpCentro.add(textPane);
	
	JLabel lblCoisaDele = new JLabel("Coisa dele");
	lblCoisaDele.setBounds(19, 89, 89, 14);
	jpCentro.add(lblCoisaDele);
	
	JPasswordField passwordField = new JPasswordField();
	passwordField.setBounds(164, 324, 151, 20);
	jpCentro.add(passwordField);
	
	this.add(jpCentro, BorderLayout.CENTER);
	
    }
    
 }