//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

package Week1;

import java.util.Scanner;

public class DortveBesKuvvetleri {
    public static void main(String[] args) {

        //Gireceğimiz sayıyı değişkene atadık.
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        sayi=input.nextInt();

        System.out.println("5 in kuvvetleri :");
        for(int i=1;i<=sayi;i*=5){
            System.out.println(i);
        }

        System.out.println("4 ün kuvvetleri :");
        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
    }
}
