package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class gAbrirCaixa extends vTelaPadrao {
	private JTextField textField;
	private ImageIcon icon;

	
	public gAbrirCaixa() {
		super("Caixa - Recebimento","/imagens/caixa16x16.png");
		setBounds(100, 100, 250, 500);
		
		icon = new  ImageIcon(getClass().getResource("imagens/CaixaFechado.png"));
		
		JLabel lblStatusDoCaixa = new JLabel("Status do Caixa");
		lblStatusDoCaixa.setBounds(77, 11, 84, 14);
		jpCentro.add(lblStatusDoCaixa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(49, 24, 137, 2);
		jpCentro.add(separator);
		
		JLabel lblFechado = new JLabel("FECHADO");
		lblFechado.setIcon(new ImageIcon(gAbrirCaixa.class.getResource("/imagens/CaixaFechado.png")));
		lblFechado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechado.setBounds(49, 36, 132, 40);
		jpCentro.add(lblFechado);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(49, 87, 137, 2);
		jpCentro.add(separator_1);
		
		JLabel lblSaldoInicialdinheiro = new JLabel("Saldo Inicial(Dinheiro)");
		lblSaldoInicialdinheiro.setBounds(28, 100, 109, 14);
		jpCentro.add(lblSaldoInicialdinheiro);
		
		textField = new JTextField();
		textField.setBounds(28, 125, 86, 20);
		jpCentro.add(textField);
		textField.setColumns(10);
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservao.setBounds(28, 167, 97, 14);
		jpCentro.add(lblObservao);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(28, 192, 133, 86);
		jpCentro.add(editorPane);
		
		JButton btnAbrirCaixaf = new JButton("Abrir Caixa (F2)");
		btnAbrirCaixaf.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAbrirCaixaf.setBounds(25, 319, 136, 40);
		jpCentro.add(btnAbrirCaixaf);
		
		

	}
}
