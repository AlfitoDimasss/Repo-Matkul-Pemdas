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
public class L1Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program sederhana input output */
        Scanner IO = new Scanner(System.in);
        System.out.print("Masukkan Nama\t\t: ");
        String nama = IO.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        String NIM = IO.nextLine();
        System.out.print("Masukkan Jurusan\t: ");
        String jurusan = IO.nextLine();
        System.out.print("Masukkan Angkatan\t: ");
        int angkatan = IO.nextInt();
        IO.nextLine();
        System.out.print("Masukkan Fakultas\t: ");
        String fakultas = IO.nextLine();

        System.out.println("Halo! Nama saya " + nama + " dengan NIM " + NIM + " dari jurusan " + jurusan + " angkatan "
                + angkatan + " fakultas " + fakultas + ".");
        IO.close();
    }
}
