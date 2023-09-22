package com.java.LeituraDeDados;

import java.util.Scanner;
public class LeituraDeDados {
    public static void main(String[] args) {
        int age = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String name = sc.nextLine();

        System.out.println("Digite a idade:");
        age = sc.nextInt();

        if (age < 0) System.out.println("Idade inválida!");

        if (age >= 18 && age < 70) {
            System.out.println("Maior de Idade!");

        } else if (age >= 70 && age <= 99) {
            System.out.println("Terceira Idade!");
        } else if (age >= 100) {
            System.out.println("Centenária!");
        } else {
            System.out.println("Menor de Idade!");
        }
    }
}
