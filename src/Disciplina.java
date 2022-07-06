import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private ArrayList<Trabalho> trabalhos;
	private ArrayList<Aluno> alunos;

	public Disciplina(String nome) {
		this.nome = nome;
		this.trabalhos = new ArrayList<Trabalho>();
		this.alunos = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

  public void add(Aluno aluno, Trabalho trabalho){
    trabalhos.add(trabalho);
    alunos.add(aluno);
  }

  public void addNota(double nota, Aluno aluno, Trabalho trabalho){
    if(!this.alunos.contains(aluno) && !this.trabalhos.contains(trabalho)){
			throw new RuntimeException("Não existe trabalho ou aluno");
		}

		aluno.add(nota, trabalho);
  }
}