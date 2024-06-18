/*1) Crie uma classe chamada Animal com os atributos privadas Nome e Idade. 
 * Também deve possuir os métodos get e set para encapsulamento. 
 * Crie também um método abstrato chamado EmitirSom. 
 * Crie duas classes que herdam de Animal, 
 * uma chamada Cachorro e outra chamada Gato, que implementam o método EmitirSom.
 * 
 */
package Atividades;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("au au");
	}
	
}
