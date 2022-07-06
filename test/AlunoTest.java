import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AlunoTest {
  
  @Test
	public void testMediaFinalRetornaZeroQuandoNaoTemNotas() {
		Aluno aluno = new Aluno("Maria", "18");

		assertEquals(0.0, aluno.mediaFinal(), 0.1);
	}

  @Test
	public void testErroAoAdicionarUmaNotaNegativaAoUmAluno() {
		Disciplina disciplina = new Disciplina("Matematica");
		Trabalho trab = new Trabalho("Trabalho 1", 10.0F);
		Aluno aluno = new Aluno("Maria", "18");

		Assertions.assertThrows(RuntimeException.class, () -> {
			aluno.addNota(-1.0F, trab);
		});
	}
}
