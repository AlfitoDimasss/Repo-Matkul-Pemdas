package tugas3;

/**
 * Nama 1: ACHMAD NOFANDI (195150401111009)
 * Nama 2: MUHAMMAD ALVIN NUR IRFANY(195150407111001)
 * 
 * Tanggung jawab 1: Mencari algoritma penyelesaian dari setiap method, debugging error, membuat source code.
 * Tanggung jawab 2: Mencari algoritma penyelesaian dari setiap method, debugging error, membuat source code, menulis source code ke dalam word.
 **/

import java.util.Scanner;

public class TP_195150401111009_AchmadNofandi_1 {
    final static int MAX_SISWA = 10;
    final static int MAX_MATPEL = 10;
    final static int MAX_SEMESTER = 2;
    /* menyimpan nama siswa */
    static String[] siswa = new String[MAX_SISWA];
    /* menyimpan nama matpel per siswa tiap semester, semester ganjil=0, genap=1 */
    static String[][][] siswaMatpel = new String[MAX_SISWA][MAX_SEMESTER][MAX_MATPEL];
    /* menyimpan nilai matpel per siswa tiap semester, semester ganjil=0, genap=1 */
    static double[][][] siswaMatpelNilai = new double[MAX_SISWA][MAX_SEMESTER][MAX_MATPEL];
    /* menyimpan banyak siswa */
    static int banyakSiswa = 0;
    /* menyimpan banyak matpel */
    static int banyakSiswaMatpel = 0;

    /* method ini berfungsi untuk mengubah nilai angka menjadi nilai huruf */
    public static String konversiNilai(double nilai) {
        String konversi = "";
        if (nilai <= 100 && nilai > 80)
            konversi = "A";
        else if (nilai <= 80 && nilai > 75)
            konversi = "B+";
        else if (nilai <= 75 && nilai > 69)
            konversi = "B";
        else if (nilai <= 69 && nilai > 65)
            konversi = "C+";
        else if (nilai <= 65 && nilai > 59)
            konversi = "C";
        else if (nilai <= 55 && nilai > 40)
            konversi = "D";
        else
            konversi = "E";
        return konversi;
    }

    /* method ini berfungsi untuk memasukkan nama siswa kedalam Array siswa[] */
    public static void tambahSiswa(String nama) {
        siswa[banyakSiswa] = nama;
        banyakSiswa++;
    }

    /*
     * method ini berfungsi untuk memasukkan nama mata pelajaran kedalam Array
     * siswaMatpel[][][]
     */
    public static void tambahMatpel(String matpel) {
        for (int i = 0; i <= banyakSiswa; i++) {
            siswaMatpel[i][0][banyakSiswaMatpel] = matpel;
            siswaMatpel[i][1][banyakSiswaMatpel] = matpel;
        }
        banyakSiswaMatpel++;
    }

    /*
     * method ini berfungsi untuk mencari nama siswa yang berupa string dalam array
     * siswa[] dan mengembalikan nilai index nama siswa tersebut berada
     */
    public static int cariSiswa(String nama) {
        int index = 0;
        for (int i = 0; i < banyakSiswa; i++) {
            if (siswa[i].equalsIgnoreCase(nama))
                index = i;
        }
        return index;
    }

