package FactoryModel;

public class ServicoRealizacao implements IServico {

    @Override
    public String executar() {
        return "Voo efetivado";
    }

    @Override
    public String cancelar() {
        return "Voo abortado";
    }

}
