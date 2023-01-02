package pkg4_ocak_odev;

import java.util.Scanner;

public class yedek_kosegen {

    /*
    Klavyeden Girilen NXN Tipindeki A MAtrisinin Yedek Köşeğeninin
    Üstünde Kalan Elemanların Toplamını Hesaplayan Program.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int toplam = 0;

        //Kullanıcıdan N Değerini Aldık.
        System.out.println("Lutfen Matris Icin N Degerini Giriniz :");
        int n = input.nextInt();

        //Dizi Tanımladık
        int a[][] = new int[n][n];

        //Dizi Elemanlarını Random 1-9 Arası Belirledik.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                a[i][j] = (int) (Math.random() * 9 + 1);

            }
        }

        System.out.println();

        //Elemanları Ekrana Yazdırdık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //Yedek Köşeğen Olup Oladığını Kontrol Ettik.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((i + j) < (n)) {

                    toplam += a[i][j];
                }
            }
        }

        //Toplamı Ekrana Yazdırdık.
        System.out.println("\nYedek Kosegen Elemanlari Toplami :" + toplam);
    }
}
