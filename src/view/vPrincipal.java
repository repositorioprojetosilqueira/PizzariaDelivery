package view;

import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import grafica.gCadProduto;
import grafica.gMovPedido;
import view.*;

public class vPrincipal extends JFrame implements ActionListener, WindowListener{
	private JMenuBar jMbar;
	private JMenu jMnCadastro, jMnMovimento, jMnProduto;

	private JMenuItem jMiUsuario, jMiCliente, jMiProdutos, jMiAdicionais, jMiPedidos, jMiCaixa;
	
	private paineis jpAtalhosLateral;
	
	private botoes jbAtalhoCliente, jbAtalhoPedido, jbAtalhoCaixa;
	private JDesktopPane desktopPane;
	

	private grafica.gAdicionais gAdicionais;
	private grafica.gCadProduto gCadProduto;
	private grafica.gUsuario gUsuario;
	private grafica.gMovPedido gMovPedido;
	private grafica.gMovCaixa gMovCaixa;
	
	
	private vCadAdicionais vCadAdicionais;
	private vCadCliente vCadCliente;
	private vCadProduto vCadProduto;
	private vCadUsuario vCadUsuario;
	private vMovPedido vMovPedido;
	private vMovCaixa vMovCaixa;
	
	
	public vPrincipal() {
		super("Pizzaria Delivery 1.0");
		
		desktopPane = new JDesktopPane();
		//desktopPane.setBackground(Color.gray);
		
		
        setContentPane(desktopPane);
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Janela Maximizada
        
        configuraFrame();
        JMenus();
		painelLateral();
		
		
		this.setSize(900, 650);
		this.setIconImage(new ImageIcon(getClass().getResource("/imagens/pedido.png")).getImage());
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.addWindowListener(this);
		this.setVisible(true);
		
		
		
		//this.addWindowListener((WindowListener) this);				
		
	}
	/*private void imagemFundo() {
		
		jpFundo = new paineis(0, 0);
		jpFundo.setLayout(new BorderLayout());
		jpFundo.setSize(this.getWidth(),this.getHeight());
		jpFundo.setVisible(true);
		
		
		ImageIcon im = new ImageIcon(getClass().getResource("/imagens/pizzaria1.jpg"));
		JLabel jlImagemFundo = new JLabel(im);
		jlImagemFundo.setVisible(true);
		
		
		jpFundo.add(jlImagemFundo, BorderLayout.CENTER);
		desktopPane.add(jpFundo);
		
		
		
	}
*/	
	private void JMenus() {

		jMbar = new JMenuBar();
		
		jMnCadastro = new JMenu("Cadastro");
		
		jMiUsuario = new JMenuItem("Usuário");
		jMiCliente = new JMenuItem("Cliente");
		
		jMnProduto = new JMenu("Produto");
		
		jMiProdutos = new JMenuItem("Produtos");
		jMiAdicionais = new JMenuItem("Adicionais");
		
		
		jMiUsuario.addActionListener(this);
 		jMiCliente.addActionListener(this);
		jMiProdutos.addActionListener(this);
		jMiAdicionais.addActionListener(this);
		
		jMnCadastro.add(jMiUsuario);
		jMnCadastro.add(jMiCliente);
		
		jMnProduto.add(jMiProdutos);
		jMnProduto.add(jMiAdicionais);
		
		jMnCadastro.add(jMnProduto);
		

		jMnMovimento = new JMenu("Movimento");
		
		jMiPedidos = new JMenuItem("Pedidos");
		jMiCaixa = new JMenuItem("Caixa");
		
		jMiPedidos.addActionListener(this);
		jMiCaixa.addActionListener(this);
		
		jMnMovimento.add(jMiPedidos);
		jMnMovimento.add(jMiCaixa);
		
		
		jMbar.add(jMnCadastro);
		jMbar.add(jMnMovimento);
		
		this.setJMenuBar(jMbar);
	}
	
	

	private void painelLateral(){
		GridLayout gl = new GridLayout(3, 1);
		
		jpAtalhosLateral = new paineis(130, 400);
		
		
		jpAtalhosLateral.setLayout(gl);
		
		jbAtalhoCliente = new botoes( 100, 100);
		jbAtalhoCliente.setIcon(new ImageIcon(getClass().getResource("/imagens/cliente.png")));
		jbAtalhoCliente.setToolTipText("Cadastro Cliente");
		
		jbAtalhoCliente.addActionListener(this);
		
		jbAtalhoPedido= new botoes(100, 100);
		jbAtalhoPedido.setIcon(new ImageIcon(getClass().getResource("/imagens/pedido.png")));
		jbAtalhoPedido.setToolTipText("Pedido");
		
		jbAtalhoPedido.addActionListener(this);
        
		jbAtalhoCaixa= new botoes(100, 100);
		jbAtalhoCaixa.setIcon(new ImageIcon(getClass().getResource("/imagens/caixa.png")));
		jbAtalhoCaixa.setToolTipText("Caixa");
		
		jbAtalhoCaixa.addActionListener(this);
 
 		
		jpAtalhosLateral.setLocation(20,130);
		
		jpAtalhosLateral.add(jbAtalhoCliente);
		jpAtalhosLateral.add(jbAtalhoPedido);
		jpAtalhosLateral.add(jbAtalhoCaixa);
		
		desktopPane.add(jpAtalhosLateral);
		
	}

