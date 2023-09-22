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
    }
}