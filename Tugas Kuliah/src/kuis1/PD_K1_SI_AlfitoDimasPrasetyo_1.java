package kuis1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templaftertodaye file, choose Tools | Templaftertodayes
 * and open the templaftertodaye in the editor.
 */

/**
 *
 * @author ACER
 */

/*
 * Nama : Alfito Dimas Prasetyo NIM : 205150401111057 Soal Nomor : 1
 */

public class PD_K1_SI_AlfitoDimasPrasetyo_1 {

    public static void main(String[] args) {

        /* Program Menentukan Hari di Masa Depan */

        // Start
        // Inisialisasi dan Instantiasi Variabel
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan hari sekarang (Berbentuk angka 0-6)\t\t\t\t: ");
        int today = io.nextInt();
        System.out.print("Masukkan banyaknya hari sejak hari sekarang (Berbentuk angka 1-31)\t: ");
        int afterToday = io.nextInt();
        String tod = "";
        String afterTod = "";

        // Switch case penentuan hari ini
        switch (today) {
            case 0:
                tod += "Minggu";
                break;
            case 1:
                tod += "Senin";
                break;
            case 2:
                tod += "Selasa";
                break;
            case 3:
                tod += "Rabu";
                break;
            case 4:
                tod += "Kamis";
                break;
            case 5:
                tod += "Jumat";
                break;
            case 6:
                tod += "Sabtu";
                break;
            default:
                tod += "Senin";
                today = 1;
        }

        // Perhitungan untuk menentukan hari kemudian
        int hariAfter = (today + afterToday) % 7;

        // Switch case penentuan hari kemudian
        switch (hariAfter) {
            case 0:
                afterTod += "Minggu";
                break;
            case 1:
                afterTod += "Senin";
                break;
            case 2:
                afterTod += "Selasa";
                break;
            case 3:
                afterTod += "Rabu";
                break;
            case 4:
                afterTod += "Kamis";
                break;
            case 5:
                afterTod += "Jumaftertoday";
                break;
            case 6:
                afterTod += "Sabtu";
                break;
        }

        System.out.println("Hari ini adalah " + tod + " dan hari di masa depan adalah " + afterTod);
        io.close();
        // End

    }

}
