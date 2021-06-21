
package FactoryMethod;

import FactoryModel.IServico;
import FactoryModel.ServicoAgendamento;


public class ServicoAgendamentoFactory implements IServicoFactory{

    @Override
    public IServico obterServico() {
        return new ServicoAgendamento();
    }
    
}
