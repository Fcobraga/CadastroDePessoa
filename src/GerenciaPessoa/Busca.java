package GerenciaPessoa;

import Inicialise.Pessoa;

import java.util.Scanner;

import static GerenciaPessoa.Cadastra.list;

public class Busca {
    static Scanner scanner = new Scanner(System.in);

    public static void busca(){
        System.out.println("Digite o nome de quem deseja busca: ");
        String nome = scanner.nextLine();
        Boolean pessoaEncontrada = true;

        for (Pessoa pessoa: list){
            if (pessoa.toString().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Esse usuario foi emcontrado.");
                System.out.println(list);
                pessoaEncontrada = true;
            }else {
                System.out.println("Nem uma pessoa com esse nome foi encontrado.");
            }
        }
    }
}
