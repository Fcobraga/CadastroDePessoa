package Inicialise;

import GerenciadoDeUsuarios.Busca;
import GerenciadoDeUsuarios.Cadastra;
import GerenciadoDeUsuarios.Lista;
import GerenciadoDeUsuarios.Remove;

import java.util.ArrayList;

import static Inicialise.Input.scanner;

public class Inicia {

    static ArrayList<Usuario> list = new ArrayList<>();

    public static void main(String[] args){

        int opcao;
        do {

            System.out.println("======MENU======");
            System.out.println("1 -> Cadastra usuario");
            System.out.println("2 -> Lista usuario");
            System.out.println("3 -> Busca usuario");
            System.out.println("4 -> Remover usuario");
            System.out.println("0 -> Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){

                case 1:
                    Cadastra.cadastra(list);
                    break;
                case 2:
                    Lista.lista(list);
                    break;
                case 3:
                    Busca.busca(list);
                    break;
                case 4:
                    Remove.remove(list);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (opcao != 0);
    }
}