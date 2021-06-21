package FactoryModel;

import FactoryMethod.ServicoRealizacaoFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServicoRealizacaoTest {

    @Test
    void deveExecutarRealizacao() {
        IServico servico = new ServicoRealizacaoFactory().obterServico();
        assertEquals("Voo efetivado", servico.executar());
    }

    @Test
    void deveCancelarRealizacao() {
        IServico servico = new ServicoRealizacaoFactory().obterServico();
        assertEquals("Voo abortado", servico.cancelar());
    }

}