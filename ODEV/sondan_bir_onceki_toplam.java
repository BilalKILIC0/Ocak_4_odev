package pkg4_ocak_odev;

import java.util.Scanner;

public class sondan_bir_onceki_toplam {

    /*
    Klavyeden Girilen NxN Tipindeki A Matrisinin Sondan Bir Önceki Satır 
    Ve Sütunundaki Elemanlarının Toplamını Hesaplayan Program.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N Değerini Aldık.
        System.out.println("Lutfen NxN Tipindeki A MAtrisi Icin N Degerini Giriniz :");
        int n = input.nextInt();

        //Toplamı Ve A Dizisini Belirledik.
        int toplam = 0;

        int a[][] = new int[n][n];

        //A Dizisinin Elemanlarını 1-9 Arası Random Ekledik.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                a[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        System.out.print("\nA Matrisi\n");

        //A Dizisini Ekrana Yazdırdık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //Son Satır Ve Son Sütundaki Elemanları Toplattık.
        for (int i = 0; i <= n - 2; i++) {

            toplam = toplam + a[i][n - 2] + a[n - 2][i];
        }

        //Toplamdan İki Kere Toplanan Değeri Çıkardık.
        int sonuc = toplam - (a[n - 2][n - 2]);

        //Toplamı Ekrana Yazdırdık.
        System.out.println("\nBir Onceki Satir Ve Sutun Toplami :" + sonuc);

    }
}
