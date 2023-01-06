package tugas2;

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
public class L2Nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program input output konversi mata uang asing ke rupiah */

        Scanner io = new Scanner(System.in);

        // Input
        System.out.println("Program input output konversi mata uang asing ke rupiah.");
        System.out.println("Terdapat beberapa mata uang yang sudah dikenali, diantaranya: ");
        System.out.print("-USD\n-EURO\n-YEN\n-POUND\n-Riyal\n");
        System.out.print("Input mata uang\t\t: ");
        String jenis = io.next();
        System.out.print("Input jumlah uang\t: ");
        double uang = io.nextDouble();
        boolean isTrue = false;

        jenis = jenis.toLowerCase();

        // Seleksi kondisi menentukan jumlah konversi
        switch (jenis) {
            case "usd":
                uang *= 14000;
                isTrue = true;
                break;
            case "euro":
                uang *= 17000;
                isTrue = true;
                break;
            case "yen":
                uang *= 140;
                isTrue = true;
                break;
            case "pound":
                uang *= 19000;
                isTrue = true;
                break;
            case "riyal":
                uang *= 4000;
                isTrue = true;
                break;
            default:
                System.out.println("Mata uang tidak dikenali.");
        }

        // Output
        if (isTrue) {
            System.out.println("Hasil konversi\t\t: Rp" + uang);
        }

        io.close();
    }
}
