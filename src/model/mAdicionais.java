package model;

public class mAdicionais extends mTipoProduto{

	private int codAdicionais;
	private String aDescricao;
	private String aPreco;
	private Boolean aStatus;
	
	
	public mAdicionais(){
		
	}
	
	public mAdicionais(int codAdicionais, String aDescricao, String aPreco, Boolean aStatus){
		super();
		this.codAdicionais = codAdicionais;
		this.aDescricao = aDescricao;
		this.aPreco = aPreco;
		this.aStatus = aStatus;
		
	}
	
	
	public int getCodAdicionais() {
		return codAdicionais;
	}
	public void setCodAdicionais(int codAdicionais) {
		this.codAdicionais = codAdicionais;
	}
	public String getaDescricao() {
		return aDescricao;
	}
	public void setaDescricao(String aDescricao) {
		this.aDescricao = aDescricao;
	}
	public String getaPreco() {
		return aPreco;
	}
	public void setaPreco(String aPreco) {
		this.aPreco = aPreco;
	}
	public Boolean getaStatus() {
		return aStatus;
	}
	public void setaStatus(Boolean aStatus) {
		this.aStatus = aStatus;
	}

	public void setaBoolean(boolean boolean1) {
		// TODO Auto-generated method stub
		
	}

		
}
