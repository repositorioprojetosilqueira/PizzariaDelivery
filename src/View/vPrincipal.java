package View;

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
	
	private JMenu jMnCadastro, jMnMovimento;
	private JMenuItem jMiUsuario, jMiCliente, jMiProdutos, jMiPedidos, jMiCaixa;
	
	private paineis jpAtalhosLateral; 
	
	private botoes jbAtalhoCliente, jbAtalhoPedido, jbAtalhoCaixa;
	
	private JDesktopPane desktopPane;
	
	private vCadUsuario vCadUsuario;
	private vCadCliente vCadCliente;
	private vMovPedido vMovPedido;
	private vMovCaixa vMovCaixa;
	
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
        });
		
		jMiCliente.addActionListener(new ActionListener(){
			 
            public void actionPerformed(ActionEvent evt){
 
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
        });
	}
	
	

	private void painelLateral(){
		GridLayout gl = new GridLayout(3, 1);
		
		jpAtalhosLateral = new paineis(110, 310);
		
		FlowLayout fl = new FlowLayout();
		
		jpAtalhosLateral.setLayout(gl);
		
		jbAtalhoCliente = new botoes( 100, 100);
		jbAtalhoCliente.setIcon(new ImageIcon(getClass().getResource("/imagens/cliente.png")));
		
		jbAtalhoCliente.addActionListener(new ActionListener(){
			 
            public void actionPerformed(ActionEvent evt){
 
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
        });
		
		jbAtalhoPedido= new botoes(100, 100);
		jbAtalhoPedido.setIcon(new ImageIcon(getClass().getResource("/imagens/pedido.png")));

		jbAtalhoPedido.addActionListener(new ActionListener(){
			 
            public void actionPerformed(ActionEvent evt){
 
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
        });
		jbAtalhoCaixa= new botoes(100, 100);
		jbAtalhoCaixa.setIcon(new ImageIcon(getClass().getResource("/imagens/caixa.png")));
		
		jbAtalhoCaixa.addActionListener(new ActionListener(){
			 
            public void actionPerformed(ActionEvent evt){
 
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
        });
		
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
