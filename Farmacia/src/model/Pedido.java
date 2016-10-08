package model;
public class Pedido {
int quantidadeDeItens;
double valorTotal;
int[] conjuntoDeItensID;
int id;
public Pedido(int quantidadeDeItens, double valorTotal, int[] conjuntoDeItensID, int id){
	this.quantidadeDeItens = quantidadeDeItens;
	this.valorTotal = valorTotal;
	this.conjuntoDeItensID = conjuntoDeItensID;
	this.id = id;
}
public int[] getConjuntoDeItensID() {
	return conjuntoDeItensID;
}
public void setConjuntoDeItensID(int[] conjuntoDeItensID) {
	this.conjuntoDeItensID = conjuntoDeItensID;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantidadeDeItens() {
	return quantidadeDeItens;
}
public void setQuantidadeDeItens(int quantidadeDeItens) {
	this.quantidadeDeItens = quantidadeDeItens;
}
public double getValorTotal() {
	return valorTotal;
}
public void setValorTotal(double valorTotal) {
	this.valorTotal = valorTotal;
}
public int[] getConjuntoDeItens() {
	return conjuntoDeItensID;
}
public void setConjuntoDeItens(int[] conjuntoDeItens) {
	this.conjuntoDeItensID = conjuntoDeItens;
}
public double comissao(){
	return valorTotal * 0.10;
}
}
