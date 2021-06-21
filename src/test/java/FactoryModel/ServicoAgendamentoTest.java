package FactoryModel;

import FactoryMethod.ServicoAgendamentoFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServicoAgendamentoTest {

    @Test
    void deveExecutarAgendamento() {
        IServico servico = new ServicoAgendamentoFactory().obterServico();
        assertEquals("Agendamento de voo efetivado", servico.executar());
    }

    @Test
    void deveCancelarAgendamento() {
        IServico servico = new ServicoAgendamentoFactory().obterServico();
        assertEquals("Agendamento de voo abortado", servico.cancelar());
    }

}
