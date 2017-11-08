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
import javax.swing.JOptionPane;

import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import model.mCliente;
import model.mUsuario;
import model.dao.daoCliente;
import model.dao.daoUsuario;


 
public class vCadUsuario extends vTelaPadrao {  
 
	public JTextField jtfNome;
	private JTextField jtfEmail;
	private JTextField jtfTelefone;
	private JTextField jtfLogin;
	private JPasswordField jpwfSenha;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton jrbAdmin, jrbAten, jrbEntre;
	private JCheckBox jcbStatus;
	
	private DefaultTableModel modelo;
	private JTable tabela;
	
 	private int codUsuario;
	
	
    public vCadUsuario() {
super("Cadastro Usuário","/imagens/usuario32x32.png");
		
		initLayout();
	
		criaJTable();
		StatusTelaComponentes(false);
    	StatusBotoes(true, false, false, false, false);
		
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
		jtfNome.setText(null);
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
		
		jrbAdmin = new JRadioButton("Administrador");
		jrbAdmin.setSelected(false);
		jrbAdmin.setActionCommand("adm");
		buttonGroup.add(jrbAdmin);
		jrbAdmin.setBounds(290, 63, 109, 33);
		jpCentro.add(jrbAdmin);
		
		jrbAten = new JRadioButton("Atendente");
		jrbAten.setSelected(true);
		jrbAten.setActionCommand("ate");
		buttonGroup.add(jrbAten);
		jrbAten.setBounds(431, 63, 100, 33);
		jpCentro.add(jrbAten);
		
		jrbEntre = new JRadioButton("Entregador");
		jrbEntre.setSelected(false);
		jrbEntre.setActionCommand("ent");
		buttonGroup.add(jrbEntre);
		jrbEntre.setBounds(540, 63, 109, 33);
		jpCentro.add(jrbEntre);
		
		jtfLogin = new JTextField();
		jtfLogin.setColumns(10);
		jtfLogin.setBounds(282, 160, 158, 30);
		jpCentro.add(jtfLogin);
		
		jpwfSenha = new JPasswordField();
		jpwfSenha.setBounds(507, 158, 142, 30);
		jpCentro.add(jpwfSenha);
		
		jcbStatus = new JCheckBox("Ativo");
		jcbStatus.setSelected(true);
		jcbStatus.setHorizontalAlignment(SwingConstants.LEFT);
		jcbStatus.setBounds(549, 204, 100, 33);
		jpCentro.add(jcbStatus);
	}
	
	
	@Override
	public void acoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StatusTelaComponentes(boolean status) {
		
		jtfNome.setEnabled(status);
		jrbAdmin.setEnabled(status);
		jrbAten.setEnabled(status);
		jrbEntre.setEnabled(status);
		
		jtfEmail.setEnabled(status);
		jtfTelefone.setEnabled(status);
		jtfLogin.setEnabled(status);
		jpwfSenha.setEnabled(status);
		
		jcbStatus.setEnabled(status);
		
	
	}
	
	
	
	private void criaJTable() {
		modelo = new DefaultTableModel();

		tabela  = new  JTable(modelo){
            public boolean isCellEditable(int rowIndex, int mColIndex) {  
                return false;  
            }  
        };  
		
        modelo.addColumn("Cd");
        modelo.addColumn("Nome");
		modelo.addColumn("Função");
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(10);
		
		try {
			pesquisar(modelo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		lista(tabela,3,45,220, this.getHeight()-124);
		campoPesquisa("Pesquisar : ", 5, 8, 70,218);
		tabela.addMouseListener(this); 
		
	}
	
	public static void pesquisar(DefaultTableModel modelo) throws Exception {
		modelo.setNumRows(0);

		daoCliente dao = new daoCliente();

		for (mCliente m : dao.selectAll()) {
			modelo.addRow(new Object[]{m.getCodCliente(),m.getcNome(), m.getcTelefone1(),m.getcTelefone2()});
		}
		
	}


	

	public void preenchetela() throws Exception {
		
		int row = tabela.getSelectedRow();
		
		daoUsuario dao = new daoUsuario();
		 
		 codUsuario =Integer.parseInt(tabela.getModel().getValueAt(row, 0).toString());
		 
		 mUsuario m = dao.select(codUsuario);
		 
		 	String fun = m.getuFuncao();
		 
		 	jtfNome.setText(m.getuNome());
		 	
		 	if(fun.equals("adm"))
		 		jrbAdmin.setSelected(true);
		 	else if(fun.equals("ate"))
		 		jrbAten.setSelected(true);
		 	else
		 		jrbEntre.setSelected(true);
		 	
			jtfEmail.setText(m.getuEmail());
			jtfTelefone.setText(m.getuTelefone());
			jtfLogin.setText(m.getuLogin());
			jpwfSenha.setText(null);
			
			jcbStatus.setSelected(m.getuStatus());
		 
	}

	@Override
	public void limpaTela() {
		
		jtfNome.setText(null);
		jrbAdmin.setSelected(false);
		jrbAten.setSelected(false);
		jrbEntre.setSelected(false);
		
		jtfEmail.setText(null);
		jtfTelefone.setText(null);
		jtfLogin.setText(null);
		jpwfSenha.setText(null);
		
		jcbStatus.setSelected(false);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(jbNovo)) {
			
			jtfNome.requestFocus();
			limpaTela();
			StatusTelaComponentes(true);
			StatusBotoes(false, true, false, true, false);
			codUsuario = -1;
			
		}
		
		else if(ev.getSource().equals(jbSalvar)) {
			mUsuario novoUsuario = new mUsuario();

			novoUsuario.setCodUsuario(codUsuario);
			novoUsuario.setuNome(jtfNome.getText());
			novoUsuario.setuFuncao(buttonGroup.getSelection().getActionCommand());
			novoUsuario.setuEmail(jtfEmail.getText());
			novoUsuario.setuTelefone(jtfTelefone.getText());
			novoUsuario.setuLogin(jtfLogin.getText());
			novoUsuario.setuSenha(jpwfSenha.getText());
			novoUsuario.setuStatus(jcbStatus.isSelected());
			
			daoUsuario dUsuario;
			
			try {
				dUsuario = new daoUsuario();
				if(codUsuario!=-1) 
				dUsuario.update(novoUsuario);
				
				else
					dUsuario.insert(novoUsuario);
				
				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(true, false, false, false, false);
				//pesquisar(modelo);
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		else if(ev.getSource().equals(jbEditar)) {
			jtfNome.requestFocus();
			StatusBotoes(false, true, false, true, true);
			StatusTelaComponentes(true);
			
		}
		
		else if(ev.getSource().equals(jbCancelar)) {
			
			limpaTela();
			StatusTelaComponentes(false);
			StatusBotoes(true, false, false, false, false);
		}
		
		else if(ev.getSource().equals(jbExcluir)) {
			
			daoUsuario dExcUsuario;
			
			int i =JOptionPane.showConfirmDialog(null,"Desejar Excluir o Usuário?","Atenção!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(i==0) {
			try {
				dExcUsuario = new daoUsuario();
				dExcUsuario.delete(codUsuario);
				//pesquisar(modelo);
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
			
			limpaTela();
			StatusTelaComponentes(false);
			StatusBotoes(true, false, false, false, false);
						
			}
			
		}
		
	}
		
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource().equals(tabela)) {
			if (e.getClickCount() == 2) {
                try {
					preenchetela();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
            StatusBotoes(true, false, true, false, false);
            
			}
        }
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
