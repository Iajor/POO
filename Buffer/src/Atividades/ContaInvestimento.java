/*
 * 2) Faça as implementações dos métodos do exercício 1 para uma ContaInvestimento e ContaPoupanca 
 * e apresente mensagens na tela. 
 * A ContaInvestimento deve possuir um método atualizaRendimentos que deve acrescer 5% ao saldo. 
 * Já a ContaPoupanca deve possuir um método atualizaJuros que deve acrescer 3% ao saldo da conta.
 */
package Atividades;

public class ContaInvestimento extends Conta {
	
	public ContaInvestimento(double saldo, double limite) {
		super(saldo, limite);
	}

	@Override
	public void depositar() {
		System.out.println("Depositando..");
	}

	@Override
	public void sacar() {
		System.out.println("Sacando...");
	}
	public void atualizaRendimentos() {
		System.out.println("Atualizando rendimentos...");
		saldo+=saldo*0.05;
	}
	
}
