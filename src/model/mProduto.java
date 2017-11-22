package model;

public class mProduto {
	
	private int codProduto;
	private String pDescicao;
	private String pPreco;
	private Boolean pStatus;
	
	private int p_CodTipoProduto;

	public mProduto() {
		
	}
	
	public mProduto(int codProduto, String pDescicao, String pPreco, Boolean pStatus, int p_CodTipoProduto) {
		super();
		this.codProduto = codProduto;
		this.pDescicao = pDescicao;
		this.pPreco = pPreco;
		this.pStatus = pStatus;
		this.p_CodTipoProduto = p_CodTipoProduto;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getpDescicao() {
		return pDescicao;
	}

	public void setpDescicao(String pDescicao) {
		this.pDescicao = pDescicao;
	}

	public String getpPreco() {
		return pPreco;
	}

	public void setpPreco(String pPreco) {
		this.pPreco = pPreco;
	}

	public Boolean getpStatus() {
		return pStatus;
	}

	public void setpStatus(Boolean pStatus) {
		this.pStatus = pStatus;
	}

	public int getP_CodTipoProduto() {
		return p_CodTipoProduto;
	}

	public void setP_CodTipoProduto(int p_CodTipoProduto) {
		this.p_CodTipoProduto = p_CodTipoProduto;
	}

	public Object getadictipoprod() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