    /*
     * method ini berfungsi untuk mencari nama mata pelajaran yang berupa string
     * dalam array siswaMatpel[][][] dan mengembalikan nilai index nama mata
     * pelajaran tersebut berada
     */
    public static int cariMatpel(String matpel) {

        int index = 0;
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            if (matpel.equalsIgnoreCase(siswaMatpel[0][0][i]))
                index = i;
        }
        return index;
    }
    /*
     * nama: nama siswa semester: semester, 0 untuk ganjil, 1 untuk genap matpel:
     * nama matpel nilai: nilai matpel tiap semester
     */

    /*
     * method ini berfungsi untuk mengisi atau memasukkan nilai kedalam array
     * siswaMatpelNilai[][][]
     */
    public static void isiDataSiswa(String nama, int semester, String matpel, int nilai) {
        siswaMatpelNilai[cariSiswa(nama)][semester][cariMatpel(matpel)] = nilai;
    }

    /*
     * method ini berfungsi untuk mencetak nama siswa yang sudah tersimpan dalam
     * array siswa[]
     */
    public static void printSiswa() {
        System.out.println();
        System.out.print("SISWA : ");
        for (int i = 0; i < siswa.length; i++) {
            if (siswa[i] != null) {
                System.out.print(siswa[i] + " ");
            }
        }
        System.out.println();
    }

    /*
     * method ini berfungsi untuk mencetak nama mata pelajaran yang sudah tersimpan
     * dalam array siswaMatpel[][][]
     */
    public static void printMatpel() {

        System.out.print("MATA PELAJARAN : ");
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            System.out.print(siswaMatpel[0][0][i] + " ");
        }
        System.out.println();
    }

    /*
     * method ini berfungsi untuk mencetak raport dari tiap siswa baik dalam
     * semester ganjil maupun semester genap
     */
    public static void printRaportSiswa(String nama) {
        int indexNama = cariSiswa(nama);
        System.out.println(">> BEGIN RAPORT << \n");
        System.out.print("Nama: " + siswa[indexNama] + "\n");
        System.out.println("Semester: Ganjil");
        System.out.printf("%-20s|%10s|%14s\n", "Mata Pelajaran", "Nilai", "Nilai Huruf");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            System.out.printf("%-20s|%10s|%15s\n", siswaMatpel[indexNama][0][i], siswaMatpelNilai[indexNama][0][i],
                    konversiNilai(siswaMatpelNilai[indexNama][0][i]));
        }
        System.out.println();
        System.out.println("Semester: Genap");
        System.out.printf("%-20s|%10s|%14s\n", "Mata Pelajaran", "Nilai", "Nilai Huruf");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            System.out.printf("%-20s|%10s|%15s\n", siswaMatpel[indexNama][0][i], siswaMatpelNilai[indexNama][1][i],
                    konversiNilai(siswaMatpelNilai[indexNama][1][i]));
        }
        System.out.println();
        System.out.print(">> END RAPORT << \n");

    }

    /*
     * method ini berfungsi untuk mencari siswa dengan jumlah nilai tertinggi dalam
     * satu semester
     */
    public static int cariJuara(int semester) {
        int[] sementara = new int[banyakSiswaMatpel];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < banyakSiswa; i++) {
            for (int j = 0; j < banyakSiswaMatpel; j++) {
                sementara[i] += siswaMatpelNilai[i][semester][j];
            }
        }
        for (int i = 0; i < sementara.length; i++) {
            if (sementara[i] > max) {
                max = sementara[i];
                index = i;
            }
        }
        return index;
    }

    /*
     * method ini berfungsi untuk menghitung banyak nilaiHuruf seorang siswa dalam
     * satu semester
     */
    public static void hitungNilai(int semester) {
        int[][] sementara = new int[banyakSiswa][8];
        for (int i = 0; i < banyakSiswa; i++) {
            for (int j = 0; j < banyakSiswaMatpel; j++) {

                if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("A")) {
                    sementara[i][0]++;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("B+")) {
                    sementara[i][1]++;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("B")) {
                    sementara[i][2]++;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("C+")) {
                    sementara[i][3]++;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("C")) {
                    sementara[i][4]++;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("D+")) {
                    sementara[i][5]++;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("D")) {
                    sementara[i][6]++;
                } else {
                    sementara[i][7]++;
                }

            }
        }
        for (int i = 0; i < banyakSiswa; i++) {
            System.out.print(siswa[i] + " ");
            if (sementara[i][0] != 0) {
                System.out.print("A:" + sementara[i][0] + " ");
            }
            if (sementara[i][1] != 0) {
                System.out.print("B+:" + sementara[i][1] + " ");
            }
            if (sementara[i][2] != 0) {
                System.out.print("B:" + sementara[i][2] + " ");
            }
            if (sementara[i][3] != 0) {
                System.out.print("C+:" + sementara[i][3] + " ");
            }
            if (sementara[i][4] != 0) {
                System.out.print("C:" + sementara[i][4] + " ");
            }
            if (sementara[i][5] != 0) {
                System.out.print("D+:" + sementara[i][5] + " ");
            }
            if (sementara[i][6] != 0) {
                System.out.print("D:" + sementara[i][6] + " ");
            }
            if (sementara[i][7] != 0) {
                System.out.print("E:" + sementara[i][7] + " ");
            }
            System.out.println();

        }

    }

    /*
     * method ini berfungsi untuk memisah(Split) inputan dengan batas spasi (" ")
     * dan menyimpannya dalam sebuah array
     */
    public static String[] simpanDalamArray(String[] inputLama, String inputBaru) {
        int j = 0;
        String[] inputBaruSplitted = inputBaru.split(" ");
        String[] temp = new String[inputLama.length + inputBaruSplitted.length];
        for (int i = 0; i < inputLama.length; i++) {
            temp[i] = inputLama[i];
        }
        for (int i = 0; i < inputLama.length + inputBaruSplitted.length; i++) {
            if (temp[i] == null) {
                temp[i] = inputBaruSplitted[j];
                j++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        String inputLama[] = new String[0];
        do {
            input = in.nextLine();
            inputLama = simpanDalamArray(inputLama, input);
        } while (!(input.length() == 0));
        for (int i = 0; i < inputLama.length; i++) {
            if (inputLama[i].equalsIgnoreCase("SISWA")) {
                tambahSiswa(inputLama[i + 1]);
            } else if (inputLama[i].equalsIgnoreCase("PRINT_SISWA")) {
                printSiswa();
            } else if (inputLama[i].equalsIgnoreCase("PRINT_MATPEL")) {
                printMatpel();
            } else if (inputLama[i].equalsIgnoreCase("NILAI")) {
                int semester;
                if (inputLama[i + 2].equalsIgnoreCase("GENAP"))
                    semester = 1;
                else
                    semester = 0;
                isiDataSiswa(inputLama[i + 1], semester, inputLama[i + 3], Integer.parseInt(inputLama[i + 4]));
            } else if (inputLama[i].equalsIgnoreCase("MATPEL")) {
                tambahMatpel(inputLama[i + 1]);
            } else if (inputLama[i].equalsIgnoreCase("CARI_JUARA")) {
                int semester;
                if (inputLama[i + 1].equalsIgnoreCase("GENAP"))
                    semester = 1;
                else
                    semester = 0;
                System.out.print("JUARA_1 " + inputLama[i + 1] + " ");
                System.out.print(siswa[cariJuara(semester)] + "\n");
            } else if (inputLama[i].equalsIgnoreCase("NILAI")) {
                int semester;
                if (inputLama[i + 2].equalsIgnoreCase("GENAP"))
                    semester = 1;
                else
                    semester = 0;
                isiDataSiswa(inputLama[i + 1], semester, inputLama[i + 3], Integer.parseInt(inputLama[i + 4]));
            } else if (inputLama[i].equalsIgnoreCase("PRINT_RAPORT")) {
                printRaportSiswa(inputLama[i + 1]);
            } else if (inputLama[i].equalsIgnoreCase("HITUNG_NILAI")) {
                int semester;
                if (inputLama[i + 1].equalsIgnoreCase("GENAP"))
                    semester = 1;
                else
                    semester = 0;
                hitungNilai(semester);
            }

        }
        in.close();

    }
}
