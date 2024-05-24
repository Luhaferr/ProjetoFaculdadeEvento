package application;

import entities.Evento;
import entities.GerenciadorDeEventos;
import entities.Usuario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program{
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeEventos gerenciadorDeEventos = new GerenciadorDeEventos();
        List<Usuario> list = new ArrayList<>();

        System.out.println("CADASTRO DE USUÁRIO");
        System.out.println();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        Usuario user = new Usuario(nome, email, endereco, idade);
        list.add(user);

        String path = "E:\\IdeaProjects\\ProjetoFaculdade\\user\\user.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Usuario usuario : list) {
                bw.write(user.getNome() + ", " + usuario.getEmail() + ", " + usuario.getEndereco() + ", " + usuario.getIdade());
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println();
        System.out.println("CADASTRO DE EVENTO");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do evento: ");
        scanner.nextLine();
        String eventNome = scanner.nextLine();

        System.out.print("Digite o endereço do evento: ");
        String eventEndereco = scanner.nextLine();

        System.out.print("Digite a categoria do evento: ");
        String eventCategoria = scanner.nextLine();

        System.out.print("Digite a data do evento(DD/MM/YYYY): ");
        Date eventHora = sdf2.parse(scanner.next());

        System.out.print("Digite a descrição do evento: ");
        scanner.nextLine();
        String eventDescricao = scanner.nextLine();

        Evento event = new Evento(eventNome, eventEndereco, eventCategoria, eventHora, eventDescricao);
        gerenciadorDeEventos.adicionarEvento(event);

        System.out.println();
        for (Evento i: gerenciadorDeEventos.mostrarEvents()) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Endereço: " + i.getEndereco());
            System.out.println("Categoria: " + i.getCategoria());
            System.out.println("Horário: " + sdf2.format(i.getHora()));
            System.out.println("Descrição: " + i.getDescricao());
        }
        scanner.close();
    }
}