package Arquivos;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Pedro", 19);
		List<Aluno> lista = new ArrayList<>();
		Arquivo arquivo = new Arquivo("alunos");
		arquivo.gravarArquivo(aluno1);
		arquivo.gravarArquivo(aluno2);
		arquivo.gravarArquivo(aluno3);
		
		lista = arquivo.lerArquivo();
		
		for (Aluno aluno : lista) {
			System.out.println("Nome: "+aluno.getNome()+" ,Idade: "+aluno.getIdade());
		}
	}

}
