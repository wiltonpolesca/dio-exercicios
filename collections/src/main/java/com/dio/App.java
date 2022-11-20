package com.dio;

import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

        // TODO: Implemente uma condição onde possamos preencher o vetor de N.
        // Lembre-se a sequência de valores é de 0 até T-1:
        int[] values = new int[1000];

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < t; j++) {
                if (i < 1000) {
                    values[i] = j;
                    System.out.println("N[" + i + "] = " + values[i]);
                    if (j + 1 < t) {
                        i++;
                    }
                }
            }
        }

        // System.out.println("Java Collections");
        // int[] x;
        // int[] var = new int[10];

        // // ListExamples.listTest();
        // ListExamples.exercice1();
        // // ListExamples.exercice2();

        // // ListExamples.listSetTest();
        // // SetExamples.exercice3();
        // // ListExamples.exercice4();
    }
}