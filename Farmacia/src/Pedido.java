public class Pedido {
int quantidadeDeItens;
double valorTotal;
int[] conjuntoDeItens;
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
	return conjuntoDeItens;
}
public void setConjuntoDeItens(int[] conjuntoDeItens) {
	this.conjuntoDeItens = conjuntoDeItens;
}
public double comissao(){
	return valorTotal * 0.10;
}
}
