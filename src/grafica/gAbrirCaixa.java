package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import view.vTelaPadrao;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gAbrirCaixa extends vTelaPadrao {
	private JTextField txtSaldo;
	private ImageIcon icon;

	
	public gAbrirCaixa() {
		super("Caixa - Recebimento","/imagens/caixa16x16.png");
		jbExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setBounds(100, 100, 250, 500);
		
		icon = new  ImageIcon(getClass().getResource("imagens/CaixaFechado.png"));
		
		JLabel lbStatusCaixa = new JLabel("Status do Caixa");
		lbStatusCaixa.setBounds(77, 11, 84, 14);
		jpCentro.add(lbStatusCaixa);
		
		JSeparator separador = new JSeparator();
		separador.setBounds(49, 24, 137, 2);
		jpCentro.add(separador);
		
		JLabel lbFechado = new JLabel("FECHADO");
		lbFechado.setIcon(new ImageIcon(gAbrirCaixa.class.getResource("/imagens/CaixaFechado.png")));
		lbFechado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbFechado.setBounds(49, 36, 132, 40);
		jpCentro.add(lbFechado);
		
		JSeparator separador1 = new JSeparator();
		separador1.setBounds(49, 87, 137, 2);
		jpCentro.add(separador1);
		
		JLabel lbSaldodinheiro = new JLabel("Saldo Inicial(Dinheiro)");
		lbSaldodinheiro.setBounds(28, 100, 109, 14);
		jpCentro.add(lbSaldodinheiro);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(28, 125, 86, 20);
		jpCentro.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JLabel lbObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lbObservacao.setBounds(28, 167, 97, 14);
		jpCentro.add(lbObservacao);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(28, 192, 133, 86);
		jpCentro.add(editorPane);
		
		JButton jbAbrirCaixa = new JButton("Abrir Caixa (F2)");
		jbAbrirCaixa.setFont(new Font("Tahoma", Font.BOLD, 13));
		jbAbrirCaixa.setBounds(25, 319, 136, 40);
		jpCentro.add(jbAbrirCaixa);
		
		

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
	public void StatusBotoes(boolean status, boolean sEdit_Exc) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void limpaTela() {
		// TODO Auto-generated method stub
		
	}
}
