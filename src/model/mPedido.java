package model;

public class mPedido {
	
	private int codPedido;
	private String peFormaPagamento;
	private boolean peStatus;
	private String peTxEntrega;
	private double peVlTotal;
	private int peTotalProdutos;
	private int pe_codCliente;
	
	public mPedido() {
		
	}
	
	public mPedido(int codPedido, String peFormaPagamento, boolean peStatus, String peTxEntrega, double peVlTotal, int peTotalProdutos, int pe_codCliente) {
		super();
		this.codPedido = codPedido;
		this.peFormaPagamento = peFormaPagamento;
		this.peStatus = peStatus;
		this.peTxEntrega = peTxEntrega;
		this.peVlTotal = peVlTotal;
		this.peTotalProdutos = peTotalProdutos;
		this.pe_codCliente = pe_codCliente;
		
	}
	
	
	
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}
	public String getPeFormaPagamento() {
		return peFormaPagamento;
	}
	public void setPeFormaPagamento(String peFormaPagamento) {
		this.peFormaPagamento = peFormaPagamento;
	}
	public boolean isPeStatus() {
		return peStatus;
	}
	public void setPeStatus(boolean peStatus) {
		this.peStatus = peStatus;
	}
	public String getPeTxEntrega() {
		return peTxEntrega;
	}
	public void setPeTxEntrega(String peTxEntrega) {
		this.peTxEntrega = peTxEntrega;
	}
	public double getPeVlTotal() {
		return peVlTotal;
	}
	public void setPeVlTotal(double peVlTotal) {
		this.peVlTotal = peVlTotal;
	}
	public int getPeTotalProdutos() {
		return peTotalProdutos;
	}
	public void setPeTotalProdutos(int peTotalProdutos) {
		this.peTotalProdutos = peTotalProdutos;
	}
	public int getPe_codCliente() {
		return pe_codCliente;
	}
	public void setPe_codCliente(int pe_codCliente) {
		this.pe_codCliente = pe_codCliente;
	}
	
	
	
	

}
