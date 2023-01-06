package UAP;

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
public class UAPNomor1 {

    public static void main(String[] args) {

        /* Program untuk menghitung jumah primorial dari sekumpulan bilangan prima */
        Scanner io = new Scanner(System.in);

        // Input
        System.out.print("Masukkan banyak bilangan prima: ");
        int tot = io.nextInt();

        // Proses mendapatkan bilangan - bilangan prima
        String angkaPrima = getAngkaPrima(tot);

        // Hasil string bilangan prima akan di split menjadi sebuah array
        String[] pisah = angkaPrima.split(" ");

        // Instantiasi array baru
        double[] arrayA = new double[pisah.length];

        // Input array hasil split ke arrayA
        for (int x = 0; x < arrayA.length; x++) {
            arrayA[x] = Double.parseDouble(pisah[x]);
        }

        // Proses hitung dan cetak jumlah primorial
        cetakJumlahPrimorial(arrayA);
        io.close();
    }

    // Method untuk mendapatkan bilangan - bilangan prima
    public static String getAngkaPrima(int angka) {
        String angkaPrima = "";
        boolean cek;
        int jumlah = 0;
        for (int i = 2;; i++) {
            cek = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cek = false;
                    break;
                }
            }
            if (cek == true) {
                angkaPrima += i + " ";
                jumlah++;
            }
            if (jumlah == angka) {
                break;
            }
        }
        return angkaPrima;
    }

    // Mthod untuk menghitung jumlah primorial dan mencetaknya
    public static void cetakJumlahPrimorial(double[] array) {
        double jumlahPrimorial = 1;
        for (int i = 0; i < array.length; i++) {
            jumlahPrimorial *= array[i];
        }
        System.out.printf("Jumlah bilangan primorial adalah: %.0f\n", jumlahPrimorial);
    }

}
