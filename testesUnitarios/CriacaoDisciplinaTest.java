package testesUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Disciplina;
import exceptions.DadosDisciplinaIncompletosException;

public class CriacaoDisciplinaTest {

	Disciplina d; 
	
	@Test
	public void testCriacaoDisciplina() throws Exception {
		String nome = "Orientação por Objetos";
		String departamento = "FGA"; 
		String codigo = "195341"; 
		int creditosTeoria = 0;
		int creditosPratica = 4; 
		int creditosExtensao = 0; 
		int creditosEstudos = 0;
		
		d = Disciplina.obterDisciplina(nome, departamento, codigo, creditosTeoria, creditosPratica, creditosExtensao, creditosEstudos);
		assertNotNull(d); 
		assertEquals(nome, d.getNome());
		assertEquals(departamento, d.getDepartamento());
		assertEquals(codigo, d.getCodigo());
		assertEquals(creditosTeoria, d.getCreditosTeoria());
		assertEquals(creditosPratica, d.getCreditosPratica());
		assertEquals(creditosExtensao, d.getCreditosExtensao());
		assertEquals(creditosEstudos, d.getCreditosEstudos());
	}
	
	
	@Test (expected = DadosDisciplinaIncompletosException.class)
	public void testCriacaoDisciplinaDadosIncompletos() throws DadosDisciplinaIncompletosException {
		String nome = "";
		String departamento = "FGA"; 
		String codigo = "195341"; 
		int creditosTeoria = 0;
		int creditosPratica = 4; 
		int creditosExtensao = 0; 
		int creditosEstudos = 0;
		
		d = Disciplina.obterDisciplina(nome, departamento, codigo, creditosTeoria, creditosPratica, creditosExtensao, creditosEstudos);
	}

}
