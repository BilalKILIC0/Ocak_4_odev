package pkg4_ocak_odev;
import java.util.Scanner;

public class sutun_elemanlari_carpimi {

    /*
    Klavyeden Girilen NxN Tipindeki A Matrisinin Her Bir Sütun Elemanları
    Çarpımından N Elemanlı B Dizisi Oluşturan Program.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N Sayısını Aldık.
        System.out.println("Lutfen NxN Tipindeki A Matrisi Icin N Degerini Giriniz :");
        int n = input.nextInt();

        //Dizilerimiz Tanımladık.
        int a[][] = new int[n][n];
        int b[] = new int[n];

        //A Matrisinin 1 - 9 Arası Elemanlarını Ekledik.
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

        //B Dizisinin Elemanlarını Hesaplattık.
        for (int i = 0; i < n; i++) {

            b[i] = 1;
            for (int j = 0; j < n; j++) {

                b[i] *= a[j][i];
            }
        }

        System.out.print("\nB Dizisi\n");

        //B Dizisini Yazdırdık.
        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}
