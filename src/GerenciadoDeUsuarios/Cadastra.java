package GerenciadoDeUsuarios;

import Inicialise.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastra {
    static ArrayList<Usuario> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void cadastra(){
        System.out.printf("Digite o nome: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        list.add(new Usuario( nome, idade, altura));
        System.out.println("Usuario cadastrado!");

    }

}
