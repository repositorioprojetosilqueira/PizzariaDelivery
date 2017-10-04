package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import grafica.gCadProduto;
import grafica.gCaixa;
import grafica.gMovPedido;
import grafica.gPedido;

public class vPrincipal extends JFrame implements ActionListener{
	private JMenuBar jMbar;
	private JMenu jMnCadastro, jMnMovimento, jMnProduto;

	private JMenuItem jMiUsuario, jMiCliente, jMiProdutos, jMiAdicionais, jMiPedidos, jMiCaixa;
	
	private paineis jpAtalhosLateral; 
	
	private botoes jbAtalhoCliente, jbAtalhoPedido, jbAtalhoCaixa;
	private JDesktopPane desktopPane;
	

	private grafica.gAdicionais gAdicionais;
	private grafica.gCadCliente gCadCliente;
	private grafica.gCadProduto gCadProduto;
	private grafica.gUsuario gUsuario;
	private grafica.gMovPedido gMovPedido;
	private grafica.gMovCaixa gMovCaixa;
	
	
	
	public vPrincipal() {
		super("Pizzaria Delivery 1.0");
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.gray);
    
        setContentPane(desktopPane);
		
		this.setVisible(true);
		
		JMenus();
		configuraFrame();
		painelLateral();
		
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Janela Maximizada
		this.setIconImage(new ImageIcon(getClass().getResource("/imagens/pedido.png")).getImage());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//this.addWindowListener((WindowListener) this);				
		
	}
	
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
		
		this.add(jpAtalhosLateral);
		
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
		if(gUsuario == null){
            gUsuario = new grafica.gUsuario();
            gUsuario.setLocation(((desktopPane.getWidth()/2) - (gUsuario.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (gUsuario.getHeight()/2)) - 30);
            gUsuario.setVisible(true);
            desktopPane.add(gUsuario);
        }
        else if(!gUsuario.isVisible()){
            gUsuario.setVisible(true);
            desktopPane.add(gUsuario);
        }
    }


		private void apareceCliente() {
				
				if(gCadCliente == null){
					gCadCliente = new grafica.gCadCliente();
					gCadCliente.setLocation(((desktopPane.getWidth()/2) - (gCadCliente.getWidth()/2)), 
		            					((desktopPane.getHeight()/2) - (gCadCliente.getHeight()/2)) - 30);
					gCadCliente.setVisible(true);
		            desktopPane.add(gCadCliente);
		        }
		        else if(!gCadCliente.isVisible()){
		        	gCadCliente.setVisible(true);
		            desktopPane.add(gCadCliente);
		        }
			}
	
		
		private void apareceProduto() {
			
			if(gCadProduto == null){
				gCadProduto = new grafica.gCadProduto();
				gCadProduto.setLocation(((desktopPane.getWidth()/2) - (gCadProduto.getWidth()/2)), 
	            					((desktopPane.getHeight()/2) - (gCadProduto.getHeight()/2)) - 20);
				gCadProduto.setVisible(true);
	            desktopPane.add(gCadProduto);
	        }
	        else if(!gCadProduto.isVisible()){
	        	gCadProduto.setVisible(true);
	            desktopPane.add(gCadProduto);
	        }
		}
	
	
	private void apareceCaixa() {
        if(gMovCaixa == null){
        	gMovCaixa = new grafica.gMovCaixa();
        	
        	gMovCaixa.setLocation(((desktopPane.getWidth()/2) - (gMovCaixa.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (gMovCaixa.getHeight()/2)) - 30);
        	gMovCaixa.setVisible(true);
            desktopPane.add(gMovCaixa);
        }
        else if(!gMovCaixa.isVisible()){
        	gMovCaixa.setVisible(true);
            desktopPane.add(gMovCaixa);
        }
	}
	
	private void aparecePedido() {
		if(gMovPedido == null){
			gMovPedido = new gMovPedido();
			gMovPedido.setLocation(((desktopPane.getWidth()/2) - (gMovPedido.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (gMovPedido.getHeight()/2)) - 30);
			gMovPedido.setVisible(true);
            desktopPane.add(gMovPedido);
        }
        else if(!gMovPedido.isVisible()){
        	gMovPedido.setVisible(true);
            desktopPane.add(gMovPedido);
        }
	}
}
	
	
	
	

