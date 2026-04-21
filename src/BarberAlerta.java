public class BarberAlerta {
    public static void main(String[] args) {
        System.out.println("Barber Alerta!");

        //Criando objeto cliente com setters
        Cliente cliente = new Cliente();
        cliente.setNome("Matheus");
        cliente.setTelefone("11999999999");

        //2. Criando objeto agendamento com setters 
        Agendamento agendamento = new Agendamento();
        agendamento.setData("2026-10-10");
        agendamento.setHorario("10:00");
        agendamento.setCliente(cliente);
        agendamento.setServico("Corte");
        agendamento.setObservacao("um corte moderno");

        //3. Mostrando na tela os dados do agendamento  
        System.out.println("Data: " + agendamento.getData());   
        System.out.println("Horario: " + agendamento.getHorario());
        System.out.println("Cliente: " + agendamento.getCliente().getNome());
        System.out.println("Servico: " + agendamento.getServico());
        System.out.println("Observacao: " + agendamento.getObservacao());


    }
}