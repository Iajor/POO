/*
 * 2) Faça as implementações dos métodos do exercício 1 para uma ContaInvestimento e ContaPoupanca 
 * e apresente mensagens na tela. 
 * A ContaInvestimento deve possuir um método atualizaRendimentos que deve acrescer 5% ao saldo. 
 * Já a ContaPoupanca deve possuir um método atualizaJuros que deve acrescer 3% ao saldo da conta.
 */
package Atividades;

public abstract class Conta {
	public double saldo;
	public double limite;
	
	public Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	public abstract void depositar();
	public abstract void sacar();
}
