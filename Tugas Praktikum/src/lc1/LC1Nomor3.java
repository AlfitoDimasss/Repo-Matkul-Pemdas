package lc1;

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
public class LC1Nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Ini adalah program untuk mencari suku ke-n dari suatu deret aritmatika
         * bertingkat. Deret tersebut yaitu 10, 11, 14, 19,...
         */

        // Input
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();

        // Rumus suku ke-n
        int t = (n * n) + (-2 * n) + 11;

        // Output
        System.out.println(t);
        io.close();
    }
}
