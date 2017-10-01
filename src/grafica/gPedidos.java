package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JCheckBox;

public class gPedidos extends vTelaPadrao {


	public gPedidos() {
			super("Pedidos", " ");
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
			chckbxNewCheckBox.setBounds(133, 107, 97, 23);
			jpCentro.add(chckbxNewCheckBox);
	}
}
