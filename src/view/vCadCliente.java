package view;


import javax.swing.JFormattedTextField;


import javax.swing.JLabel;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;

public class vCadCliente extends vTelaPadrao {  
	
	    public vCadCliente() {
	           
	    	super("Cadastro Cliente","/imagens/cliente.png");
	    	
	    	initLayoutCliente(303, 11);
	    	
	    	
	    	listagem();
	    	
	    	}
	    	
	    	public void initLayoutCliente(int x, int y) {
	    		
	    		JPanel jpCliente = new JPanel();
	    		
	    		jpCliente.setSize(483,406);
	    		jpCliente.setLocation(x,y);
	    		jpCliente.setLayout(null);
	    		//800x500
	    		
	    		JLabel label = new JLabel("Nome: ");
	    		label.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label.setBounds(0, 19, 67, 14);
	    		jpCliente.add(label);
	    		
	    		JLabel label_1 = new JLabel("Telefone: ");
	    		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label_1.setBounds(0, 66, 67, 14);
	    		jpCliente.add(label_1);
	    		
	    		JLabel label_2 = new JLabel("Telefone:");
	    		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label_2.setBounds(247, 66, 73, 14);
	    		jpCliente.add(label_2);
	    		
	    		JLabel label_3 = new JLabel("Rua:");
	    		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label_3.setBounds(8, 119, 59, 14);
	    		jpCliente.add(label_3);
	    		
	    		JLabel label_4 = new JLabel("N\u00BA:");
	    		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label_4.setBounds(342, 119, 38, 14);
	    		jpCliente.add(label_4);
	    		
	    		JLabel label_5 = new JLabel("Complemento:");
	    		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label_5.setBounds(247, 168, 86, 14);
	    		jpCliente.add(label_5);
	    		
	    		JLabel label_6 = new JLabel("Bairro:");
	    		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
	    		label_6.setBounds(9, 168, 58, 14);
	    		jpCliente.add(label_6);
	    		
	    		JLabel label_7 = new JLabel("Refer\u00EAncia de Entrega:");
	    		label_7.setBounds(34, 214, 173, 14);
	    		jpCliente.add(label_7);
	    		
	    		JLabel label_8 = new JLabel("Historico de Compras: ");
	    		label_8.setBounds(34, 323, 175, 14);
	    		jpCliente.add(label_8);
	    		
	    		JTextField textField;
	    		JTextField textField_1;

	    		JTextField textField_2;
	    		JTextField textField_3;
	    		JTextField textField_4;

	    		
	    		textField = new JTextField();
	    		textField.setColumns(10);
	    		textField.setBounds(77, 11, 395, 30);
	    		
	    		
	    		JFormattedTextField formattedTextField = new JFormattedTextField();
	    		formattedTextField.setBounds(77, 58, 142, 30);
	    		
	    		
	    		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	    		formattedTextField_1.setBounds(330, 58, 142, 30);
	    		
	    		
	    		textField_1 = new JTextField();
	    		textField_1.setColumns(10);
	    		textField_1.setBounds(77, 111, 256, 30);
	    		
	    		
	    		textField_2 = new JTextField();
	    		textField_2.setColumns(10);
	    		textField_2.setBounds(390, 111, 82, 30);
	    		
	    		
	    		textField_3 = new JTextField();
	    		textField_3.setColumns(10);
	    		textField_3.setBounds(335, 160, 137, 30);
	    		
	    		
	    		textField_4 = new JTextField();
	    		textField_4.setColumns(10);
	    		textField_4.setBounds(77, 160, 173, 30);
	    		
	    		
	    		JTextArea textArea = new JTextArea();
	    		textArea.setWrapStyleWord(true);
	    		textArea.setLineWrap(true);
	    		textArea.setBounds(32, 239, 440, 73);
	    		
	    		
	    		JTextArea textArea_1 = new JTextArea();
	    		textArea_1.setWrapStyleWord(true);
	    		textArea_1.setLineWrap(true);
	    		textArea_1.setBounds(32, 348, 440, 48);
	    		
	    		
	    		jpCliente.add(textField);
	    		jpCliente.add(formattedTextField);
	    		jpCliente.add(formattedTextField_1);
	    		jpCliente.add(textField_1);
	    		jpCliente.add(textField_2);
	    		jpCliente.add(textField_3);
	    		jpCliente.add(textField_4);
	    		jpCliente.add(textArea);
	    		jpCliente.add(textArea_1);
	    		
	    		textField.setNextFocusableComponent(formattedTextField);
	    		
	    		jpCentro.add(jpCliente);
	    		
	    	}
	    	
	    private void listagem() {
	    	
	    
	    	
	    		String[] colunas = {"Nome","Telefone1","Telefone2"," "};
	    		Object[][] FonteDeDados= {
	    		{"Bruna Gomes", "3222-9908","9 9988-0001",Boolean.TRUE},
	    		{"Denise Pacheco", "3232-9901","9 9988-0001",Boolean.TRUE},
	    		{"Everaldo Junior", "3222-9908","9 9988-0001",Boolean.TRUE},
	    		{"Fernanda Pacheco", "3222-9908","9 9988-0001",Boolean.TRUE},
	    		{"Gabriela Xavier", "3222-9908","9 9988-0001",Boolean.TRUE},
	    		{"Geovanna Antunes", "3222-9908","9 9988-0001",Boolean.TRUE},
	    		{" ", " "}			
	    		};
	    		
	    		lista(colunas, FonteDeDados,3,45,290, this.getHeight()-124,105);
	    		campoPesquisa("Pesquisar : ", 5, 8, 70,218);
	    	}

	    	
	    	 /*
	    private void tabelac() {
	    	JTable tabela  = new  JTable(new AbstractTableModel() { 
	    		 public boolean isCellEditable(int rowIndex, int mColIndex) {  
		                return true;  
		            }  
		        
	    		
	    	String[] columns = {"STUDENT ID", "NAME", "SCORE", "PASSED"};
	        Object[][] data = {
	                {"S001", "ALICE", 90.00, Boolean.TRUE},
	                {"S002", "BOB", 45.50, Boolean.FALSE},
	                {"S003", "CAROL", 60.00, Boolean.FALSE},
	                {"S004", "MALLORY", 75.80, Boolean.TRUE}
	        };
	        
	      
	        
	        public int getRowCount() {
	            return data.length;
	        }

	        public int getColumnCount() {
	            return columns.length;
	        }

	        public Object getValueAt(int rowIndex, int columnIndex) {
	            return data[rowIndex][columnIndex];
	        }

	        @Override
	        public String getColumnName(int column) {
	            return columns[column];
	        }

	        //
	        // This method is used by the JTable to define the default
	        // renderer or editor for each cell. For example if you have
	        // a boolean data it will be rendered as a check box. A
	        // number value is right aligned.
	        //
	        @Override
	        public Class<?> getColumnClass(int columnIndex) {
	            return data[0][columnIndex].getClass();
	        
	        }	    	
	        
	        
	    	  });
	    	
	    	
	    	JScrollPane scrollPane= new JScrollPane(tabela);
			
			
			//scrollPane.setBounds(5,40, width, height);
			scrollPane.setBounds(10,10, 250, 200);
			 
			jpCentro.add(scrollPane);
			
	   
	    	}
	    	
	    */
	    
	   
	    	
}
	    
	    	
	    


			
	    	
	    	
	    

