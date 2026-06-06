package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import java.util.ArrayList;
import static Inicialise.Input.scanner;

public class Cadastra {

    public static void cadastra(ArrayList<Usuario> list){

        System.out.print("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        Usuario usuario = new Usuario(nome, idade, altura);

        list.add(usuario);

        System.out.println("Usuario cadastrado com sucesso!");
        System.out.println("");
    }
}