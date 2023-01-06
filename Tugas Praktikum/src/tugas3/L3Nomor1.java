package tugas3;

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
public class L3Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Program sederhana dimana user menginputkan sederet angka dan nantinya setiap
         * digit angka tersebut akan dikuadratkan
         */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);
        String q = "";

        // Input
        System.out.print("Silahkan input beberapa angka tanpa spasi\t\t: ");
        String s = io.next();
        int len = s.length();

        // Proses pengkuadratkan
        for (int i = 0, j = 1; i < len; i++, j++) {
            String p = (s.substring(i, j));
            int k = Integer.parseInt(p);
            k = (int) Math.pow(k, 2);
            q += k;
        }

        // Output
        System.out.print("Ini adalah gabungan hasil kuadrat setiap digit angka\t: ");
        System.out.println(q);
        io.close();
    }
}
