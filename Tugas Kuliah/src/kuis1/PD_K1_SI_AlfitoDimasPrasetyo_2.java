package kuis1;

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
 * Nama : Alfito Dimas Prasetyo NIM : 205150401111057 Soal Nomor : 2
 */

public class PD_K1_SI_AlfitoDimasPrasetyo_2 {

    public static void main(String[] args) {

        /* Program Menentukan Jumlah Persen Komisi yang Akan Diterima Karyawan */

        // Inisialisasi dan Instantiasi Variabel
        Scanner io = new Scanner(System.in);
        double komisi = 0;
        double komisiTambahan = 0;

        // Start
        System.out.print("Masukkan Jenis Pekerja (Kontrak/Tetap)\t: ");
        String jenisPekerja = io.next();
        System.out.print("Lama Bekerja (Tahun)\t\t\t: ");
        int lamaKerja = io.nextInt();
        System.out.print("Masukkan Penjualan\t\t\t: ");
        double jumPenjualan = io.nextDouble();

        // Seleksi Kondisi Jenis Pekerja
        if (jenisPekerja.equalsIgnoreCase("Kontrak")) {
            // Seleksi Kondisi Penentuan Jumlah Komisi
            if (jumPenjualan >= 1 && jumPenjualan <= 99.99) {
                komisi = 0.025 * jumPenjualan;
            } else if (jumPenjualan >= 100) {
                komisi = 0.05 * jumPenjualan;
            }
        } else {
            if (jumPenjualan >= 1 && jumPenjualan <= 99.99) {
                komisi = 0.05 * jumPenjualan;
            } else if (jumPenjualan >= 100 && jumPenjualan <= 199.99) {
                komisi = 0.1 * jumPenjualan;
            } else if (jumPenjualan >= 200) {
                komisi = 0.15 * jumPenjualan;
            }
        }

        // Seleksi Kondisi Penentuan Komisi Tambahan
        if (lamaKerja > 3) {
            komisiTambahan = 0.03 * komisi;
        }

        // Perhitungan Hasil Akhir Jumlah Komisi
        komisi = komisi + komisiTambahan;

        System.out.println("Besar komisi dari penjualan\t\t: " + komisi + "%");
        io.close();
        // End

    }

}
