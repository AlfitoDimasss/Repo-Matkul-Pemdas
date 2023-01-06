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
public class LC2Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Ini adalah program untuk mengubah angka mmenjadi huruf. Contoh 1999 akan
         * diubah menjadi seribu sembilan ratus sembilan puluh sembilan
         */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan angka maksimal 4 digit\t: ");
        int angka = io.nextInt();
        int ribuan = angka / 1000;
        int ratusan = (angka / 100) % 10;
        int puluhan = (angka % 100) / 10;
        int satuan = angka % 10;
        String akhir = "";

        // Switch case menentukan ribuan
        switch (ribuan) {
            case 1:
                akhir += "seribu";
                break;
            case 2:
                akhir += "dua ribu";
                break;
            case 3:
                akhir += "tiga ribu";
                break;
            case 4:
                akhir += "empat ribu";
                break;
            case 5:
                akhir += "lima ribu";
                break;
            case 6:
                akhir += "enam ribu";
                break;
            case 7:
                akhir += "tujuh ribu";
                break;
            case 8:
                akhir += "delapan ribu";
                break;
            case 9:
                akhir += "sembilan ribu";
                break;
        }

        if (ribuan != 0) {
            akhir += " ";
        }

        // Switch case menentukan ratusan
        switch (ratusan) {
            case 1:
                akhir += "seratus";
                break;
            case 2:
                akhir += "dua ratus";
                break;
            case 3:
                akhir += "tiga ratus";
                break;
            case 4:
                akhir += "empat ratus";
                break;
            case 5:
                akhir += "lima ratus";
                break;
            case 6:
                akhir += "enam ratus";
                break;
            case 7:
                akhir += "tujuh ratus";
                break;
            case 8:
                akhir += "delapan ratus";
                break;
            case 9:
                akhir += "sembilan ratus";
                break;
        }

        if (ratusan != 0) {
            akhir += " ";
        }

        // Switch case menentukan puluhan
        switch (puluhan) {
            case 1:
                switch (satuan) {
                    case 0:
                        akhir += "sepuluh";
                        break;
                    case 1:
                        akhir += "sebelas";
                        break;
                    case 2:
                        akhir += "dua belas";
                        break;
                    case 3:
                        akhir += "tiga belas";
                        break;
                    case 4:
                        akhir += "empat belas";
                        break;
                    case 5:
                        akhir += "lima belas";
                        break;
                    case 6:
                        akhir += "enam belas";
                        break;
                    case 7:
                        akhir += "tujuh belas";
                        break;
                    case 8:
                        akhir += "delapan belas";
                        break;
                    case 9:
                        akhir += "sembilan belas";
                        break;
                }
                break;
            case 2:
                akhir += "dua puluh";
                break;
            case 3:
                akhir += "tiga puluh";
                break;
            case 4:
                akhir += "empat puluh";
                break;
            case 5:
                akhir += "lima puluh";
                break;
            case 6:
                akhir += "enam puluh";
                break;
            case 7:
                akhir += "tujuh puluh";
                break;
            case 8:
                akhir += "delapan puluh";
                break;
            case 9:
                akhir += "sembilan puluh";
                break;
        }

        if (puluhan != 1) {
            if (puluhan != 0) {
                akhir += " ";
            }

            // Switch case menentukan satuan
            switch (satuan) {
                case 1:
                    akhir += "satu";
                    break;
                case 2:
                    akhir += "dua";
                    break;
                case 3:
                    akhir += "tiga";
                    break;
                case 4:
                    akhir += "empat";
                    break;
                case 5:
                    akhir += "lima";
                    break;
                case 6:
                    akhir += "enam";
                    break;
                case 7:
                    akhir += "tujuh";
                    break;
                case 8:
                    akhir += "delapan";
                    break;
                case 9:
                    akhir += "sembilan";
                    break;
            }
        }

        System.out.println("Hasil\t\t\t\t:" + akhir);
        io.close();
    }
}
