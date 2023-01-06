package lc3;

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
public class LC3Main1 {

    public static void main(String[] args) {

        /* Ini adalah program untuk menentukan investasi yang paling layak */

        // Deklarasi, Inisialisasi, dan Instantiasi
        Scanner io = new Scanner(System.in);
        int jum;
        int n = 0;
        double per, tmp, angka;
        double sum = 0;
        double tmp1 = 0;

        // Input
        System.out.print("Masukkan jumlah investasi yang akan dipertimbangkan: ");
        int tot = io.nextInt();
        System.out.println(
                "Silahkan input modal investasi <spasi> waktu pengembalian <spasi> persen kenaikan tiap tahun");
        for (int i = 0; i < tot; i++) {
            angka = io.nextDouble();
            jum = io.nextInt();
            per = io.nextDouble();
            tmp = angka;
            for (int j = 0; j < jum; j++) {
                angka += (angka * (per / 100));
                sum = angka - tmp;
                if (sum > tmp1) {
                    tmp1 = sum;
                } else {
                    tmp1 *= 1;
                }
            }
            if (sum == tmp1) {
                n = i + 1;
            }
        }

        // Output
        System.out.printf("Pilihan investasi terbaik yaitu pilihan %s dengan keuntungan sebesar Rp%.2f \n", n, tmp1);
        io.close();

    }

}
