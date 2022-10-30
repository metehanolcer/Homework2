package berkinhocaodev;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random() * 100);
        System.out.println("Bir sayı tahmin edin");
        int sayi = scanner.nextInt();

        int sayac = 1;

        while (sayi != rastgeleSayi) {

            if (sayi > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı tahmin et");
                sayac++;
            } else {
                System.out.println("Daha büyük bir sayı tahmin et");
                sayac++;
            }
            System.out.println("Yeni tahmininiz nedir?");
            sayi = scanner.nextInt();

            if(sayi==rastgeleSayi)
                System.out.println(sayac+". denemede doğru tahminde bulundunuz.");
        }

    }


	}

