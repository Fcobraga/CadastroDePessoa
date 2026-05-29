package Inicialise;

import GerenciadoDeUsuarios.Busca;
import GerenciadoDeUsuarios.Cadastra;
import GerenciadoDeUsuarios.Lista;
import GerenciadoDeUsuarios.Remove;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicia {

    static ArrayList<Usuario> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

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

            switch(opcao){
                case 1:
                    Cadastra.cadastra();
                break;
                case 2:
                    Lista.lista();
                break;
                case 3:
                    Busca.busca();
                break;
                case 4:
                    Remove.remove(list);
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
                default:
                    System.out.printf("Opção invalida");
            }

        }while (opcao != 0);

    }

}