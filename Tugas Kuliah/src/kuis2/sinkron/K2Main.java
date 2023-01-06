package kuis2.sinkron;

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
public class K2Main {

    public static void main(String[] args) {

        /*
         * Ini merupakan program untuk menentukan ojek mana yang terdekat dengan
         * penumpang
         */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);
        String namaPenumpang;
        double xPenumpang, yPenumpang;
        String[] pengemudi = new String[10];
        double[] xPengemudi = new double[10];
        double[] yPengemudi = new double[10];
        double[] jarakPengemudi = new double[10];
        int nPengemudi;

        // Input data penumpang
        System.out.print("Masukkan Nama Penumpang dan Koordinat x <spasi> y Penumpang\t\t: ");
        namaPenumpang = io.next();
        xPenumpang = io.nextDouble();
        yPenumpang = io.nextDouble();

        // Input data pengemudi
        System.out.print("Masukkan Banyak Pengemudi yang Tersedia\t\t\t\t\t: ");
        nPengemudi = io.nextInt();

        for (int i = 0; i < nPengemudi; i++) {
            System.out.print("Masukkan Nama Pengemudi Ke-" + (i + 1) + " dan Koordinat x <spasi> y Pengemudi\t: ");
            pengemudi[i] = io.next();
            xPengemudi[i] = io.nextDouble();
            yPengemudi[i] = io.nextDouble();
        }

        // Mendapatkan index data pengemudi dengan perhitungan method
        // hitungJarakPengemudi
        int index = hitungJarakPengemudi(xPenumpang, yPenumpang, xPengemudi, yPengemudi, nPengemudi, jarakPengemudi);

        // Mendapatkan nilai jarak antara penumpang dan pengemudi dengan perhitungan
        // method getJarakPengemudiTerdeka
        double jarakTerdekat = getJarakPengemudiTerdekat(jarakPengemudi, index);

        // Output
        System.out.printf("Pengemudi %s adalah yang terdekat dengan %s dengan jarak %.2f \n", pengemudi[index],
                namaPenumpang, jarakTerdekat);

        io.close();

    }

    // Method yang berisi rumus menghitung jarak
    public static double jarak(double x1, double y1, double x2, double y2) {

        return (Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));

    }

    // Method hitung jarak setiap pengemudi dengan penumpang
    public static int hitungJarakPengemudi(double xPenumpang, double yPenumpang, double[] xPengemudi,
            double[] yPengemudi, int nPengemudi, double[] jarakPengemudi) {

        double min = Double.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < nPengemudi; i++) {
            jarakPengemudi[i] = jarak(xPenumpang, yPenumpang, xPengemudi[i], yPengemudi[i]);
            if (jarakPengemudi[i] < min) {
                index = i;
                min = jarakPengemudi[i];
            }
        }

        return index;

    }

    // Method untuk mendapatkan nilai jarak pengemudi yang terdekat
    public static double getJarakPengemudiTerdekat(double[] jarakPengemudi, int index) {

        return jarakPengemudi[index];

    }

}
