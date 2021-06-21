package FactoryModel;

public class ServicoCancelamento implements IServico {

    @Override
    public String executar() {
        return "Cancelamento de voo efetivado";
    }

    @Override
    public String cancelar() {
        return "Cancelamento de voo abortado";
    }

}
