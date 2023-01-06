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
public class L3Nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program kalkulator sederhana */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);
        boolean lanjut = true;
        double total = 0;

        // Input
        System.out.println("Kalkulator Sederhana Tambah Kurang Kali Bagi");
        System.out.println("Silahkan input command <spasi> angka");
        System.out.println("Contoh: TAMBAH 5");
        System.out.println("Input SELESAI jika ingin mengakhiri");
        System.out.println("\n==============================\n");

        // Perulangan dan Seleksi Kondisi command
        while (lanjut) {
            String command = io.next();
            if (command.equalsIgnoreCase("TAMBAH")) {
                double angka = io.nextDouble();
                total += angka;
                System.out.println("Hasil: " + total);
            } else if (command.equalsIgnoreCase("KURANG")) {
                double angka = io.nextDouble();
                total -= angka;
                System.out.println("Hasil: " + total);
            } else if (command.equalsIgnoreCase("KALI")) {
                double angka = io.nextDouble();
                total *= angka;
                System.out.println("Hasil: " + total);
            } else if (command.equalsIgnoreCase("BAGI")) {
                double angka = io.nextDouble();
                total /= angka;
                if (angka == 0) {
                    total = 0;
                }
                System.out.println("Hasil: " + total);
            } else if (command.equalsIgnoreCase("SELESAI")) {
                lanjut = false;
                System.out.println("Hasil: " + total);
            } else {
                io.nextLine();
                System.out.println("Error Command");
                System.out.println("Hasil: " + total);
            }
        }
        io.close();
    }
}
