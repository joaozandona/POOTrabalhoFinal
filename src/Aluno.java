import java.util.HashMap;

public class Aluno {

	private String nome;
	private int idade;
  private HashMap<Trabalho, Double> notas;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.notas = new HashMap<Trabalho, Double>();
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

	public double mediaFinal() {
		double somaN = 0.0;
		double somaP = 0.0;

		for(Trabalho trabalho : notas.keySet()){
			somaN += notas.get(trabalho) * trabalho.getPeso();
			somaP += trabalho.getPeso();
		}
		return somaN / somaP;
	}

	public void add(Double nota, Trabalho trabalho){
		if(nota > 0.0 && nota <= trabalho.getPeso()){
			notas.put(trabalho, nota);
		}
	}

}