import static org.junit.Assert.*;

import org.junit.Test;


public class AlgunsProjetosTest {

	@Test
	public void deveExpresarAIdadeEmDias() {
		int idadeEmDias = CalculandoDias.calcularIdadeEmDias("19 11 28");
		assertEquals(7293, idadeEmDias);
	}
	
	@Test
	public void deveCalcularPercentualTotalDeVotos() {
		double[] resultadoFinalVotos = CalculandoPercentualVotos.calcularVotos(1000, 500, 300, 200);
		assertArrayEquals(new double[] {50,30,20}, resultadoFinalVotos, 0);
	}


}
