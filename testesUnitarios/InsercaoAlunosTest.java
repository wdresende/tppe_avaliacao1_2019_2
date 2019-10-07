package testesUnitarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.Aluno;
import app.CadastroAlunos;
import exceptions.DadosAlunoIncompletoException;

public class InsercaoAlunosTest {

	CadastroAlunos c; 
	
	@Before
	public void setup() throws DadosAlunoIncompletoException {
		Aluno a = Aluno.obterAluno("Miguel", "11", "1111111", "asd@asd.com", "61-99999-9999");
		
		c = CadastroAlunos.obterCadastroAlunos();
		
		c.adicionarAluno(a);
	}
	
	@Test
	public void testCadastroUmAluno() throws DadosAlunoIncompletoException {
		Aluno a = Aluno.obterAluno("Andre", "13", "1313131", "alalal@alal.com", "61-99999-9999");
		
		boolean insercao = c.adicionarAluno(a);
		
		assertTrue(insercao); 
		
		Aluno p = c.pesquisarAluno("13", "1313131"); 
		assertNotNull(p); 
		assertEquals("Andre", p.getNome());
		assertEquals("13", p.getPrefixoMatricula()); 
		assertEquals("1313131", p.getSufixoMatricula());
		assertEquals("alalal@alal.com", p.getEmail());
		assertEquals("61-99999-9999", p.getCelular());
	}

	
	@Test
	public void testeCadastroUmAlunoRepetido() throws DadosAlunoIncompletoException {
		Aluno a = Aluno.obterAluno("Miguel", "11", "1111111", "asd@asd.com", "61-99999-9999");
		
		boolean insercao = c.adicionarAluno(a); 
		
		assertFalse(insercao);
	}
}
