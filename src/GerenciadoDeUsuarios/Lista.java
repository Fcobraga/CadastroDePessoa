package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import java.util.ArrayList;

public class Lista {

    public static void lista(ArrayList<Usuario> list){

        if (list.isEmpty()){
            System.out.println("Nenhum usuario cadastrado.");
            return;
        }

        for (Usuario usuario : list){
            System.out.println(usuario);
        }
        System.out.println("");
    }
}