package tugas2;

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
public class L2Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Program input output sederhana untuk menampilkan nilai huruf berdasarkan
         * nilai angka yang diinputkan
         */

        Scanner io = new Scanner(System.in);
        String huruf = "";

        // Input
        System.out.print("Masukkan nilai anda\t\t: ");
        double angka = io.nextDouble();

        // Seleksi Kondisi menentukna nilai huruf
        if (angka > 80 && angka <= 100) {
            huruf += "A";
        } else if (angka > 75) {
            huruf += "B+";
        } else if (angka > 70) {
            huruf += "B";
        } else if (angka > 60) {
            huruf += "C+";
        } else if (angka > 55) {
            huruf += "C";
        } else if (angka > 50) {
            huruf += "D+";
        } else if (angka > 45) {
            huruf += "D";
        } else if (angka > 0) {
            huruf += "E";
        } else {
            huruf += "null";
        }

        // Output
        System.out.println("Nilai huruf hasil konversi\t: " + huruf);

        io.close();
    }
}
