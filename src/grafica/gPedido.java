package grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import View.vPrincipal;
import View.vTelaPadrao;

public class gPedido extends vTelaPadrao{


	
	public gPedido() {
		super("Pedido","/imagens/pedido16x16.png");
		listagem();
	}

	
	private void listagem() {
		
		String[] colunas = {"Código","Iniciado", "Telefone", "Total","Status", "Pago"};
		Object[][] FonteDeDados= {
		{"1", "13h00","32156789", "R$ 22,00", "Entregue", "Sim"},
		{"2", "20h15","32156789", "R$ 20,00", "Aberto", "Não"},
		{" ", " "}			
		};
		
		JTable tabela = new JTable(new DefaultTableModel(FonteDeDados, colunas)); 
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(220);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(20);
		
		JScrollPane scrollpane = new JScrollPane(tabela);
		tabela.setFillsViewportHeight(true);
		scrollpane.setBounds(10, 10, 500, 400);
		getContentPane().add(scrollpane);
		
		
	}
	
	

}
