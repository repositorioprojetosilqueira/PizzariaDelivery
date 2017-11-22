package model;

public class mTipoAdicionais extends mTipoProduto{
	
	private int codTipoProduto;
	private int codAdicionais;
	private int adictipoprod;
	
	public mTipoAdicionais(){
		
	}
	
	public mTipoAdicionais(int codTipoProduto, int codAdicionais){
		super();
		this.codTipoProduto = codTipoProduto;
		this.codAdicionais = codAdicionais;
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
	
	
	
}
