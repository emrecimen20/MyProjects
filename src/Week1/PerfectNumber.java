/*Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
 kendisine eşit olan sayıya mükemmel sayı denir.Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
 ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı
 Java dilinde yazınız.*/

package Week1;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //Değişkenlerimizi yazdık Scanner kullanarak kullanıcının sayı girmesini sağladım.
        int number,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        number=input.nextInt();

        //Kullanıcı negatif bir sayı girince hata almasını ve programın sonlanmasını sağladım.
        if(number<0){
            System.out.println("Hatalı giriş lütfen pozitif tam sayı giriniz.");
            return;
        }
            //Girilen sayının pozitif tam bölenlerini bulup topladık ve toplam değişkenine eşitledim.
            for(int i=1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
            }
            //Eğer bölenleri toplamı sayıya eşitse mükemmel sayı değilse mükemmel sayı değil yazdırdım.
        if(toplam==number){
            System.out.println("Bu bir Mükemmel Sayıdır.");
        }else {
            System.out.println("Bu bir Mükemmel Sayı Değildir.");
        }

    }
}
