package grafica;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import View.vTelaPadrao;

public class gCadProduto extends vTelaPadrao {

	public gCadProduto() {
		
		super("Cadastro Produto", "");
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setBackground(Color.WHITE);
		lblPedido.setBounds(10, 11, 46, 14);
		jpCentro.add(lblPedido);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(78, 11, 46, 14);
		jpCentro.add(lblProduto);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(375, 11, 46, 14);
		jpCentro.add(lblPreo);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setBounds(469, 11, 46, 14);
		jpCentro.add(lblTamanho);
	}

}
