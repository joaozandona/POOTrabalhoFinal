
public class App {
    public static void main(String[] args) throws Exception {
        
        // Dados
        Disciplina disciplina = new Disciplina("POO");
        
        Aluno aluno1 = new Aluno("Joao", 18);
        Aluno aluno2 = new Aluno("Marco", 21);

        Trabalho trabalho1 = new Trabalho("Trabalho 1", 5.0);
        Trabalho trabalho2 = new Trabalho("Trabalho 2", 5.0);

        disciplina.add(aluno1, trabalho1);
        disciplina.add(aluno2, trabalho2);

        disciplina.addNota(10.0, aluno1, trabalho1);
        disciplina.addNota(3.0, aluno1, trabalho2);
        disciplina.addNota(7.0, aluno2, trabalho1);
        disciplina.addNota(8.0, aluno2, trabalho2);

        System.out.println(aluno1.getNome()+" : "+aluno1.mediaFinal());
        System.out.println(aluno2.getNome()+" : "+aluno2.mediaFinal());
    }
}
