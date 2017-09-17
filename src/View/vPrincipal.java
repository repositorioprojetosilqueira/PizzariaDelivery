package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class vPrincipal extends JFrame{
	private JMenuBar jMbar;
	
	private JMenu jMnCadastro;
	private JMenuItem jMiUsuario;
	private JMenuItem jMiCliente;
	private JMenuItem jMiProdutos;
	
	private JMenu jMnMovimento;
	private JMenuItem jMiPedidos;
	private JMenuItem jMiCaixa;
	
	private paineis jpAtalhosLateral; 
	
	private botoes jbAtalhoCliente;
	private botoes jbAtalhoPedido;
	private botoes jbAtalhoCaixa;
	
	public vPrincipal() {
		super("Pizzaria Delivery 1.0");

		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		
		//this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//this.setResizable(false);
		
		this.setVisible(true);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		configuraFrame();
		JMenus();
		painelLateral();
		
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Janela Maximizada
		
		
		//this.addWindowListener((WindowListener) this);				
		
	}
	
	private void JMenus() {

		jMbar = new JMenuBar();
		
		jMnCadastro = new JMenu("Cadastro");
		
		jMiUsuario = new JMenuItem("Usuário");
		jMiCliente = new JMenuItem("Cliente");
		jMiProdutos = new JMenuItem("Produtos");
		
		jMnCadastro.add(jMiUsuario);
		jMnCadastro.add(jMiCliente);
		jMnCadastro.add(jMiProdutos);
		
		
		
		jMnMovimento = new JMenu("Movimento");
		
		jMiPedidos = new JMenuItem("Pedidos");
		jMiCaixa = new JMenuItem("Caixa");
		
		jMnMovimento.add(jMiPedidos);
		jMnMovimento.add(jMiCaixa);
		
		
		jMbar.add(jMnCadastro);
		jMbar.add(jMnMovimento);
		
		this.setJMenuBar(jMbar);
		
	}

	private void painelLateral(){
		jpAtalhosLateral = new paineis(100, 100);
		
		FlowLayout fl = new FlowLayout();
		
		jpAtalhosLateral.setLayout(fl);
		
		jbAtalhoCliente = new botoes("Cliente", 100, 100);
		
		
		jbAtalhoPedido= new botoes("Pedido", 100, 100);
		

		jbAtalhoCaixa= new botoes("Caixasfd adf ", 100, 100);
		
		
		jpAtalhosLateral.add(jbAtalhoCliente);
		jpAtalhosLateral.add(jbAtalhoPedido);
		jpAtalhosLateral.add(jbAtalhoCaixa);
		
		this.add(jpAtalhosLateral, BorderLayout.WEST);
		
	}

	private void configuraFrame() {
	    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //setLocation(0, 0);
	    Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment()
	      .getMaximumWindowBounds();
	    setSize((int) rect.getWidth(), (int) rect.getHeight());
	  }
	

}
