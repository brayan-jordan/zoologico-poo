package prova;

public class animais {

	private double tamanho, peso;
	private String nome;
	private int idade;
	private String subespecie;
	private boolean colunaVertebral;
	private String tipo1, tipo2;
	private String g;
	
	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
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

	public animais(double tamanho, double peso, String nome, int idade, String subespecie, boolean colunaVertebral, String g) {
		this.tamanho = tamanho;
		this.peso = peso;
		this.nome = nome;
		this.idade = idade;
		this.subespecie = subespecie;
		this.colunaVertebral = colunaVertebral;
		this.g = g;
	}

	public String getSubespecie() {
		return subespecie;
	}

	public void setSubespecie(String subespecie) {
		this.subespecie = subespecie;
	}

	public boolean isColunaVertebral() {
		return colunaVertebral;
	}

	public void setColunaVertebral(boolean colunaVertebral) {
		this.colunaVertebral = colunaVertebral;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	
	
	
	

}
