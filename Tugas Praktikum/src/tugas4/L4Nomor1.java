package tugas4;

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
public class L4Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Program mencari data mahasiswa berdasarkan fakultas, prodi, atau angkatannya
         */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa: ");
        int a = io.nextInt();
        String[] nama = new String[a];
        String[] fakultas = new String[a];
        String[] prodi = new String[a];
        String[] angkatan = new String[a];

        // Input data mahasiswa
        System.out.println("Masukkan nama mahasiswa <spasi> fakultas <spasi> prodi <spasi> angkatan: ");
        for (int i = 0; i < nama.length; i++) {
            nama[i] = io.next();
            fakultas[i] = io.next();
            prodi[i] = io.next();
            angkatan[i] = io.next();
        }

        System.out.println("==================================================");
        System.out.println("Silahkan input berdasarkan data apa yang ingin anda cari");
        System.out.println("Misal: Fakultas FILKOM atau Prodi SI dan sebagainya");
        System.out.println("Untuk Exit silahkan input SELESAI");
        System.out.println("==================================================");

        // Pencarian data mahasiswa
        while (true) {
            String q = io.next();
            if (q.equalsIgnoreCase("fakultas")) {
                String p = io.next();
                int poin = 0;
                for (int i = 0; i < fakultas.length; i++) {
                    if (fakultas[i].equalsIgnoreCase(p)) {
                        System.out.println("-" + nama[i]);
                        poin += 1;
                    }
                }
                if (poin == 0) {
                    System.out.println("Data tidak ditemukan");
                }
            } else if (q.equalsIgnoreCase("jurusan")) {
                String p = io.next();
                int poin = 0;
                for (int i = 0; i < prodi.length; i++) {
                    if (prodi[i].equalsIgnoreCase(p)) {
                        System.out.println("-" + nama[i]);
                        poin += 1;
                    }
                }
                if (poin == 0) {
                    System.out.println("Data tidak ditemukan");
                }
            } else if (q.equalsIgnoreCase("angkatan")) {
                String p = io.next();
                int poin = 0;
                for (int i = 0; i < angkatan.length; i++) {
                    if (angkatan[i].equalsIgnoreCase(p)) {
                        System.out.println("-" + nama[i]);
                        poin += 1;
                    }
                }
                if (poin == 0) {
                    System.out.println("Data tidak ditemukan");
                }
            } else if (q.equalsIgnoreCase("selesai")) {
                break;
            } else {
                io.nextLine();
                System.out.println("Pilihan salah");
            }
        }
        io.close();
    }
}
