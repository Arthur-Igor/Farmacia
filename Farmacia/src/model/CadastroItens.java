package model;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CadastroItens {
	ArrayList<Item> itensCadastrados = new ArrayList<Item>();
	private Scanner ler;
	//inicio funçoes de cadastro de itens
public void cadastrarItens(){
	
	ler = new Scanner(System.in);
	
	System.out.println("digite nome, \n digite  'sair' para sair");
	String nomeItem = ler.next();
	System.out.println("digite o fabricante, \n digite  'sair' para sair");
	String fabricante = ler.next();
	System.out.println("digite o fornecedor, \n digite  'sair' para sair");
	String fornecedor = ler.next();
	System.out.println("digite o Valor do item, \n digite  'sair' para sair");
	String valorUnitario = ler.next();
	System.out.println("digite o id do item, \n digite  'sair' para sair");
	String id = ler.next();
	
	int a = 0; //int para interromper a verificação do cadastro
	
	while(!"sair".equals(nomeItem) && !"sair".equals(fabricante)&& !"sair".equals(fornecedor) && !"sair".equals(valorUnitario) 
			&& !"sair".equals(id)&& a == 0){ // comparaçao de strings
	
		itensCadastrados.add(new Item(nomeItem, fabricante, fornecedor, valorUnitario, id));
		System.out.println("CADASTRO CONCLUÍDO! \n");
	a++;
	}//fim while
}	 //fim cadastrar pessoas

public void imprimirCadastro(){ //função para imprimir cadastro
	

	Iterator<Item> it = itensCadastrados.iterator();
	while(it.hasNext()){ //Enquanto it "tem proximo", continue
		System.out.println(it.next().getNomeItem());

	}
	
		}
	
	public void excluirItem(){ // função para excluir itens
		
		ler = new Scanner(System.in);
		
		System.out.println("digite o nome do item que deseja excluir");
		String nome = ler.next();
		
		for(int i=0; i< itensCadastrados.size(); i++){ //verificação no array de itens para imprimir o que já está cadastrado
			if(itensCadastrados.get(i).getNomeItem().equals(nome)){
//pega o indice i do objeo pessoa, pega o nome da pessoa e compara com o nome da pessoa digitada
				itensCadastrados.remove(i); //Remove a pessoa do tipo nome com o indice i

			}
		}
//remove all remove todas as pessoas com tal nome	
}
	public void imprimirItem(){  //função para imprimir item a partir do id (incompleto)
	ler = new Scanner(System.in);
	System.out.println("Digite o ID do item");
	String id = ler.next();
	for(int i = 0; i <itensCadastrados.size(); i++){
		if(itensCadastrados.get(i).getId().equals(id)){
			System.out.println();
			}
		}
	}

}
