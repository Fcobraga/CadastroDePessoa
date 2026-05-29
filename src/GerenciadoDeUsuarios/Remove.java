package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    static Scanner scanner = new Scanner(System.in);

    public static void remove(ArrayList<Usuario> usuario){
        System.out.println("Digite o usuario que sera removido:");
        String nome = scanner.nextLine();
        boolean pessoaEncontrada = false;

        for (int i = 0; i < usuario.size(); i++){
            if (usuario.get(i).getNome().trim().equalsIgnoreCase(nome)){
                Usuario removido = usuario.get(i);
                usuario.remove(i);
                pessoaEncontrada = true;
                System.out.println("Usuario "+usuario.get(i)+" foi removido.");
                break;
            }
        }
        if (!pessoaEncontrada){
            System.out.println("Usuario não encontrado!");
        }

    }
}