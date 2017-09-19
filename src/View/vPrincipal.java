package View;

import java.awt.BorderLayout;
import java.awt.Color;
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
	
	private JDesktopPane desktopPane;
	
	private vCadUsuario frameUm;
	
	public vPrincipal() {
		super("Pizzaria Delivery 1.0");

		JMenus();
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.gray);
    
        setContentPane(desktopPane);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		configuraFrame();
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
		
		jMiUsuario.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new vCadUsuario();
				
			}
		});
		
		jMnMovimento = new JMenu("Movimento");
		
		jMiPedidos = new JMenuItem("Pedidos");
		jMiCaixa = new JMenuItem("Caixa");
		
		jMnMovimento.add(jMiPedidos);
		jMnMovimento.add(jMiCaixa);
		
		
		jMbar.add(jMnCadastro);
		jMbar.add(jMnMovimento);
		
		
		this.setJMenuBar(jMbar);
		jMiUsuario.addActionListener(new ActionListener(){
			 
            public void actionPerformed(ActionEvent evt){
 
                if(frameUm == null){
                    frameUm = new vCadUsuario();
                    frameUm.setLocation(((desktopPane.getWidth()/2) - (frameUm.getWidth()/2)), 
                    					((desktopPane.getHeight()/2) - (frameUm.getHeight()/2)) - 20);
                    frameUm.setVisible(true);
                    desktopPane.add(frameUm);
                }
                else if(!frameUm.isVisible()){
                    frameUm.setVisible(true);
                    desktopPane.add(frameUm);
                }
            }
        });
		
	}

	private void painelLateral(){
		GridLayout gl = new GridLayout(3, 1);
		
		jpAtalhosLateral = new paineis(110, 310);
		
		FlowLayout fl = new FlowLayout();
		
		jpAtalhosLateral.setLayout(gl);
		
		jbAtalhoCliente = new botoes( 100, 100);
		jbAtalhoCliente.setIcon(new ImageIcon(getClass().getResource("/imagens/cliente.png")));
		
		jbAtalhoPedido= new botoes(100, 100);
		jbAtalhoPedido.setIcon(new ImageIcon(getClass().getResource("/imagens/pedido.png")));

		jbAtalhoCaixa= new botoes(100, 100);
		jbAtalhoCaixa.setIcon(new ImageIcon(getClass().getResource("/imagens/caixa.png")));
		
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
	
	
	

}
