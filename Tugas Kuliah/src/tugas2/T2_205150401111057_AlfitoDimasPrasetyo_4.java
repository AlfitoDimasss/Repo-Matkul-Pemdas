package tugas2;

//
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
 * Nama 1: Alfito Dimas Prasetyo (205150401111057) Nama 2: Ariyo Tejo Sumarto
 * (205150407111043)
 * 
 * Tanggung jawab 1: Mengerjakan soal nomor 2, nomor 4, dan nomor 5 Tanggung
 * jawab 2: Mengerjakan soal nomor 1 dan soal nomor 3, serta membuat flowchart
 * dan pseudocode untuk nomor 1
 */

public class T2_205150401111057_AlfitoDimasPrasetyo_4 {

    public static void main(String[] args) {

        /*
         * Saya lupa ini program apa, tapi sepertinya ini program untuk menghitung nilai
         * standar deviasi
         */

        // Input
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = io.nextInt();
        double total = 0;

        // Rumus
        for (double i = 0, j = 1; j <= n; i++, j++) {
            double nilai = 1 / ((Math.sqrt(i)) + (Math.sqrt(j)));
            total += nilai;
        }

        // Output
        System.out.printf("Hasil perhitungan dengan rumus adalah %.2f \n", total);
        io.close();

    }

}
