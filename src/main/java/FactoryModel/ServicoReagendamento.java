package FactoryModel;

public class ServicoReagendamento implements IServico {

    @Override
    public String executar() {
        return "Reagendamento de voo efetivado";
    }

    @Override
    public String cancelar() {
        return "Reagendamento de voo abortado";
    }
}
