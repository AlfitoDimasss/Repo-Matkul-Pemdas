package lc2;

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
public class LC2Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program untuk menampilkan data mahasiswa berdasarkan NIM mahasiswa */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);
        String nim = io.nextLine();
        String tahun = "";
        String fakultas = "";
        String prodi = "";
        String jalur = "";
        String a = nim.substring(0, 2);
        String b = nim.substring(2, 5);
        String c = nim.substring(4, 8);
        String d = nim.substring(8, 12);
        String e = nim.substring(12, 15);

        // Switch case untuk menentukan angkatan
        switch (a) {
            case "15":
                tahun += "2015";
                break;
            case "16":
                tahun += "2016";
                break;
            case "17":
                tahun += "2017";
                break;
            case "18":
                tahun += "2018";
                break;
            case "19":
                tahun += "2019";
                break;
            case "20":
                tahun += "2020";
                break;
            default:
                tahun += "Unknown";
        }

        System.out.println("Angkatan\t: " + tahun);

        // Switch case untuk menentukan fakultas
        switch (b) {
            case "515":
                fakultas += "FILKOM";
                break;
            case "514":
                fakultas += "MIPA";
                break;
            default:
                tahun += "Unknown";
        }

        System.out.println("Fakultas\t: " + fakultas);

        // Switch case untuk menentukan prodi
        switch (c) {
            case "5020":
                prodi += "TIF";
                break;
            case "5030":
                prodi += "TEKKOM";
                break;
            case "5040":
                prodi += "SI";
                break;
            case "5050":
                prodi += "TI";
                break;
            case "5060":
                prodi += "PTI";
                break;
            case "4050":
                prodi += "Biologi";
                break;
            case "4051":
                prodi += "Kimia";
                break;
            case "4060":
                prodi += "Fisika";
                break;
            case "4061":
                prodi += "Matematika";
                break;
            default:
                tahun += "Unknown";
        }

        System.out.println("Prodi\t\t: " + prodi);

        // Switch case untuk menentukan jalur masuk
        switch (d) {
            case "0111":
                jalur += "SBMPTN";
                break;
            case "1111":
                jalur += "SNMPTN";
                break;
            case "7111":
                jalur += "Mandiri";
                break;
            default:
                tahun += "Unknown";
        }

        System.out.println("Jalur Masuk\t: " + jalur);

        System.out.println("Nomor Mahasiswa\t: " + e);
        io.close();
    }
}
