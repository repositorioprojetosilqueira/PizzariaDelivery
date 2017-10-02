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

import grafica.gCliente;


public class vPrincipal extends JFrame implements ActionListener{
	private JMenuBar jMbar;
	
	private JMenu jMnCadastro, jMnMovimento, jMnProduto;
	private JMenuItem jMiUsuario, jMiCliente, jMiProdutos, jMiAdicionais, jMiPedidos, jMiCaixa;
	
	private paineis jpAtalhosLateral; 
	
	private botoes jbAtalhoCliente, jbAtalhoPedido, jbAtalhoCaixa;
	
	private JDesktopPane desktopPane;
	
	private vCadUsuario vCadUsuario;
	
	
	
	private vCadCliente vCadCliente;
	private vCadProduto vCadProduto;
	private vMovPedido vMovPedido;
	private vMovCaixa vMovCaixa;
	private grafica.gAdicionais gAdicionais;
	private grafica.gCadCliente gCadCliente;
	private grafica.gProduto gProduto;
	private grafica.gUsuario gUsuario;
	
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
		
		jMiUsuario = new JMenuItem("Usu�rio");
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
		
		FlowLayout fl = new FlowLayout();
		
		jpAtalhosLateral.setLayout(gl);
		
		jbAtalhoCliente = new botoes( 100, 100);
		jbAtalhoCliente.setIcon(new ImageIcon(getClass().getResource("/imagens/cliente.png")));
		
		jbAtalhoCliente.addActionListener(this);
		
		jbAtalhoPedido= new botoes(100, 100);
		jbAtalhoPedido.setIcon(new ImageIcon(getClass().getResource("/imagens/pedido.png")));

		jbAtalhoPedido.addActionListener(this);
        
		jbAtalhoCaixa= new botoes(100, 100);
		jbAtalhoCaixa.setIcon(new ImageIcon(getClass().getResource("/imagens/caixa.png")));
		
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
            					((desktopPane.getHeight()/2) - (gAdicionais.getHeight()/2)) - 20);
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
            					((desktopPane.getHeight()/2) - (gUsuario.getHeight()/2)) - 20);
            gUsuario.setVisible(true);
            desktopPane.add(gUsuario);
        }
        else if(!gUsuario.isVisible()){
            gUsuario.setVisible(true);
            desktopPane.add(gUsuario);
        }
    }

	
	/*private void apareceUsuario() {
			if(vCadUsuario == null){
	            vCadUsuario = new vCadUsuario();
	            vCadUsuario.setLocation(((desktopPane.getWidth()/2) - (vCadUsuario.getWidth()/2)), 
	            					((desktopPane.getHeight()/2) - (vCadUsuario.getHeight()/2)) - 20);
	            vCadUsuario.setVisible(true);
	            desktopPane.add(vCadUsuario);
	        }
	        else if(!vCadUsuario.isVisible()){
	            vCadUsuario.setVisible(true);
	            desktopPane.add(vCadUsuario);
	        }
	    }
	*/
		private void apareceCliente() {
				
				if(gCadCliente == null){
					gCadCliente = new grafica.gCadCliente();
					gCadCliente.setLocation(((desktopPane.getWidth()/2) - (gCadCliente.getWidth()/2)), 
		            					((desktopPane.getHeight()/2) - (gCadCliente.getHeight()/2)) - 20);
					gCadCliente.setVisible(true);
		            desktopPane.add(gCadCliente);
		        }
		        else if(!gCadCliente.isVisible()){
		        	gCadCliente.setVisible(true);
		            desktopPane.add(gCadCliente);
		        }
			}
	
	

	/*private void apareceCliente() {
		
		if(gCliente == null){
        	vCadCliente = new vCadCliente();
        	vCadCliente.setLocation(((desktopPane.getWidth()/2) - (vCadCliente.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (vCadCliente.getHeight()/2)) - 20);
        	vCadCliente.setVisible(true);
            desktopPane.add(vCadCliente);
        }
        else if(!vCadCliente.isVisible()){
        	vCadCliente.setVisible(true);
            desktopPane.add(vCadCliente);
        }
	}
	*/
	private void apareceProduto() {
		
		if(vCadProduto == null){
			vCadProduto = new vCadProduto();
			vCadProduto.setLocation(((desktopPane.getWidth()/2) - (vCadProduto.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (vCadProduto.getHeight()/2)) - 20);
			vCadProduto.setVisible(true);
            desktopPane.add(vCadProduto);
        }
        else if(!vCadCliente.isVisible()){
        	vCadCliente.setVisible(true);
            desktopPane.add(vCadCliente);
        }
	}
	
	
	private void apareceCaixa() {
        if(vMovCaixa == null){
        	vMovCaixa = new vMovCaixa();
        	
        	vMovCaixa.setLocation(((desktopPane.getWidth()/2) - (vMovCaixa.getWidth()/2)), 
            					((desktopPane.getHeight()/2) - (vMovCaixa.getHeight()/2)) - 20);
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
            					((desktopPane.getHeight()/2) - (vMovPedido.getHeight()/2)) - 20);
        	vMovPedido.setVisible(true);
            desktopPane.add(vMovPedido);
        }
        else if(!vMovPedido.isVisible()){
        	vMovPedido.setVisible(true);
            desktopPane.add(vMovPedido);
        }
	}
}
	
	
	
	

