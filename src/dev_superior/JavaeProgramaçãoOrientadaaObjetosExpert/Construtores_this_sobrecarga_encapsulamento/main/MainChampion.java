package dev_superior.JavaeProgramaçãoOrientadaaObjetosExpert.Construtores_this_sobrecarga_encapsulamento.main;

import dev_superior.JavaeProgramaçãoOrientadaaObjetosExpert.Construtores_this_sobrecarga_encapsulamento.base.Champion;

import java.util.Scanner;

public class MainChampion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        sc.nextLine();

        Champion champion1 = new Champion(name, life, attack, armor);

        System.out.println("\nDigite os dados do segundo campeão:");

        System.out.print("Nome: ");
        String name2 = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();

        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();

        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        Champion champion2 = new Champion(name2, life2, attack2, armor2);

        System.out.print("\nQuantos turnos você deseja executar? ");
        int turnos = sc.nextInt();
        System.out.println();

        for (int i = 0; i < turnos; i++) {

            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.printf("Resultado do turno %d: \n", i + 1);

            if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {

                System.out.println(champion1.status());

                System.out.println(champion2.status());

                System.out.println();

                break;
            }

            System.out.println(champion1.status());

            System.out.println(champion2.status());

            System.out.println();
        }

        System.out.println("FIM DO COMBATE");
    }
}
