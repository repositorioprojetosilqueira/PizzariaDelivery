package model;

public class mTipoAdicionais{
	
	private int codTipoProduto;
	private int codAdicionais;
	private int adictipoprod;
	private String TipoProduto;
	private boolean ativo;
	
	private float preco;
	
	
	public mTipoAdicionais(){
		
	}
	

	public mTipoAdicionais(int codTipoProduto, int codAdicionais, int adictipoprod,String TipoProduto, float preco, boolean ativo) {
		super();
		this.codTipoProduto = codTipoProduto;
		this.codAdicionais = codAdicionais;
		this.adictipoprod = adictipoprod;
		this.TipoProduto = TipoProduto;
		this.preco = preco;
		
		this.adictipoprod = adictipoprod;
	}

	public int getCodTipoProduto() {
		return codTipoProduto;
	}

	public void setCodTipoProduto(int codTipoProduto) {
		this.codTipoProduto = codTipoProduto;
	}

	public int getCodAdicionais() {
		return codAdicionais;
	}

	public void setCodAdicionais(int codAdicionais) {
		this.codAdicionais = codAdicionais;
	}

	public int getadictipoprod() {
		return adictipoprod;
	}
	
	public void setadictipoprod(int adictipoprod) {
		this.adictipoprod = adictipoprod;
	}
	
	public String getTipoProduto() {
		return TipoProduto;
	}


	public void setTipoProduto(String tipoProduto) {
		TipoProduto = tipoProduto;
	}


	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

	
	
}
