package tugas1;

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
public class L1Nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Ini adalah program input output sederhana yang akan menghitung umur keluarga
         * n tahun kedepan
         */

        // Deklarasi dan Instantiasi
        Scanner IO = new Scanner(System.in);
        int ayah, x, ibu, adik, kakak;

        // Input
        System.out.print("Masukkan Umur Ayah\t\t\t:  ");
        ayah = IO.nextInt();
        System.out.print("Ingin Hitung Umur di Tahun Depan Keberapa? ");
        x = IO.nextInt();

        // Rumus Umur
        kakak = ayah / 3;
        adik = (kakak - 5) / 2;
        ibu = (2 * kakak) + adik;

        // Output
        System.out.println("\n====================================\n");
        System.out.println("Umur anggota keluarga sekarang adalah:");
        System.out.println("Ayah " + ayah + " tahun");
        System.out.println("Ibu " + ibu + " tahun");
        System.out.println("Kakak " + kakak + " tahun");
        System.out.println("Adik " + adik + " tahun");
        System.out.println("\n====================================\n");
        System.out.println("Umur anggota keluarga " + x + " tahun lagi:");
        System.out.println("Ayah " + (ayah + x) + " tahun");
        System.out.println("Ibu " + (ibu + x) + " tahun");
        System.out.println("Kakak " + (kakak + x) + " tahun");
        System.out.println("Adik " + (adik + x) + " tahun");

        IO.close();
    }
}
