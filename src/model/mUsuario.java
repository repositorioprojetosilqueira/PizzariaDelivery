package model;

public class mUsuario {
	private int codUsuario; 
	private String uNome;
	private String uFuncao; 
	private String uEmail;
	private String uTelefone;
	private String uLogin; 
	private String uSenha; 
	private String uStatus;
	
	
	public mUsuario() {
		
	}
	
	
	public mUsuario(int codUsuario, String uNome, String uFuncao, String uEmail, String uTelefone, String uLogin,
			String uSenha, String uStatus) {
		super();
		this.codUsuario = codUsuario;
		this.uNome = uNome;
		this.uFuncao = uFuncao;
		this.uEmail = uEmail;
		this.uTelefone = uTelefone;
		this.uLogin = uLogin;
		this.uSenha = uSenha;
		this.uStatus = uStatus;
	}
	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getuNome() {
		return uNome;
	}
	public void setuNome(String uNome) {
		this.uNome = uNome;
	}
	public String getuFuncao() {
		return uFuncao;
	}
	public void setuFuncao(String uFuncao) {
		this.uFuncao = uFuncao;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuTelefone() {
		return uTelefone;
	}
	public void setuTelefone(String uTelefone) {
		this.uTelefone = uTelefone;
	}
	public String getuLogin() {
		return uLogin;
	}
	public void setuLogin(String uLogin) {
		this.uLogin = uLogin;
	}
	public String getuSenha() {
		return uSenha;
	}
	public void setuSenha(String uSenha) {
		this.uSenha = uSenha;
	}
	public String getuStatus() {
		return uStatus;
	}
	public void setuStatus(String uStatus) {
		this.uStatus = uStatus;
	}
	

}
