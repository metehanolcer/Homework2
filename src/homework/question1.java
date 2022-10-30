package homework;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		String sayi = scanner.nextLine();
		//int a= sayi.charAt(0);
		for (int i = sayi.length()-1; i >= 0; i--) {
            char tersSayi = sayi.charAt(i);
            System.out.print(tersSayi);
            
          
	}
	
}

}