package FactoryModel;

public class ServicoAgendamento implements IServico {

    @Override
    public String executar() {
        return "Agendamento de voo efetivado";
    }

  
    @Override
    public String cancelar() {
        return "Agendamento de voo abortado";
    }
}
