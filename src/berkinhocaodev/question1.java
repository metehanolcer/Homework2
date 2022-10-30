package berkinhocaodev;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.next();
        int a= kelime.charAt(0);
        if(kelime.startsWith("a")) {
            System.out.println(kelime.charAt(kelime.length()-1));
        }
        else if(kelime.startsWith("b")) {
            System.out.println(kelime.replaceFirst("b", "@"));
        }

        else{
            System.out.println("1. karekter: " + kelime.charAt(0));

    }
	}

}
