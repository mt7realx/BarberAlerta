public class Agendamento { 

    //Atributos
    String data;
    String horario;
    Cliente cliente;
    String servico;
    String observacao;

    //Construtor vazio
    public Agendamento() {
    }

//Getters (pega os valores dos atributos)
    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getServico() {
        return servico;
    }

    public String getObservacao() {
        return observacao;
    }


//Setters (guarda os valores dos atributos)
    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}