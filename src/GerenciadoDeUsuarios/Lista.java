package GerenciadoDeUsuarios;

import Inicialise.Usuario;
import static GerenciadoDeUsuarios.Cadastra.list;

public class Lista {
    public static void lista(){

        for (Usuario usuario : list) {
            System.out.println(usuario);
        }
    }

}
