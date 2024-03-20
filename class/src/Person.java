/*3 - Crie uma classe Pessoa com os atributos nome, idade e gênero. Imprima
as informações da pessoa na tela.
 */

public class Person {
    public String name="Andre";
    public int age=32;
    public String sex="man";

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("O nome da pessoa -> "+person.name);
        System.out.println("A idade da pessoa -> "+person.age);
        System.out.println("O gênero da pessoa -> "+person.sex);
    }
}
