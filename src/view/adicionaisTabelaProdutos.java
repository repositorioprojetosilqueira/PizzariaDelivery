package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.mTipoAdicionais;


public class adicionaisTabelaProdutos extends AbstractTableModel {

	private static final int COL_ID = 0;
	private static final int COL_TIPOPROD = 1;
	private static final int COL_PRECO = 2;
	private static final int COL_ATIVO = 3;
	
	List<mTipoAdicionais> linhas;

	private String[] colunas = new String[]{"Id", "Tipo Produto", "Preço", "Ativo"};

	public adicionaisTabelaProdutos(List<mTipoAdicionais> tipoProduto) {
		this.linhas = new ArrayList<>(tipoProduto);
		
	}

	public int getRowCount() {
		return linhas.size();
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	public Class getColumnClass(int columnIndex) {
		if (columnIndex == COL_ID) {
			return Integer.class;
		}
		else if (columnIndex == COL_ATIVO) {
			return Boolean.class;
		}
		return String.class;
	}
	
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if(columnIndex == COL_PRECO) 
		return true;
		else if(columnIndex ==COL_ATIVO)
		return true;
		
		return false;
		
	}

	public Object getValueAt(int row, int column) {

		mTipoAdicionais m = linhas.get(row);

		if (column == COL_ID) {
			return m.getCodTipoProduto();
		} else if (column == COL_TIPOPROD) {
			return m.gettDescTipo();
		} else if (column == COL_PRECO) {
			return m.getPreco();
		} 
		else if (column == COL_ATIVO) {
		return m.isAtivo();
		}
		
		return "";
	}

	public void setValueAt(Object aValue, int row, int column) {
		
		mTipoAdicionais tp = linhas.get(row);
		if (column == COL_ID) {
			tp.setCodTipoProduto((Integer) aValue);			
		} else if (column == COL_TIPOPROD) {
			tp.settDescTipo(aValue.toString());
		} else if (column == COL_PRECO) {
			try {
			tp.setPreco(Float.parseFloat(aValue.toString()));
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Somente Números, ex: 1.50");
			}
			
		}
		else if (column == COL_ATIVO) {
		tp.setAtivo((boolean)aValue);
		}

	}

	public mTipoAdicionais getTipoAdicionais(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addTipoAdicionais(mTipoAdicionais contato) {
		linhas.add(contato);
		int ultimoIndice = getRowCount() - 1;
		fireTableRowsInserted(ultimoIndice, ultimoIndice);

	}

	public void updateTipoAdicionais(int indiceLinha, mTipoAdicionais marca) {
		linhas.set(indiceLinha, marca);
		fireTableRowsUpdated(indiceLinha, indiceLinha);

	}

	public void removeTipoAdicionais(int indiceLinha) {
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);

	}
	public void removeTudoTipoAdicionais() {
		linhas.removeAll(linhas);
		fireTableRowsDeleted(0,1);

	}
}