package testesUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Professor;
import exceptions.DadosProfessorIncompletosException;

public class CriacaoProfessorTest {

	Professor p; 
	
	@Test
	public void testCriacaoProfessor() throws DadosProfessorIncompletosException {
		String nome = "André Lanna";
		String matricula = "1010101";
		String email = "alalal@ala.br";
		
		p = Professor.obterProfessor(nome, matricula, email);
		assertNotNull(p);
		assertEquals(nome, p.getNome());
		assertEquals(matricula, p.getMatricula());
		assertEquals(email, p.getEmail());
	}
	
	
	@Test (expected = DadosProfessorIncompletosException.class)
	public void testCriacaoProfessorDadosIncompletos() throws DadosProfessorIncompletosException {
		String nome = "";
		String matricula = "1010101";
		String email = "alalal@ala.br";
		
		p = Professor.obterProfessor(nome, matricula, email);
	}

}
