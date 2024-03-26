public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void alugar(){System.out.println("Carro da marca "+marca+" e modelo "+modelo+" alugado");}
    public void devolver(){System.out.println("Carro da marca "+marca+" e modelo "+modelo+" devolvido");}
    public void exibirDados(){System.out.println("Carro: "+marca+"\nModelo: "+modelo);}
}
