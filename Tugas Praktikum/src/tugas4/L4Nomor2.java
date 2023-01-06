package tugas4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Illuminare
 */
public class L4Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Program menentukan nilai vertikal, horizontal, dan diagonal terbesar dari
         * sebuah matriks 3x3
         */

        // Deklarasi, Inisialisasi, dan Instantiasi
        Scanner io = new Scanner(System.in);
        int[][] arrayAngka = new int[3][3];
        int total = 0;
        int sum = 0;
        int total2 = 0;
        int sum2 = 0;

        // Input matriks dan hitung nilai horizontal
        System.out.println("Masukkan Matriks 3x3");
        for (int i = 0; i < arrayAngka.length; i++) {
            total = 0;
            for (int j = 0; j < arrayAngka[0].length; j++) {
                int a = io.nextInt();
                arrayAngka[i][j] = a;
                total += arrayAngka[i][j];
                if (total > sum) {
                    sum = total;
                }
            }
        }

        System.out.println("Nilai Horizontal Terbesar\t: " + sum);

        // Menetukan nilai vertikal
        for (int k = 0; k < arrayAngka[0].length; k++) {
            total2 = 0;
            for (int l = 0; l < arrayAngka.length; l++) {
                total2 += arrayAngka[l][k];
                if (total2 > sum2) {
                    sum2 = total2;
                }
            }
        }
        System.out.println("Nilai Vertical Terbesar\t\t: " + sum2);

        // Menentukan nilai diagonal
        int angka = arrayAngka[0][0] + arrayAngka[1][1] + arrayAngka[2][2];
        int angka1 = arrayAngka[0][2] + arrayAngka[1][1] + arrayAngka[2][0];

        if (angka >= angka1) {
            System.out.println("Nilai Diagonal Terbesar\t\t: " + angka);
        } else if (angka1 >= angka) {
            System.out.println("Nilai Diagonal Terbesar\t\t: " + angka1);
        }
        io.close();
    }
}
