
package FactoryMethod;

import FactoryModel.IServico;
import FactoryModel.ServicoCancelamento;


public class ServicoCancelamentoFactory implements IServicoFactory{

    @Override
    public IServico obterServico() {
        return new ServicoCancelamento();
    }
    
}
