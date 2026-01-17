package exercicios;

import java.time.LocalDate;

public class EventoPresencial extends Evento{

    public EventoPresencial(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    @Override
    public void informacaoEvento() {
        System.out.println("evento presencial: " + nome + ", data: " + data);
    }
}
