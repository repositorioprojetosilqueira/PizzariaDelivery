package view;


	import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
	import java.util.HashMap;
	import java.util.Map;

import javax.swing.JFrame;

import dao.ConectionFactory;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

	/**
	 * Ponto de entrada do projeto.
	 *
	 * @author David Buzatto
	 */
	
	public class testeRelatorio {
	private Connection conexao;
	    public void abrirRelatorioClientes() throws Exception {
	    	 
	        /*
	         * Obtendo o arquivo do relat�rio.
	         * Note que estamos utilizando um InputStream para obter o arquivo que
	         * est� dentro do nosso projeto. Fazendo isso, n�o teremos problema
	         * quando nosso projeto for empacotado em um .jar.
	         *
	         * Note que o caminho do .jasper inicia com /, ou seja, a raiz da
	         * localiza��o das classes compiladas do nosso projeto
	         * (o pacote default).
	         *
	         * Utilize a aba Files (canto superior esquerdo) e veja que os arquivos
	         * .jasper e .jrxml s�o copiados para o diret�rio /build/classes
	         * e por consequencia para o .jar que for criado.
	         *
	         * Se n�o os estiver vendo, mande dar um Clean and Build no projeto
	         * (bot�o direito no n� raiz do projeto, Clean and Build (Limpar e Construir)
	         *
	         */
	        InputStream inputStream = getClass().getResourceAsStream( "/relatorios/Cliente.jasper" );
	 
	        // mapa de par�metros do relat�rio (ainda vamos aprender a usar)
	        Map<String,Object> parametros = new HashMap();
	        conexao = ConectionFactory.getConnection("MYSQL");	        
	        System.out.println(conexao);
	     
	        	
	            /* abre o relat�rio
	            geradorRelatorios.openReport( "Clientes", inputStream, parametros, conexao );
	            System.out.println("passeiaqui");
	 */
	            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao );
	    
            /*
             * Cria um JRViewer para exibir o relat�rio.
             * Um JRViewer � uma JPanel.
             */
            JRViewer viewer = new JRViewer( print );
     
            // cria o JFrame
            JFrame frameRelatorio = new JFrame( "Clientes" );
     
            // adiciona o JRViewer no JFrame
            frameRelatorio.add( viewer, BorderLayout.CENTER );
     
            // configura o tamanho padr�o do JFrame
            frameRelatorio.setSize( 500, 500 );
     
            // maximiza o JFrame para ocupar a tela toda.
            frameRelatorio.setExtendedState( JFrame.MAXIMIZED_BOTH );
     
            // configura a opera��o padr�o quando o JFrame for fechado.
            frameRelatorio.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
     
            // exibe o JFrame
            frameRelatorio.setVisible( true );
     
        }
	}
	

