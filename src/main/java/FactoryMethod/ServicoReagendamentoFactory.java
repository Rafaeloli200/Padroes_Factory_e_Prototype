package FactoryMethod;

import FactoryModel.IServico;
import FactoryModel.ServicoReagendamento;

public class ServicoReagendamentoFactory implements IServicoFactory {

    @Override
    public IServico obterServico() {
        return new ServicoReagendamento();
    }

}
