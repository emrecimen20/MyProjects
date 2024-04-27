//Java ile girilen sayının harmonik serisini bulan program yazacağız.
package Week1;
import java.util.Scanner;

public class HarmonikSayı {
    public static void main(String[] args) {
        //Değişkenlerimizi yazdık.Toplam değer ondalık sayı olacağı için double tanımladık.
        int n;
        double toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        n=input.nextInt();

        //i sayısını da double aldık çünkü int tanımlarsak hep 1 sonucunu alırız.Harmonik serinin formülünü yazdık.
        for(double i=1;i<=n;i++){
            toplam+=1/i;
        }
        System.out.println(toplam);
    }
}
