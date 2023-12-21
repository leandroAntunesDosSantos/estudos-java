package com.leandro.curdojava.aula17;

public class CrescimentoPopulacao {

    public static void main(String[] args) {

        boolean validate = false;

        double popA = 80_000;
        double popB = 200_000;
        int contador = 0;

        do {
            contador++;

            popA = popA + (popA * 3)/100;
            System.out.println(popA);
            popB = popB + (popB * 1.5)/100;
            System.out.println(popB);


            if (popA>=popB){
                validate = true;
                System.out.println(popA);
            }
        }while (validate == false);

        System.out.println(contador + " anos");

    }

}
