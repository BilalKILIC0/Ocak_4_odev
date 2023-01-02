package pkg4_ocak_odev;
import java.util.Scanner;

public class sirket_aylik_kar {

    /*
    N Tane Şirketin Bir Yıla Ait Aylık Kar Oranları, Bilgisayara Girilmektedir.
    Buna Göre ;
    i : Herbir Şirketin Yıllık Ortalama Kar Miktarları ,
    ii : Herbir Şirketin En Az Ve En Fazla Kar Elde Ettiği Ayları Ve Miktarlarını ,
    iii : Herbir Aya Ait En Az Ve En Fazla Kar Miktarları Ve Şirketleri Veren Program .
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Sirket Sayisini Giriniz :");
        int sirket = input.nextInt();

        //Dizileri Tanımladık
        int kar[][] = new int[sirket][12];
        String sirketler[] = new String[sirket];
        double ortalama[] = new double[sirket];

        //System.out.print("\nLutfen Kar Oranlarini Giriniz :\n");
        for (int i = 0; i < sirket; i++) {

            for (int j = 0; j < 12; j++) {

                //System.out.print("Kar(" + (i + 1) + "," + (j + 1) + ") Giriniz :");
                //Bu Sekilde Kullanıcıdan Alabiliriz.
                //Do While Döngüsünü Rastgele Sayının Birbirinden Farklı Olması İçin Yazdık.
                do {

                    kar[i][j] = (int) (Math.random() * 70 + 1);

                } while (kar.equals(kar[i][j]));
            }
        }

        //Şirket İsimlerini Kullanıcıdan Aldık.
        for (int i = 0; i <= sirketler.length - 1; i++) {

            System.out.print("Lutfen (" + (i + 1) + ") .Sirketi Yaziniz :");
            sirketler[i] = input.next();

        }

        System.out.print("\nSirketler Ve Yillik Kar Oranlari\n");

        //Kar Oranlarını Yazdırdık.
        for (int i = 0; i < sirket; i++) {

            System.out.println(sirketler[i] + " ");

            for (int j = 0; j < 12; j++) {

                //Son Ay Değilse Aralara , Kullandık. Son Ay İse Nokta Koyduk.
                if (j < 11) {

                    System.out.print("'" + kar[i][j] + "'" + ",");
                } else {
                    System.out.println("'" + kar[i][j] + "'" + ".");
                }
            }
        }

        // i : Herbir Şirketin Yıllık Ortalama Kar Miktarları ,
        for (int i = 0; i < sirket; i++) {

            double top_ort = 0;
            for (int j = 0; j < 12; j++) {

                top_ort += kar[i][j];
            }
            ortalama[i] = top_ort / 12;
        }
        System.out.println();

        for (int i = 0; i <= ortalama.length - 1; i++) {

            System.out.print(sirketler[i] + " Sirketinin Yillik Ortalama Kari :");
            System.out.printf("%.2f", ortalama[i]);
            System.out.println();
        }

        System.out.println();

        //ii : Herbir Şirketin En Az Ve En Fazla Kar Elde Ettiği Ayları Ve Miktarlarını ,
        for (int i = 0; i < sirket; i++) {

            int max = kar[i][0], min = kar[i][0];
            int maxj = 0, minj = 0;

            for (int j = 0; j < 12; j++) {

                if (kar[i][j] > max) {

                    max = kar[i][j];
                    maxj = j;
                }
                if (kar[i][j] < min) {

                    min = kar[i][j];
                    minj = j;
                }
            }

            System.out.print(sirketler[i] + " Sirketinin En Az Kar " + (minj + 1) + " .Ay " + min + " TL Ve En Fazla Kar " + (maxj + 1) + " .Ay " + max + " TL 'dir");
            System.out.println();
        }

        System.out.println();

        // iii : Herbir Aya Ait En Az Ve En Fazla Kar Miktarları Ve Şirketleri Veren Program .
        for (int i = 0; i < 12; i++) {

            int max = 0, min = kar[0][i];
            int maxj = 0, minj = 0;
            for (int j = 0; j < sirket; j++) {

                if (kar[j][i] > max) {

                    max = kar[j][i];
                    maxj = j;
                }
                if (kar[j][i] < min) {

                    min = kar[j][i];
                    minj = j;
                }
            }

            System.out.print((i + 1) + " .Ayda En Cok Kar " + max + " TL Ve " + sirketler[maxj]
                    + " Sirketi , En Az Kar " + min + "  TL Ve " + sirketler[minj] + " Sirketi Tarafindan Gerceklestirilmistir.");
            System.out.println();
        }
        //Write By UnSeen.
    }
}
