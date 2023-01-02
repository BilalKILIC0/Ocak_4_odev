package pkg4_ocak_odev;

import java.util.Scanner;

public class ust_ucgen_matrisi {

    /*
    Klavyeden Girilen NXN Tipindeki A Matrisinden Üst Üçgen B Matrisini 
    Oluşturan Program.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //A ve B Matrisi İçin N Değeri Aldık.
        System.out.println("Lutfen A Matrisi Icın N Degerini Belirleyiniz :");
        int n = input.nextInt();

        //Toplamı Belirledik.
        int toplam = 0;

        //Dizileri Tanımladık.
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        //A Dizisinin Elemanlarını Atadık. 1 - 9 arası.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                a[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        System.out.print("\nA Matrisi\n");

        //A Matrisini Yazdırdık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //B Matrisinin Elemanlarını Atadık. Ve Koşulu Sağladığında Toplamı Artırdık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((i == j) || (i < j)) {

                    b[i][j] = a[i][j];
                    toplam += b[i][j];
                } else {
                    b[i][j] = 0;
                }
            }
        }

        System.out.print("\nB Matrisi\n");

        //B Matrisini Yazdırdık
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        //Toplamı Yazdırdık.
        System.out.println(toplam);

    }
}
