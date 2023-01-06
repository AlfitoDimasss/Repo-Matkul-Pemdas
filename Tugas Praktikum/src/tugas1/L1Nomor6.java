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
public class L1Nomor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Ini adalah program input output sederhana untuk menentukan kombinasi password
         * dari sebuah kalimat dengan memasukkan beberapa angka sebagai clue dan dengan
         * syarat angka pertama tidak lebih besar dari angka kedua dan seterusnya
         */
        Scanner IO = new Scanner(System.in);

        // Input
        System.out.print("Masukkan Kalimatnya\t\t: ");
        String kalimat = IO.nextLine();
        System.out.print("Masukkan clue angka pertama\t: ");
        int a = IO.nextInt();
        System.out.print("Masukkan clue angka kedua\t: ");
        int b = IO.nextInt();
        System.out.print("Masukkan clue angka ketiga\t: ");
        int c = IO.nextInt();

        // Rumus Password
        kalimat = kalimat.replaceAll("\\s", "");
        int sub = 2 * a * b;
        int sub1 = 2 * b * c;

        // Output
        System.out.println("Hasil Password\t\t\t: " + kalimat.substring(sub, sub1));
        IO.close();
    }
}
