package model;

public class mTipoAdicionais {
	
	private int codTipoProduto;
	private int codAdicionais;
	
	public mTipoAdicionais(){
		
	}
	
	public mTipoAdicionais(int codTipoProduto, int codAdicionais){
		super();
		this.codTipoProduto = codTipoProduto;
		this.codAdicionais = codAdicionais;
		
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

	
	
	
	
}
