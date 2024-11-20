/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import entidades.Animais;
import java.util.Scanner;

/**
 *
 * @author caioe
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        try {
            System.out.print("Insira o nome do seu animal: ");
            String nome = sc.nextLine();
            System.out.print("Insira a classe do seu animal: ");
            String classe = sc.nextLine();
            System.out.print("Insira a família do seu animal: ");
            String familia = sc.nextLine();

            Animais a1 = new Animais(nome, classe, familia);
            System.out.println(a1.nascer());

            while (op != 4) {
                System.out.println("O que o " + a1.getNome() + " vai fazer agora? ");
                System.out.println("1 - Comer");
                System.out.println("2 - Correr");
                System.out.println("3 - Dormir");
                System.out.println("4 - Morrer");
                op = sc.nextInt();

                if (op > 0 && op < 5) {
                    switch (op) {
                        case 1:
                            System.out.println(a1.comer());
                            break;
                        case 2:
                            System.out.println(a1.correr());
                            break;
                        case 3:
                            System.out.println(a1.dormir());
                            break;
                        case 4:
                            System.out.println(a1.morrer());
                            break;
                    }
                } else {
                    System.out.println("Opção inválida, tente novamente!");
                }

            }

            System.out.println("GAME OVER!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}
