package entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEventos {
    public List <Evento> evento = new ArrayList<>();

    public void adicionarEvento (Evento evento) {
        this.evento.add(evento);
    }

    public List<Evento> mostrarEvents(){
        return evento;
    }

}
