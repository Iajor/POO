/*2) Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e Emprestado (bool). Crie método que retorne as informações do livro. Crie também um método responsável por fazer o empréstimo do livro e outro para fazer a devolução. Faça o controle disto utilizando o atributo Emprestado. */

package atividades_26032024;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean emprestado;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public void emprestarLivro(){
        if (!emprestado){
            emprestado = true;
            System.out.println("Empréstimo realizado");
        }
        else System.out.println("Livro já emprestado");
    }

    public void devolverLivro(){
        if (emprestado){
            emprestado = false;
            System.out.println("Livro devolvido");
        }
        else System.out.println("Livro disponível para emprestar");
    }
}
