package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;

import model.mCliente;
import model.dao.daoCliente;

public class vCadCliente extends vTelaPadrao {  
	private JTextField jtfNome;
	
	private JFormattedTextField jftTelefone1;
	private JFormattedTextField jftTelefone2;
	
	private JTextField jtfRua;

	private JTextField jtfNumero;
	private JTextField jtfComplemento;
	private JTextField jtfBairro;
	
	private JTextArea jtaReferencia;
	private JTextArea jtaHistorico;
	
	public vCadCliente() {
	           
	    	super("Cadastro Cliente","/imagens/cliente.png");
	    	
	    	initLayoutCliente(303, 11);
	    	
	    	listagem();
	    	
	    	acoes();
	    	
	    	
	}
	    	
	public void initLayoutCliente(int x, int y) {
			
			JPanel jpCliente = new JPanel();
			
			jpCliente.setSize(483,406);
			jpCliente.setLocation(x,y);
			jpCliente.setLayout(null);
			//800x500
			
			JLabel lbNome = new JLabel("Nome: ");
			lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
			lbNome.setBounds(0, 19, 67, 14);
			jpCliente.add(lbNome);
			
			JLabel lbTelefone1 = new JLabel("Telefone: ");
			lbTelefone1.setHorizontalAlignment(SwingConstants.RIGHT);
			lbTelefone1.setBounds(0, 66, 67, 14);
			jpCliente.add(lbTelefone1);
			
			JLabel lbTelefone2 = new JLabel("Telefone:");
			lbTelefone2.setHorizontalAlignment(SwingConstants.RIGHT);
			lbTelefone2.setBounds(247, 66, 73, 14);
			jpCliente.add(lbTelefone2);
			
			JLabel lbRua = new JLabel("Rua:");
			lbRua.setHorizontalAlignment(SwingConstants.RIGHT);
			lbRua.setBounds(8, 119, 59, 14);
			jpCliente.add(lbRua);
			
			JLabel lbNumero = new JLabel("N\u00BA:");
			lbNumero.setHorizontalAlignment(SwingConstants.RIGHT);
			lbNumero.setBounds(342, 119, 38, 14);
			jpCliente.add(lbNumero);
			
			JLabel lbComplemento = new JLabel("Complemento:");
			lbComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
			lbComplemento.setBounds(247, 168, 86, 14);
			jpCliente.add(lbComplemento);
			
			JLabel lbBairro = new JLabel("Bairro:");
			lbBairro.setHorizontalAlignment(SwingConstants.RIGHT);
			lbBairro.setBounds(9, 168, 58, 14);
			jpCliente.add(lbBairro);
			
			JLabel lbReferencia = new JLabel("Refer\u00EAncia de Entrega:");
			lbReferencia.setBounds(34, 214, 173, 14);
			jpCliente.add(lbReferencia);
			
			JLabel lbHistorico = new JLabel("Historico de Compras: ");
			lbHistorico.setBounds(34, 323, 175, 14);
			jpCliente.add(lbHistorico);
			

			
			
			jtfNome = new JTextField();
			jtfNome.setColumns(10);
			jtfNome.setBounds(77, 11, 395, 30);
			
			
			
			jftTelefone1 = new JFormattedTextField();
			jftTelefone1.setBounds(77, 58, 142, 30);
			
			
			jftTelefone2 = new JFormattedTextField();
			jftTelefone2.setBounds(330, 58, 142, 30);
			
			
			jtfRua = new JTextField();
			jtfRua.setColumns(10);
			jtfRua.setBounds(77, 111, 256, 30);
			
			
			jtfNumero = new JTextField();
			jtfNumero.setColumns(10);
			jtfNumero.setBounds(390, 111, 82, 30);
			
			
			jtfComplemento = new JTextField();
			jtfComplemento.setColumns(10);
			jtfComplemento.setBounds(335, 160, 137, 30);
			
			
			jtfBairro = new JTextField();
			jtfBairro.setColumns(10);
			jtfBairro.setBounds(77, 160, 173, 30);
			
			
			jtaReferencia = new JTextArea();
			jtaReferencia.setWrapStyleWord(true);
			jtaReferencia.setLineWrap(true);
			jtaReferencia.setBounds(32, 239, 440, 73);
			
			
			jtaHistorico = new JTextArea();
			jtaHistorico.setWrapStyleWord(true);
			jtaHistorico.setLineWrap(true);
			jtaHistorico.setBounds(32, 348, 440, 48);
			
			
			jpCliente.add(jtfNome);
			jpCliente.add(jftTelefone1);
			jpCliente.add(jftTelefone2);
			jpCliente.add(jtfRua);
			jpCliente.add(jtfNumero);
			jpCliente.add(jtfComplemento);
			jpCliente.add(jtfBairro);
			jpCliente.add(jtaReferencia);
			jpCliente.add(jtaHistorico);
			
			jtfNome.setNextFocusableComponent(jftTelefone1);
			
			
			jpCentro.add(jpCliente);
		}
		
