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
public class UAPNomor3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int b = in.nextInt();
        int tabrakan = 0;

        if (10 <= m && m <= 350 && 10 <= n && n <= 35) {
            char[][] peta = new char[m][n];
            for (int i = 0; i < m; i++) {
                String petaInput = in.next();
                for (int j = 0; j < n; j++) {
                    peta[i][j] = petaInput.charAt(j);
                }
            }

            int xMobil = 0;
            int yMobil = 0;

            while (xMobil < m) {
                if (peta[xMobil][yMobil % n] == '#') {
                    tabrakan++;
                }
                xMobil += b;
                yMobil += r;
            }

            System.out.println(tabrakan);
        }
        in.close();
    }

}
