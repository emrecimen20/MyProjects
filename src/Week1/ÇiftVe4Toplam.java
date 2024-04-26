/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
 çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

package Week1;

import java.util.Scanner;

public class ÇiftVe4Toplam {
    public static void main(String[] args) {

        //Gireceğimiz sayıyı ve toplam değişkenini tanımladık ve Scanner tanımladık.
        int sayi,toplam=0;
        Scanner input=new Scanner(System.in);

        /*Programın hemen başlayıp sayı girmemiz için  bu döngüyü kullandım. Sayının çift olma ve 4 e
        tam bölünme kuralı gereği bu koşulu yazdım ve
        döngünün sonlanmasını sayının tek olmasına bağladım
        Girilen ve koşulu sağlayan sayıların toplamını bastırdım*/
        do{
            System.out.print("Sayı giriniz :");
            sayi=input.nextInt();
            if(sayi%2==0 && sayi%4==0) {
                toplam += sayi;
            }
        } while (sayi%2==0);
        System.out.println(toplam);
    }
}
