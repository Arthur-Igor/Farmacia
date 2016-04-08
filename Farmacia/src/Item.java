public class Item {
String nomeItem;
String fabricante;
String fornecedor;
double valorUnitario;
int id;
String[] itens;

public Item(String nomeItem, String fabricante, String fornecedor, double valorUnitario, int id, String [] itens){
	this.nomeItem = nomeItem;
	this.fabricante = fabricante;
	this.fornecedor = fornecedor;
	this.valorUnitario = valorUnitario;
	this.id = id;
	this.itens = itens;
}

public String getNomeItem() {
	return nomeItem;
}
public void setNomeItem(String nomeItem) {
	this.nomeItem = nomeItem;
}
public String getFabricante() {
	return fabricante;
}
public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}
public String getFornecedor() {
	return fornecedor;
}
public void setFornecedor(String fornecedor) {
	this.fornecedor = fornecedor;
}
public double getValorUnitario() {
	return valorUnitario;
}
public void setValorUnitario(double valorUnitario) {
	this.valorUnitario = valorUnitario;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
