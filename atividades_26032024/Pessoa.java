/*Crie uma classe chamada Pessoa. Nesta classe deve conter os atributos: Nome, email, data de nascimento, Endereço e o atributo Admin do tipo booleano. Crie um método que retorne o Email da pessoa. Crie um método chamado promoverAdmin que ao ser chamado altera o atributo Admin. Faça a leitura de duas pessoas na main e mantenha uma como admin e outra não.
*/

package atividades_26032024;

public class Pessoa {
    private String nome;
    private String email;
    private String dataNascimento;
    private String endereco;
    private boolean admin;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public void promoverAdmin(){
        if (!admin){
            admin = true;
            System.out.println("promovido a admin");
        }
    }
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.promoverAdmin();
        pessoa2.setAdmin(false);
        
    }
}
