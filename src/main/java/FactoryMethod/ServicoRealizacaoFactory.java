package FactoryMethod;

import FactoryModel.IServico;
import FactoryModel.ServicoRealizacao;

public class ServicoRealizacaoFactory implements IServicoFactory {

    @Override
    public IServico obterServico() {
        return new ServicoRealizacao();
    }
}
