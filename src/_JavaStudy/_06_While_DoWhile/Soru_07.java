package _JavaStudy._06_While_DoWhile;

import java.util.Scanner;

public class Soru_07 {

    public static void main(String[] args) {
//TODO INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner sc = new Scanner(System.in);

        System.out.println("PIN kodunuzu giriniz: ");
        int userPin = sc.nextInt();

        int pinCode = 5555;
        while (userPin != pinCode) {
            System.out.println("********** Yanlış PIN **********");
            System.out.println("Tekrar Deneyiniz");
            userPin = sc.nextInt();
        }
        System.out.println("Başarıyla giriş yapıldı.");
    }
}

