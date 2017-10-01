package grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import View.vPrincipal;
import View.vTelaPadrao;

public class gProduto extends vTelaPadrao{

	private JFrame frame;
	private JTable table;

	
	public gProduto() {
		super("Produto","");
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 365);
		
	
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBounds(10, 26, 544, 160);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Pedido", "Produto", "Valores", "Tamanho"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(302);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(92);
		panel_2.setLayout(null);
		panel_2.add(table);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setBackground(Color.WHITE);
		lblPedido.setBounds(10, 11, 46, 14);
		panel_2.add(lblPedido);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(78, 11, 46, 14);
		panel_2.add(lblProduto);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(375, 11, 46, 14);
		panel_2.add(lblPreo);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setBounds(469, 11, 46, 14);
		panel_2.add(lblTamanho);
	}

}
