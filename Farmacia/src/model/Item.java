package model;

public class Item {
String nomeItem;
String fabricante;
String fornecedor;
String valorUnitario;
String id;

public Item(String nomeItem, String fabricante, String fornecedor, String valorUnitario, String id){
	this.nomeItem = nomeItem;
	this.fabricante = fabricante;
	this.fornecedor = fornecedor;
	this.valorUnitario = valorUnitario;
	this.id = id;
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
public String getValorUnitario() {
	return valorUnitario;
}
public void setValorUnitario(String valorUnitario) {
	this.valorUnitario = valorUnitario;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

}
