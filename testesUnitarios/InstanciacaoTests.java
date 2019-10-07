package testesUnitarios;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CriacaoAlunoTest.class, CriacaoTurmaTest.class, CriacaoDisciplinaTest.class, CriacaoProfessorTest.class })
public class InstanciacaoTests {

}
