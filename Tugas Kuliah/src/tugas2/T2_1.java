package tugas2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */

/*
 * Nama 1: Alfito Dimas Prasetyo (205150401111057) Nama 2: Ariyo Tejo Sumarto
 * (205150407111043)
 * 
 * Tanggung jawab 1: Mengerjakan soal nomor 2, nomor 4, dan nomor 5 Tanggung
 * jawab 2: Mengerjakan soal nomor 1 dan soal nomor 3, serta membuat flowchart
 * dan pseudocode untuk nomor 1
 */

public class T2_1 {

    public static void main(String[] args) {

        /*
         * Program menghitung jumlah bilangan positif dan negatif dari bilangan -
         * bilangan yang diinputkan
         */

        // Deklarasi, Inisialisasi, dan Instantiasi
        Scanner io = new Scanner(System.in);
        int jmlPositif = 0;
        int jmlNegatif = 0;
        double totAngka = 0;
        double mean;

        /*
         * Input diisi dengan angka - angka yang dipisahkan dengan spasi dan diakhiri
         * dengan 0. Contoh 1 3 6 2 9 0
         */
        System.out.print("Masukkan integer, input berakhir bila diisi 0: ");

        // Proses hitung jumlah bilangan positif dan negatif
        while (true) {
            int angka = io.nextInt();
            if (angka > 0) {
                jmlPositif++;
            } else if (angka < 0) {
                jmlNegatif++;
            } else {
                break;
            }
            totAngka += angka;
        }

        // Output
        if (totAngka != 0) {
            mean = totAngka / (jmlPositif + jmlNegatif);
            System.out.println("Banyak angka positif: " + jmlPositif);
            System.out.println("Banyak angka negatif: " + jmlNegatif);
            System.out.println("Total semuanya adalah: " + totAngka);
            System.out.println("Rata - ratanya adalah: " + mean);
        } else {
            System.out.println("Tidak ada angka yang dihasilkan kecuali 0");
        }
        io.close();
    }
}
