package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class MaiorValorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Maior numero é " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("Maior numero é " + num2);
        }else if (num3>num1 && num3 > num2){
            System.out.println("Maior numero é " + num3);
        }else {
            System.out.println("Maior numero é " + num1);
        }
    }
}
