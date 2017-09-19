package View;

import java.awt.Color;
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


public class vPrincipal extends JFrame implements ActionListener{
	private JMenuBar jMbar;
	
	private JMenu jMnCadastro, jMnMovimento;
	private JMenuItem jMiUsuario, jMiCliente, jMiProdutos, jMiPedidos, jMiCaixa;
	
	private paineis jpAtalhosLateral; 
	
	private botoes jbAtalhoCliente, jbAtalhoPedido, jbAtalhoCaixa;
	
	private JDesktopPane desktopPane;
	
	private vCadUsuario vCadUsuario;
	private vCadCliente vCadCliente;
	private vCadProduto vCadProduto;
	private vMovPedido vMovPedido;
	private vMovCaixa vMovCaixa;
	
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
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//this.addWindowListener((WindowListener) this);				
		
	}
	
	private void JMenus() {

		jMbar = new JMenuBar();
		
		jMnCadastro = new JMenu("Cadastro");
		
		jMiUsuario = new JMenuItem("Usuário");
		jMiCliente = new JMenuItem("Cliente");
		jMiProdutos = new JMenuItem("Produtos");
		
		jMiUsuario.addActionListener(this);
 		jMiCliente.addActionListener(this);
		jMiProdutos.addActionListener(this);
		
		jMnCadastro.add(jMiUsuario);
		jMnCadastro.add(jMiCliente);
		jMnCadastro.add(jMiProdutos);

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
		
		jpAtalhosLateral = new paineis(110, 310);
		
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
		
		if(evento.getSource() == jMiCaixa || evento.getSource() == jbAtalhoCaixa)
			apareceCaixa();
		
		if(evento.getSource() == jMiPedidos || evento.getSource() == jbAtalhoPedido)
			aparecePedido();
	}	
		
	
	
	private void apareceUsuario() {
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

	private void apareceCliente() {
		if(vCadCliente == null){
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
	
	
	
	

