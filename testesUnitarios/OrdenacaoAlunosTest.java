package testesUnitarios;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import app.Aluno;
import app.CadastroAlunos;
import exceptions.DadosAlunoIncompletoException;

public class OrdenacaoAlunosTest {
	
	CadastroAlunos c; 
	Aluno a1, a2, a3, a4, a5, a6, a7, a8, a9;
	
	@Before
	public void setup() throws DadosAlunoIncompletoException {
		c = CadastroAlunos.obterCadastroAlunos(); 
		
		a1 = Aluno.obterAluno("ggggg", "99", "9999999", "", ""); 
		a2 = Aluno.obterAluno("hhhhh", "77", "7777777", "", "");
		a3 = Aluno.obterAluno("eeeee", "55", "5555555", "", "");
		a4 = Aluno.obterAluno("fffff", "66", "6666666", "", "");
		a5 = Aluno.obterAluno("aaaaa", "11", "1111111", "", "");
		a6 = Aluno.obterAluno("iiiii", "88", "8888888", "", "");
		a7 = Aluno.obterAluno("ccccc", "33", "3333333", "", "");
		a8 = Aluno.obterAluno("bbbbb", "22", "2222222", "", "");
		a9 = Aluno.obterAluno("ddddd", "44", "4444444", "", "");
		
		c.adicionarAluno(a1);
		c.adicionarAluno(a2);
		c.adicionarAluno(a3);
		c.adicionarAluno(a4);
		c.adicionarAluno(a5);
		c.adicionarAluno(a6);
		c.adicionarAluno(a7);
		c.adicionarAluno(a8);
		c.adicionarAluno(a9);
	}
	
	
	@Test
	public void ordenacaoAlunosTest() {
		Aluno[] alunos = c.ordenarAlunos();
		Aluno[] esperado = new Aluno[] {a5, a8, a7, a9, a3, a4, a2, a6, a1};
		
		assertArrayEquals(esperado, alunos);
	}
}
