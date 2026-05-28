package GerenciaPessoa;

import Inicialise.Pessoa;
import static GerenciaPessoa.Cadastra.list;

public class Lista {
    public static void lista(){

        for (Pessoa pessoa: list) {
            System.out.println(pessoa);
        }
    }

}
