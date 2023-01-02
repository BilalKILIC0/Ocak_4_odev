package pkg4_ocak_odev;

import java.util.Scanner;

public class simetrik_olup_olmadıgını_kontrol_et {

    /*
    Klavyeden Girilen NxN Tipindeki A Matrisinin Simetrik Olup Olmadığını
    Kontrol Eden Program.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N Değerini Aldık.
        System.out.println("Lutfen NxN Tipindeki A Matrisi Icin N Sayisini Giriniz :");
        int n = input.nextInt();

        //A Matrisini Ve Sayacı Tanımladık.
        int a[][] = new int[n][n];
        int sayac = 0;

        //A Matrisinin Elemanlarını Kullanıcıdan Aldık.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("A(" + i + "," + j + ") =");
                a[i][j] = input.nextInt();
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

        //A MAtrisinin Simetrik Elemanlarını Kontrol Ettik.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i != j) {

                    //Koşul Sağlarsa Sayacı Artırıp Döngüden Çıktık.
                    if (a[i][j] == a[j][i]) {
                        sayac++;
                        break;
                    }
                }
            }
        }

        //Eğer Sayac N 'e Eşitse Simetrik Matris Yazdırdık.
        if (sayac == n) {

            System.out.println("Girilen Matris Simetrik Matristir.");
        } //Değilse Simetrik Matris Değildir Yazdırdık.
        else {
            System.out.println("Girilen Matris Simetrik Degildir.");
        }
    }
}
