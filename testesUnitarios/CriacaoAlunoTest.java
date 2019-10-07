package testesUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Aluno;
import exceptions.DadosAlunoIncompletoException;

public class CriacaoAlunoTest {

	Aluno a; 
	
	@Test
	public void testInstanciacaoAlunos() throws DadosAlunoIncompletoException {
		String nome = "Andre Lanna"; 
		String prefixoMatricula = "13"; 
		String sufixoMatricula = "1313131";
		String email = "alalal@al.br";
		String celular = "(61)99999-9999";
		
		a = Aluno.obterAluno(nome, prefixoMatricula, sufixoMatricula, email, celular);
		assertNotNull(a);
		assertEquals (nome, a.getNome());
		assertEquals (prefixoMatricula, a.getPrefixoMatricula());
		assertEquals (sufixoMatricula, a.getSufixoMatricula());
		assertEquals(email, a.getEmail());
		assertEquals(celular, a.getCelular());
	}
	
	@Test (expected = DadosAlunoIncompletoException.class)
	public void testInstanciacaoAlunosDadosIncompletos() throws DadosAlunoIncompletoException {
		String nome = ""; 
		String prefixoMatricula = "13"; 
		String sufixoMatricula = "1313131";
		String email = "alalal@al.br";
		String celular = "(61)99999-9999";
		
		a = Aluno.obterAluno(nome, prefixoMatricula, sufixoMatricula, email, celular);
	}

}
