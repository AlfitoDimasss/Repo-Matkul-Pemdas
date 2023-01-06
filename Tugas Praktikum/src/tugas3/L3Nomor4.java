package tugas3;

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
public class L3Nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program Kasir Sederhana */

        // Deklarasi, Inisialisasi, dan Instantiasi
        Scanner io = new Scanner(System.in);
        int harga = 0;
        int num, jum, bayar;

        // Input
        System.out.println("SELAMAT DATANG DI KRUSTY KRAB");
        System.out.println("LIST MAKANAN:");
        System.out.println("1. Buger 10.000");
        System.out.println("2. Cheese Burger 13.000");
        System.out.println("3. Burger Jumbo 20.000");
        System.out.println("4. Kentang Goreng 7.000");
        System.out.println("0. Keluar");
        System.out.println("\n==============================\n");

        do {
            System.out.print("Pilih nomor menu <spasi> jumlahnya\t\t: ");
            num = io.nextInt();
            if (num == 1) {
                jum = io.nextInt();
                harga += 10000 * jum;
            } else if (num == 2) {
                jum = io.nextInt();
                harga += 13000 * jum;
            } else if (num == 3) {
                jum = io.nextInt();
                harga += 20000 * jum;
            } else if (num == 4) {
                jum = io.nextInt();
                harga += 7000 * jum;
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Pilihan tidak ada");
            }
        } while (!(num == 0));

        System.out.println("\n==============================\n");

        System.out.println("LIST MINUMAN:");
        System.out.println("1. Teh 5.000");
        System.out.println("2. Teh Lemon 7.000");
        System.out.println("3. Soda 7.500");
        System.out.println("0. Keluar");

        System.out.println("\n==============================\n");

        do {
            System.out.print("Pilih nomor menu <spasi> jumlahnya\t\t: ");
            num = io.nextInt();
            if (num == 1) {
                jum = io.nextInt();
                harga += 5000 * jum;
            } else if (num == 2) {
                jum = io.nextInt();
                harga += 7000 * jum;
            } else if (num == 3) {
                jum = io.nextInt();
                harga += 7500 * jum;
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Pilihan tidak ada");
            }
        } while (!(num == 0));

        System.out.println("\n==============================\n");

        // Output
        System.out.println("Total belanja\t\t\t\t\t: Rp" + harga);
        System.out.print("Masukkan uang untuk membayar\t\t\t: ");
        bayar = io.nextInt();

        // Seleksi kondisi jika uang yang dibayarkan kurang
        if (bayar < harga) {

            // Akan terus meminta uang apabila uang yang dibayarkan masih kurang
            do {
                System.out.print("Uang yang dimasukkan kurang Rp" + (harga - bayar) + ". Masukkan uang lagi\t: ");
                bayar += io.nextInt();
            } while (bayar < harga);
        }
        int kembali = bayar - harga;
        if (kembali > 0) {
            System.out.println("Kembalian\t\t\t\t\t: Rp" + kembali);
        }
        System.out.println("Terima kasih sudah belanja di Krusty Krab!");
        io.close();
    }
}
