package entities;

public class Conta {
	
	private int numero;
	private String nome;
	private double balanco;
	
	
	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoInicial) {
		super();
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBalanco() {
		return balanco;
	}
	
	public void deposito(double valor) {
		balanco += valor;
	}
	public void retirada(double valor) {
		balanco -= valor + 5.0;
	}
	public String toString() {
		return "Conta: "
				+ numero
				+ ", nome: "
				+ nome
				+ ", Balanço: "
				+ String.format("%.2f", balanco);
	}

}
