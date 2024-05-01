import java.time.LocalDateTime;

public class Evento {

    private String nome;
    private String endereco;
    private String categoria;
    private String hora;
    private String descricao;

    public Evento(String nome, String endereco, String categoria, String hora, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.hora = hora;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void status(){
        System.out.println(nome + endereco + categoria + hora + descricao);
    }

    //metodo marcar ou desmarcar
}
