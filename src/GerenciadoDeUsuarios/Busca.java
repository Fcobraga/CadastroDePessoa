package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import java.util.Scanner;
import static GerenciadoDeUsuarios.Cadastra.list;

public class Busca {
    static Scanner scanner = new Scanner(System.in);

    public static void busca(){
        System.out.println("Digite o nome do usuario: ");
        String nome = scanner.nextLine();
        boolean pessoaEncontrada = false;

        for (Usuario usuario : list){
            if (usuario.toString().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Esse usuario foi emcontrado.");
                System.out.println(usuario);
                pessoaEncontrada = true;
            }
        }
        if (!pessoaEncontrada){
            System.out.println("Esse usuario nao foi encontrado.");
        }
    }
}
