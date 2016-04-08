

public class Funcionario extends Pessoa  {
	
	public double salariobase;
	public String[] vendas;

	public int idf;

	public Funcionario(String nome, int cpf, String endereco, String telefone, double salarioBase, String[] vendas,int idf){
		super(nome, cpf, endereco, telefone);
		this.salariobase = salarioBase;
		this.vendas = vendas;
		this.idf = idf;
	}

	public double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}

	public String[] getVendas() {
		return vendas;
	}

	public void setVendas(String[] vendas) {
		this.vendas = vendas;
	}

	public int getIdf() {
		return idf;
	}

	public void setIdf(int idf) {
		this.idf = idf;
	}
	
}
//public String toString(){
//	return super.toString() + ", salario base: " + getSalarioBase() + ", matricula: " + matricula + 
//", tempo de serviço:" + tempoDeServico;
//}
//	