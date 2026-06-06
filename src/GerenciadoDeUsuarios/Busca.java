package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import java.util.ArrayList;
import static Inicialise.Input.scanner;

public class Busca {
    public static void busca(ArrayList<Usuario> list){

        System.out.println("Digite o nome do usuario:");
        String nome = scanner.nextLine();

        boolean pessoaEncontrada = false;

        for (Usuario usuario : list){
            if (usuario.getNome().trim().equalsIgnoreCase(nome.trim())){

                System.out.println("Usuario encontrado:");
                System.out.println(usuario);

                pessoaEncontrada = true;
            }
        }
        if (!pessoaEncontrada){
            System.out.println("Usuario não encontrado.");
        }
    }
}