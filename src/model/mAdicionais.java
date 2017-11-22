package model;

public class mAdicionais extends mTipoProduto{

	private int codAdicionais;
	private String aDescricao;
	private String aPreco;
	private Boolean aStatus;
	private int adictipoprod;
	
	
	public mAdicionais(){
		
	}
	
	public mAdicionais(int codAdicionais, String aDescricao, String aPreco, Boolean aStatus, int adictipoprod){
		super();
		this.codAdicionais = codAdicionais;
		this.aDescricao = aDescricao;
		this.aPreco = aPreco;
		this.aStatus = aStatus;
		this.adictipoprod = adictipoprod;
		
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
	public int getadictipoprod() {
		return adictipoprod;
	}
	public void setadictipoprod(int adictipoprod) {
		this.adictipoprod = adictipoprod;
	}

	public void setaBoolean(boolean boolean1) {
		// TODO Auto-generated method stub
		
	}

		
}
