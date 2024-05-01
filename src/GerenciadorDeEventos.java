import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEventos {
    public List <Evento> evento = new ArrayList<>();

    public void adicionarEvento (Evento evento) {
        this.evento.add(evento);
    }

    //método para listar os eventos salvos no arraylist
    public List<Evento> mostrarEvents(){
        return evento;
    }
    //construtor para mostrar todos os eventos salvos no arraylist
}
