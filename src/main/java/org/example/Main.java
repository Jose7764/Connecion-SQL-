package org.example;

import java.sql.Connection;
import java.util.Scanner;
import org.example.view.view;


public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        UsuarioDAO userDao = new UsuarioDAO();
        view view = new view();

        Boolean sair = true;

        while(sair){

            int opcao = view.menu();

            System.out.println("------------------------------------------- ");

            switch (opcao){
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = input.next();

                    System.out.println("Digite seu email: ");
                    String email = input.next();

                    userDao.inserir(nome , email);

                    break;

                case 2:

                    userDao.MostrarUsuarios();

                    break;

                case 3:
                    userDao.MostrarUsuarios();
                    System.out.println("Escolha um para deletar: ");
                    System.out.print(" - ");
                    int opcaoDeletar = input.nextInt();
                    userDao.deletarUsuarios(opcaoDeletar);

                    break;

                case 0:
                        sair = false;
                    break;
            }


        }










    }
}
