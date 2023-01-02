package pkg4_ocak_odev;

import java.util.Scanner;

public class alt_ucgen_matrisi {

    /*
    Klavyeden Girilen NXN Tipindeki A Matrisinden Alt Üçgen B Matrisini
    Oluşturan Program.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N Sayısını Aldık.
        System.out.println("Lutfen NxN Tipindeki A Matrisinin N Degerini Giriniz :");
        int n = input.nextInt();

        //Dizileri ve Toplam Değişkenini Tanımladık.
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int toplam = 0;

        //A Dizisini 1-9 Arası Rastgele Elemanlarını Ekledik.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                a[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        System.out.print("\nA Matrisi\n");

        //A Matrisini Ekrana Yazdırdık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //B Matrisinin Koşula Uyan Elemanları Ve Toplamı Ekledik . Uymayanları 0 Atadık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((i == j) || (i > j)) {

                    b[i][j] = a[i][j];
                    toplam += b[i][j];
                } else {
                    b[i][j] = 0;
                }
            }
        }

        System.out.print("\nB Matrisi\n");

        //B Matrisini Yazdırdık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //Toplamı Yazdırdık.
        System.out.println("Alt Ucgen B Matrisi Toplami :" + toplam);
    }
}
