package model;

public class Cliente extends Pessoa{
int[] historicoPedidos;
int id;

	public Cliente(String nome, String cpf, String telefone, String endereco, int[] historicoPedidos) {
		super(nome, cpf, endereco, telefone);
		this.historicoPedidos = historicoPedidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getHistoricoPedidos() {
		return historicoPedidos;
	}

	public void setHistoricoPedidos(int[] historicoPedidos) {
		this.historicoPedidos = historicoPedidos;
	}
}
