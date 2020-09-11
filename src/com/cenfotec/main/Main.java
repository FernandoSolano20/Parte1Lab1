package com.cenfotec.main;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int lengthArray = 5;
        int[] list = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++){
            System.out.println("Digite el numero en la posicion " + ( i + 1 ));
            list[i] = readNumber();
        }
        list = sortOrderInsertion(list);

        System.out.println("El orden es: ");
        for (int i = 0; i < lengthArray; i++){
            System.out.println((i + 1) + "-> " + list[i]);
        }
    }

    public static int[] sortOrderInsertion (int[] vector) {
        for (int i=1; i < vector.length; i++) {
            int aux = vector[i];
            int j;
            for (j=i-1; j >= 0 && vector[j] > aux; j--){
                vector[j+1] = vector[j];
            }
            vector[j+1] = aux;
        }
        return vector;
    }

    private static int readNumber(){
        return read.nextInt();
    }
}
