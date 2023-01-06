package kuis2.asinkron;

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

/*
 * Nama : Alfito Dimas Prasetyo NIM : 205150401111057 Soal Nomor : 1
 */

public class K2_PD_AlfitoDimasPrasetyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Ini adalah program untuk menghitung banyaknya nilai ganjil dan genap beserta
         * nilai rata-rata, nilai terendah, dan nilai tertingginya
         */

        // Start
        // Input angka
        int[] arrayB = input();

        // Hitung jumlah angka ganjil
        int jmlGanjil = countOdd(arrayB);

        // Hitung jumlah angka genap
        int jmlGenap = countEven(arrayB);

        // Hitung nilai rata - rata, terendah, dan tertinggi angka ganjil
        int[] arrayC = floorMeanMinMax(arrayB, true);

        // Hitung nilai rata - rata, terendah, dan tertinggi angka genap
        int[] arrayD = floorMeanMinMax(arrayB, false);

        // Output
        System.out.printf("Banyak angka ganjil %6c %s\n", '=', jmlGanjil);
        System.out.printf("Rata - rata ganjil %7c %s\n", '=', arrayC[0]);
        System.out.printf("Minimum ganjil %11c %s\n", '=', arrayC[1]);
        System.out.printf("Maksimum ganjil %10c %s\n", '=', arrayC[2]);
        System.out.println("");
        System.out.printf("Banyak angka genap %7c %s\n", '=', jmlGenap);
        System.out.printf("Rata - rata genap %8c %s\n", '=', arrayD[0]);
        System.out.printf("Minimum genap %12c %s\n", '=', arrayD[1]);
        System.out.printf("Maksimum genap %11c %s\n", '=', arrayD[2]);

    }

    // Method untuk melakukan input dengan return array
    public static int[] input() {
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan sederetan angka (Akhiri dengan angka negatif) = ");
        int totAng = 0;
        String tmp = "";

        // Input akan terus diulang hingga user memasukan angka negatif
        while (true) {
            int c = io.nextInt();
            if (c < 0) {
                break;
            } else {
                totAng += 1;
                tmp = tmp + c + " ";
            }
        }

        // Instantiasi array untuk retun
        int[] arrayA = new int[totAng];

        // Method untuk split string menjadi array
        String[] pisah = tmp.split(" ");

        // Input array hasil split dari string ke arrayA
        for (int j = 0; j < pisah.length; j++) {
            arrayA[j] = Integer.parseInt(pisah[j]);
        }

        io.close();
        return arrayA;
    }

    // Method untuk hitung angka ganjil dengan parameter sebuah array
    public static int countOdd(int[] array) {
        int ganjil = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                ganjil += 1;
            }
        }
        return ganjil;
    }

    // Method untuk hitung angka genap dengan parameter sebuah array
    public static int countEven(int[] array) {
        int genap = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                genap += 1;
            }
        }
        return genap;
    }

    /*
     * Method untuk hitung nilai mean, min, dan max dengan parameter sebuah array
     * dan boolean
     */
    public static int[] floorMeanMinMax(int[] array, boolean isOdd) {
        int odd;
        int even;
        double mean = 0;
        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Seleksi kondisi untuk hitung angka ganjil
        if (isOdd == true) {
            odd = countOdd(array);
            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 2) != 0) {
                    sum += array[i];
                    if (array[i] > max) {
                        max = array[i];
                    }
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
            }

            mean = sum / odd;
            mean = Math.floor(mean);

            // Seleksi kondisi untuk hitung angka genap
        } else if (isOdd == false) {
            even = countEven(array);
            for (int j = 0; j < array.length; j++) {
                if ((array[j] % 2) == 0) {
                    sum += array[j];
                    if (array[j] > max) {
                        max = array[j];
                    }
                    if (array[j] < min) {
                        min = array[j];
                    }
                }
            }

            mean = sum / even;
            mean = Math.floor(mean);

        }

        // Hasil perhitungan akan masuk ke array dan direturnkan
        int[] arrayA = { (int) mean, min, max };
        return arrayA;
    }
    // End

}
