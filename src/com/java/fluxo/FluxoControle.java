package com.java.fluxo;

public class FluxoControle {
    public static void main(String[] args) {
        int age = 17;

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