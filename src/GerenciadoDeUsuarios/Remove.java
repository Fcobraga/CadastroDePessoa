package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import java.util.ArrayList;
import static Inicialise.Input.scanner;

public class Remove {
    public static void remove(ArrayList<Usuario> list){

        System.out.println("Digite o usuario que sera removido:");
        String nome = scanner.nextLine();

        boolean pessoaEncontrada = false;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getNome().trim().equalsIgnoreCase(nome.trim())){

                Usuario usuarioRemovido = list.get(i);
                list.remove(i);
                pessoaEncontrada = true;

                System.out.println("Usuario "
                        + usuarioRemovido.getNome()
                        + " foi removido.");
                break;
            }
        }
        if (!pessoaEncontrada){
            System.out.println("Usuario não encontrado!");
        }
    }
}