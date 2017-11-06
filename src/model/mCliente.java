package model;

public class mCliente {

	private int codCliente;
	private String cNome;
	private String cTelefone1;
	private String cTelefone2;
	private String cRua;
	private String cNumero;
	private String cBairro;
	private String cComplemento;
	private String cRefEntrega;
	private String cHistCompras;
	
	
	

	public mCliente() {
		
	}
	
	
	public mCliente(int codCliente, String cNome, String cTelefone1, String cTelefone2, String cRua, String cNumero,
			String cBairro, String cComplemento, String cRefEntrega, String cHistCompras) {
		super();
		this.codCliente = codCliente;
		this.cNome = cNome;
		this.cTelefone1 = cTelefone1;
		this.cTelefone2 = cTelefone2;
		this.cRua = cRua;
		this.cNumero = cNumero;
		this.cBairro = cBairro;
		this.cComplemento = cComplemento;
		this.cRefEntrega = cRefEntrega;
		this.cHistCompras = cHistCompras;
	}

	
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getcNome() {
		return cNome;
	}
	public void setcNome(String cNome) {
		this.cNome = cNome;
	}
	public String getcTelefone1() {
		return cTelefone1;
	}
	public void setcTelefone1(String cTelefone1) {
		this.cTelefone1 = cTelefone1;
	}
	public String getcTelefone2() {
		return cTelefone2;
	}
	public void setcTelefone2(String cTelefone2) {
		this.cTelefone2 = cTelefone2;
	}
	public String getcRua() {
		return cRua;
	}
	public void setcRua(String cRua) {
		this.cRua = cRua;
	}
	public String getcNumero() {
		return cNumero;
	}
	public void setcNumero(String cNumero) {
		this.cNumero = cNumero;
	}
	public String getcBairro() {
		return cBairro;
	}
	public void setcBairro(String cBairro) {
		this.cBairro = cBairro;
	}
	public String getcComplemento() {
		return cComplemento;
	}

	public void setcComplemento(String cComplemento) {
		this.cComplemento = cComplemento;
	}
	public String getcRefEntrega() {
		return cRefEntrega;
	}
	public void setcRefEntrega(String cRefEntrega) {
		this.cRefEntrega = cRefEntrega;
	}
	public String getcHistCompras() {
		return cHistCompras;
	}
	public void setcHistCompras(String cHistCompras) {
		this.cHistCompras = cHistCompras;
	}
}
