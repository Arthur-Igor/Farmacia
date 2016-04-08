
public class Cliente extends Pessoa{
int[] historicoPedidos;

	public Cliente(String nome, int cpf, String telefone, String endereco, int[] historicoPedidos) {
		super(nome, cpf, endereco, telefone);
		this.historicoPedidos = historicoPedidos;
	}

	public int[] getHistoricoPedidos() {
		return historicoPedidos;
	}

	public void setHistoricoPedidos(int[] historicoPedidos) {
		this.historicoPedidos = historicoPedidos;
	}
}
