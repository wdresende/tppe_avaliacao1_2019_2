package testesUnitarios;
import static org.junit.Assert.*;

import org.junit.Test;

import app.Turma;
import exceptions.DadosTurmaIncompletosException;

public class CriacaoTurmaTest {

	Turma t1; 
	
	@Test
	public void testInstanciacaoTurmaDadosCompletos() throws DadosTurmaIncompletosException {
		char codigo = 'A';
		String descricao = "Aulas as segundas e quartas, entre 14:00 e 16:00";
		int numVagas = 40;
		
		t1 = Turma.obterTurma(codigo, numVagas, descricao);
		
		assertNotNull(t1);
		assertEquals(codigo, t1.getCodigo());
		assertEquals(numVagas, t1.getNumVagas());
		assertEquals(descricao, t1.getDescricao());
	}
	
	@Test (expected = DadosTurmaIncompletosException.class)
	public void testInstanciacaoDadosIncompletos() throws DadosTurmaIncompletosException {
		char codigo = 'A'; 
		String descricao = "Aulas as segundas e quartas, entre 14:00 e 16:00";
		int numVagas = 0;
		
		t1 = Turma.obterTurma(codigo, numVagas, descricao);
	}

}
