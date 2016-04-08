public class Pessoa {

	private String nome;
	private int cpf;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, int cpf, String endereco, String telefone){
		this.endereco = endereco;
		this.telefone = telefone;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getCpf(){
	return cpf;
	}
	public void setCpf(int cpf){
	this.cpf = cpf;
	}
	@Override
	public String toString(){
		return "nome:" + getNome() + ", cpf" + getCpf()+ ", telefone" + getTelefone()+ ", endereco" + getEndereco();
	}
	
	}
