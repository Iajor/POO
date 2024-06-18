/*1) Crie uma classe chamada Animal com os atributos privadas Nome e Idade. 
 * Também deve possuir os métodos get e set para encapsulamento. 
 * Crie também um método abstrato chamado EmitirSom. 
 * Crie duas classes que herdam de Animal, 
 * uma chamada Cachorro e outra chamada Gato, que implementam o método EmitirSom.
 * 
 */
package Atividades;

public class Animal {
	private String nome;
	private int idade;
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void emitirSom() {
		System.out.println("Animal fazendo som...");
	}
	
}