	private void listagem(){
			String[] colunas = {"Nome","Telefone1","Telefone2"};
			Object[][] FonteDeDados= {
			{"Bruna Gomes", "3222-9908","9 9988-0001"},
			{"Denise Pacheco", "3232-9901","9 9988-0001"},
			{"Everaldo Junior", "3222-9908","9 9988-0001"},
			{"Fernanda Pacheco", "3222-9908","9 9988-0001"},
			{"Gabriela Xavier", "3222-9908","9 9988-0001"},
			{"Geovanna Antunes", "3222-9908","9 9988-0001"},
			{" ", " "}			
			};
			
			
			lista(colunas, FonteDeDados,3,45,290, this.getHeight()-124,105);
			campoPesquisa("Pesquisar : ", 5, 8, 70,218);
		}
	
	
	public void acoes(){
	
		jbNovo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						limpaTela();
						StatusTelaComponentes(true);
						StatusBotoes(true, false);
						
					}
				});
		
		jbSalvar.addActionListener(new ActionListener() {
			//int codCliente, String cNome, String cTelefone1, String cTelefone2, String cRua, String cNumero,
			//String cBairro, String cComplemento, String cRefEntrega, String cHistCompras
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mCliente novoCliente = new mCliente();
				novoCliente.setcNome(jtfNome.getText());
				novoCliente.setcTelefone1(jftTelefone1.getText());
				novoCliente.setcTelefone2(jftTelefone2.getText());
				novoCliente.setcRua(jtfRua.getText());
				novoCliente.setcNumero(jtfNumero.getText());
				novoCliente.setcBairro(jtfBairro.getText());
				novoCliente.setcComplemento(jtfComplemento.getText());
				novoCliente.setcRefEntrega(jtaReferencia.getText());
				novoCliente.setcHistCompras(jtaHistorico.getText());
				
				daoCliente dCliente;
				
				try {
					dCliente = new daoCliente();
					dCliente.insert(novoCliente);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		jbCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(false, false);
				
			}
		});
		
	}
	
	@Override
	public void StatusTelaComponentes(boolean status) {
		
		jtfNome.setEnabled(status);
		jftTelefone1.setEnabled(status);
		jftTelefone2.setEnabled(status);
		jtfRua.setEnabled(status);
		jtfNumero.setEnabled(status);
		jtfBairro.setEnabled(status);
		jtfComplemento.setEnabled(status);
		jtaReferencia.setEnabled(status);
		jtaHistorico.setEnabled(status);
	}

	@Override
	public void limpaTela() {
		
		jtfNome.setText(null);
		jftTelefone1.setText(null);
		jftTelefone2.setText(null);
		jtfRua.setText(null);
		jtfNumero.setText(null);
		jtfBairro.setText(null);
		jtfComplemento.setText(null);
		jtaReferencia.setText(null);
		jtaHistorico.setText(null);
	}

	@Override
	public void StatusBotoes(boolean status, boolean  sEdit_Exc) {
		
		jbSalvar.setEnabled(status);
		jbEditar.setEnabled(sEdit_Exc);
		jbCancelar.setEnabled(status);
		jbExcluir.setEnabled(sEdit_Exc);
				
	}


}

	    	
	    


			
	    	
	    	
	    

