package model;

public class mAdicionais {

	private int codAdicionais;
	private String aDescricao;
	private double aPreco;
	private String aStatus;
	
	
	public mAdicionais(){
		
	}
	
	public mAdicionais(int codAdicionais, String aDescricao, double aPreco, String aStatus){
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
	public double getaPreco() {
		return aPreco;
	}
	public void setaPreco(double aPreco) {
		this.aPreco = aPreco;
	}
	public String getaStatus() {
		return aStatus;
	}
	public void setaStatus(String aStatus) {
		this.aStatus = aStatus;
	}
	
	
}
