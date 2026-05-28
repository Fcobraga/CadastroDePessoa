package Inicialise;

import GerenciaPessoa.Busca;
import GerenciaPessoa.Cadastra;
import GerenciaPessoa.Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicia {

    static ArrayList<Pessoa> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int opcao;

        do {
            System.out.println("======MENUR======");
            System.out.println("1 -> Cadastra pessoa");
            System.out.println("2 -> Lista pessoas");
            System.out.println("3 -> Busca pessoa");
            System.out.println("4 -> Remover");
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
                    Cadastra.cadastra();
                break;
                case 0:
                    Cadastra.cadastra();
                break;
                default:
                    System.out.printf("Opção invalida");
            }

        }while (opcao != 0);

    }
}
