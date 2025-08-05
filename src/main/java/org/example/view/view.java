package org.example.view;

import java.util.Scanner;

public class view {

    Scanner input = new Scanner(System.in);


    public int menu(){
        System.out.println(" --- --- ---  SQL System --- --- --- \n");
        System.out.println(" 1 - cadastrar ");
        System.out.println(" 2 - Listar    ");
        System.out.println(" 3 - Deletar    ");
        System.out.println(" 0 - Sair    ");
        System.out.print(" - ");
        int opcao = input.nextInt();

        return opcao;
    }
}
