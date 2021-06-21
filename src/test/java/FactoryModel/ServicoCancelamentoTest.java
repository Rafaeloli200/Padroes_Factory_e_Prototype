package FactoryModel;

import FactoryMethod.ServicoCancelamentoFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServicoCancelamentoTest {

    @Test
    void deveExecutarCancelamento() {
        IServico servico = new ServicoCancelamentoFactory().obterServico();
        assertEquals("Cancelamento de voo efetivado", servico.executar());
    }

    @Test
    void deveCancelarCancelamento() {
        IServico servico = new ServicoCancelamentoFactory().obterServico();
        assertEquals("Cancelamento de voo abortado", servico.cancelar());
    }

}
