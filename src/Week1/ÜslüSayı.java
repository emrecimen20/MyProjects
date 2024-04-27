//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

package Week1;

import java.util.Scanner;

public class ÜslüSayı {
    public static void main(String[] args) {
        //Sayılarımızı gireceğimiz değişkenleri yazdık ve Scannerla kullanıcının girebilmesini sağladık.
        int n,k,total=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı :");
        n=input.nextInt();
        System.out.print("Üs olacak sayı :");
        k=input.nextInt();

        /* i ile döngünün kaç kere çalışması gerektiğini belirledik.
         Çalıştığı kadar girilen n sayısının çarpılmasını sağladık*/

        for(int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(n+ " üssü "+k+ " = "+total);
    }
}
