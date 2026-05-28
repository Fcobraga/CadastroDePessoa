package GerenciaPessoa;

import Inicialise.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastra {
    static ArrayList<Pessoa> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void cadastra(){
        System.out.printf("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        list.add(new Pessoa( nome, idade, altura));
        System.out.println("Pessoa cadastrada!");

    }

}
