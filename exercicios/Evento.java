package exercicios;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Evento {

    protected String nome;
    protected LocalDate data;

    public abstract void informacaoEvento();
}
