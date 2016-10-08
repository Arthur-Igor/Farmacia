package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CadastroPessoa {
	ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
	private Scanner ler;
	
public void cadastrarPessoas(){ //função para cadastro de pessoas
	
	ler = new Scanner(System.in);
	
	System.out.println("digite o nome: \n digite  'sair' para sair");
	String nome = ler.next();
	System.out.println("digite o cpf: \n digite  'sair' para sair");
	String cpf = ler.next();
	System.out.println("digite o endereco: \n digite  'sair' para sair");
	String endereco = ler.next();
	System.out.println("digite o telefone: \n digite  'sair' para sair");
	String telefone = ler.next();
	
	int a = 0; // int para interromper a verificação do cadastro
	
	while(!"sair".equals(nome) && !"sair".equals(cpf)&& !"sair".equals(telefone) && !"sair".equals(endereco) &&  a == 0){ // comparaçao de strings
	
		pessoasCadastradas.add(new Pessoa(nome,cpf,endereco,telefone));
		System.out.println("CADASTRO CONCLUÍDO! \n");
	a++;
	}//fim while
}	 //fim cadastrar pessoas

public void imprimirCadastro(){ //função para imprimir pessoas cadastradas cadastro
	

	Iterator<Pessoa> it = pessoasCadastradas.iterator(); // verifica no array as pessoas cadastradas
	while(it.hasNext()){ //Enquanto it "tem proximo", continue
		//System.out.println(it.next().toString()));//
	}
	
		}
	
	public void excluirPessoas(){ //funnção para excluir pessoas cadastradas de acordo com o nome
		
		ler = new Scanner(System.in);
		
		System.out.println("digite o nome de qm deseja excluir");
		String nome = ler.next();
		
		for(int i=0; i< pessoasCadastradas.size(); i++){
			if(pessoasCadastradas.get(i).getNome().equals(nome)){
//pega o indice i do objeo pessoa, pega o nome da pessoa e compara com o nome da pessoa digitada
				pessoasCadastradas.remove(i); //Remove a pessoa do tipo nome com o indice i

			}
		}
//remove all remove todas as pessoas com tal nome	
}
	public void imprimirPessoa(){ //função para imprimir as pessoas cadastrada a partir do cpf (nao funcional)
	ler = new Scanner(System.in);
	System.out.println("Digite o cpf da pessoa");
	String cpf = ler.next();
	for(int i = 0; i <pessoasCadastradas.size(); i++){
		if(pessoasCadastradas.get(i).getCpf().equals(cpf)){
			System.out.println(pessoasCadastradas.getClass());
			//pessoasCadastradas.toString();
			}
		}

	}
}
