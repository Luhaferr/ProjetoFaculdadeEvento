
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeEventos gerenciadorDeEventos = new GerenciadorDeEventos();

        System.out.println("CADASTRO DE USUÁRIO");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        Usuario user = new Usuario(nome, email, endereco, idade);

        System.out.println("CADASTRO DE EVENTO");

        System.out.print("Digite o nome do evento: ");
        String eventNome = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite o endereço do evento: ");
        String eventEndereco = scanner.nextLine();

        System.out.print("Digite a categoria do evento: ");
        String eventCategoria = scanner.nextLine();

        System.out.print("Digite o horário do evento: ");
        String eventHora = scanner.nextLine();

        System.out.print("Digite a descrição do evento: ");
        String eventDescricao = scanner.nextLine();

        Evento event = new Evento(eventNome, eventEndereco, eventCategoria, eventHora, eventDescricao);
        gerenciadorDeEventos.adicionarEvento(event);

        for (Evento i: gerenciadorDeEventos.mostrarEvents()) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Endereço: " + i.getEndereco());
            System.out.println("Categoria: " + i.getCategoria());
            System.out.println("Horário: " + i.getHora());
            System.out.println("Descrição: " + i.getDescricao());
        }

        scanner.close();
    }

}