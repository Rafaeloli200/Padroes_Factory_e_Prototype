package FactoryModel;

import FactoryMethod.ServicoReagendamentoFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServicoReagendamentoTest {

    @Test
    void deveExecutarReagendamento() {
        IServico servico = new ServicoReagendamentoFactory().obterServico();
        assertEquals("Reagendamento de voo efetivado", servico.executar());
    }

    @Test
    void deveCancelarReagendamento() {
        IServico servico = new ServicoReagendamentoFactory().obterServico();
        assertEquals("Reagendamento de voo abortado", servico.cancelar());
    }

}
