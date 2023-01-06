/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author Aryo Tejo
 */

/*
 * Nama 1: Alfito Dimas Prasetyo (205150401111057) Nama 2: Ariyo Tejo Sumarto
 * (205150407111043)
 * 
 * Tanggung jawab 1: Mengerjakan soal nomor 2, nomor 4, dan nomor 5 Tanggung
 * jawab 2: Mengerjakan soal nomor 1 dan soal nomor 3, serta membuat flowchart
 * dan pseudocode untuk nomor 1
 */

public class T2_205150401111057_AlfitoDimasPrasetyo_3 {
    public static void main(String[] args) {

        /*
         * Program yang akan menentukan jumlah angsuran bulanan dari sebuah pinjaman
         * dengan bunga-bunga tertentu
         */
        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("Jumlah pinjaman: ");
        double pin = in.nextDouble();
        System.out.printf("%s", "Tahun pinjaman: ", "\n");
        int tahun = in.nextInt();

        System.out.println("");

        // Deklarasi dan Inisialisasi
        double bunga = 4.875;
        double total = pin;
        double totalBulanan = 0;
        int i;

        // Output
        System.out.println("Bunga pinjaman\t\tPembayaran bulanan\tTotal Pembayaran");

        for (int penambahan = 1; penambahan <= 25; penambahan++) {
            bunga += 0.125;

            // Rumus angsurannya
            for (i = 1; i <= tahun; i++) {
                totalBulanan = pin * (bunga / 1200) / (1 - 1 / Math.pow(1 + bunga / 1200, tahun * 12));
                total = totalBulanan * tahun * 12;
            }

            System.out.printf("%.3f%c", bunga, '%');
            System.out.printf("\t\t\t%.2f", totalBulanan);
            System.out.printf("\t\t\t%.2f", total);
            System.out.println("");
            total = pin;
        }
        in.close();
    }
}
