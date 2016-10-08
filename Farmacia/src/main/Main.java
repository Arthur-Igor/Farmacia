package main;

import java.util.Scanner;

import model.CadastroItens;
import model.CadastroPessoa;

public class Main {

private static Scanner ler;

	public static void main(String[] args) {
		int a;
			CadastroPessoa t = new CadastroPessoa();
			CadastroItens i = new CadastroItens();
		boolean proximo = true;
		ler = new Scanner(System.in);
		while (proximo){
				
			System.out.println("1-Cliente 2- Funcionario(PESSOAS)  \n 4 - pedido(nao funcionando) \n 5- itens \n digite '000' para sair");// menu 1
			a = ler.nextInt();
			switch(a){ 
				case 1: //Caso cliente
				//menu 2
					System.out.println("PESSOAS>> \n 1-Adicionar \n 2- Mostrar cadastrados \n 4 - excluir  \n digite '000' para voltar.");
					int b = ler.nextInt();
			switch(b){
				case 1:
		    	    System.out.println("----------");
		    		t.cadastrarPessoas();
		    		System.out.println("---------- \n");
		    	 break;
		    	 
				case 2:
					System.out.println("----------");
		    		t.imprimirCadastro();
		    		System.out.println("---------- \n");
		    	 break;
		    	 
				case 3:
					t.imprimirPessoa();
		    	 break;
			
				case 4:	

					System.out.println("----------");
					t.excluirPessoas();
					System.out.println("----------");
					System.out.println("lista atualizada");
					System.out.println("----------");
					t.imprimirCadastro();
					System.out.println("----------  \n");
				break;
			
					}
			break;
				case 5: //caso itens
				//menu 6
					System.out.println("ITENS >>> \n 1-Adicionar \n 2- Mostrar cadastrados \n 4- excluir  \n digite '000' para voltar");
					int c = ler.nextInt();
			switch(c){
			case 1:
		    	 System.out.println("----------");
		    		i.cadastrarItens();
		    		System.out.println("---------- \n");
		    	 break;
		    	 
		    case 2:
		    	 System.out.println("----------");
		    		i.imprimirCadastro();
		    		System.out.println("---------- \n");
		    	 break;
		    	 
			case 3:
		    	 i.imprimirItem();
		    	 break;
			
			case 4:	
	    		System.out.println("----------");
				i.excluirItem();;
				System.out.println("----------");
				System.out.println("lista atualizada");
				System.out.println("----------");
				i.imprimirCadastro();
				System.out.println("----------  \n");
				break;
			
		}	
			
			}
		if(a == 000){
				
				System.out.println("Bye");
				proximo = false;
					}//fimIf
//			System.out.println("deseja repetir? [s|n]");
//			String continua = ler.next();
		
				}
				
	}
}
//		}
//		
//		
//		while (proximo){
//		System.out.println("1-Cadastrar \n 2- Imprimir  \n 4 - excluir \n 5- sair ");
//		a = ler.nextInt();
//
//		switch(a){
