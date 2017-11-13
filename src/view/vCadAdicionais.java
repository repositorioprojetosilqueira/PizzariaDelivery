package view;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.mUsuario;
import model.dao.daoUsuario;

public class vCadAdicionais extends vTelaPadrao {

	private JTextField jtfDesc;
	private JTextField jtfPreco;
	private JCheckBox checkBox;
	private int codAdicionais;

	public vCadAdicionais() {

		super("Adicionais", "/imagens/cliente16x16.png");

		initLayout();

		listagem();

	}

	private void initLayout() {
		setSize(674, 320);

		JLabel label = new JLabel("Descrição:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(312, 34, 71, 20);
		jpCentro.add(label);

		jtfDesc = new JTextField();
		jtfDesc.setColumns(10);
		jtfDesc.setBounds(393, 26, 239, 30);
		jpCentro.add(jtfDesc);

		JLabel label_1 = new JLabel("Tipo:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(312, 90, 71, 20);
		jpCentro.add(label_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(393, 82, 241, 30);
		jpCentro.add(comboBox);

		JLabel label_2 = new JLabel("Preço:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(311, 146, 72, 20);
		jpCentro.add(label_2);

		jtfPreco = new JTextField();
		jtfPreco.setColumns(10);
		jtfPreco.setBounds(393, 138, 86, 30);
		jpCentro.add(jtfPreco);

		JCheckBox checkBox = new JCheckBox("Desativar");
		checkBox.setBounds(393, 204, 97, 30);
		jpCentro.add(checkBox);


	}

	private void listagem() {

		String[] colunas = {"Descrição","Tipo", "Preço"};
		Object[][] FonteDeDados= {
				{"Alho Frito", "Pizza","R$ 0,00"},
				{"Berinjela Milanesa", "Pizza","R$ 3,20"},
				{"Cebola Picada", "Pizza","R$ 1,10"},
				{"Cebolinha Picadinha", "Pizza","R$ 0,70"},
				{"Parmesão", "Estrogonofe","R$ 3,20"},
				{"Milho Verde", "Estrogonofe","R$ 0,00"},
				{" ", " "}			
		};

		//lista(FonteDeDados,3,45,290, this.getHeight()-124,105);
		campoPesquisa("Pesquisar : ", 5, 8, 70,218);
	}

	@Override
	public void acoes() { 
		// TODO Auto-generated method stub

	}

	@Override
	public void StatusTelaComponentes(boolean status) {

		jtfDesc.setEnabled(status);
		jtfPreco.setEnabled(status);


	}



	@Override
	public void limpaTela() {

		jtfDesc.setText(null);
		jtfPreco.setText(null);

		checkBox.setSelected(false);

	}

	@Override
	public void actionPerformed(ActionEvent ev) {

	/*	if(ev.getSource().equals(jbNovo)) {

			jtfDesc.requestFocus();
			limpaTela();
			jcbStatus.setSelected(true);
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
				pesquisar(modelo);



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
					pesquisar(modelo);
				} catch (Exception e1) {

					e1.printStackTrace();
				}

				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(true, false, false, false, false);

			}

		}

	}*/

}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub

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

@Override
public void criaJTable() {
	// TODO Auto-generated method stub

}


}