	private void configuraFrame() {
		
		
	    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //setLocation(0, 0);
	    Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment()
	      .getMaximumWindowBounds();
	    setSize((int) rect.getWidth(), (int) rect.getHeight());
	  }

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == jMiUsuario) 
			apareceUsuario();
			
		if(evento.getSource() == jMiCliente || evento.getSource() == jbAtalhoCliente)
			apareceCliente();
		
		if(evento.getSource() == jMiProdutos)
			apareceProduto();
			
		if(evento.getSource() == jMiAdicionais)
			apareceAdicionais();
		
		if(evento.getSource() == jMiCaixa || evento.getSource() == jbAtalhoCaixa)
			apareceCaixa();
		
		if(evento.getSource() == jMiPedidos || evento.getSource() == jbAtalhoPedido)
			aparecePedido();
			
			
	}	
		
	private void apareceAdicionais() {
		if(gAdicionais == null){
			gAdicionais = new grafica.gAdicionais();
			gAdicionais.setLocation(((desktopPane.getWidth()/2) - (gAdicionais.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (gAdicionais.getHeight()/2)) - 30);
			gAdicionais.setVisible(true);
            desktopPane.add(gAdicionais);
        }
        else if(!gAdicionais.isVisible()){
        	gAdicionais.setVisible(true);
            desktopPane.add(gAdicionais);
        }
	}
	
	private void apareceUsuario() {
		if(vCadUsuario == null){
			vCadUsuario = new vCadUsuario();
			vCadUsuario.setLocation(((desktopPane.getWidth()/2) - (vCadUsuario.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (vCadUsuario.getHeight()/2)) - 30);
			vCadUsuario.setVisible(true);
            desktopPane.add(vCadUsuario);
        }
        else if(!vCadUsuario.isVisible()){
        	vCadUsuario.setVisible(true);
            desktopPane.add(vCadUsuario);
        }
    }


		private void apareceCliente() {
				
				if(vCadCliente == null){
					vCadCliente = new vCadCliente();
					vCadCliente.setLocation(((desktopPane.getWidth()/2) - (vCadCliente.getWidth()/2)), 
		            					((desktopPane.getHeight()/2) - (vCadCliente.getHeight()/2)) - 30);
					vCadCliente.setVisible(true);
		            desktopPane.add(vCadCliente);
		        }
		        else if(!vCadCliente.isVisible()){
		        	vCadCliente = null;
		        	apareceCliente();
		        	
		        	
		        }
			}
	
		
		private void apareceProduto() {
			
			if(vCadProduto == null){
				vCadProduto = new vCadProduto();
				vCadProduto.setLocation(((desktopPane.getWidth()/2) - (vCadProduto.getWidth()/2)), 
	            					((desktopPane.getHeight()/2) - (vCadProduto.getHeight()/2)) - 20);
				vCadProduto.setVisible(true);
	            desktopPane.add(vCadProduto);
	        }
	        else if(!vCadProduto.isVisible()){
	        	vCadProduto.setVisible(true);
	            desktopPane.add(vCadProduto);
	        }
		}
	
	
	private void apareceCaixa() {
        if(vMovCaixa == null){
        	vMovCaixa = new vMovCaixa();
        	
        	vMovCaixa.setLocation(((desktopPane.getWidth()/2) - (vMovCaixa.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (vMovCaixa.getHeight()/2)) - 30);
        	vMovCaixa.setVisible(true);
            desktopPane.add(vMovCaixa);
        }
        else if(!vMovCaixa.isVisible()){
        	vMovCaixa.setVisible(true);
            desktopPane.add(vMovCaixa);
        }
	}
	
	private void aparecePedido() {
		if(vMovPedido == null){
			vMovPedido = new vMovPedido();
			vMovPedido.setLocation(((desktopPane.getWidth()/2) - (vMovPedido.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (vMovPedido.getHeight()/2)) - 30);
			vMovPedido.setVisible(true);
            desktopPane.add(vMovPedido);
        }
        else if(!vMovPedido.isVisible()){
        	vMovPedido.setVisible(true);
            desktopPane.add(vMovPedido);
        }
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		int i =JOptionPane.showConfirmDialog(null,"Deseja Sair do Sistema?","Atenção",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(i==0) {
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
	
	
	
	

