package exercicios;

import java.time.LocalDate;

public class EventoOnline extends Evento{

    public EventoOnline(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    @Override
    public void informacaoEvento() {
        System.out.println("evento online: " + nome + ", data: " + data);
    }
}
