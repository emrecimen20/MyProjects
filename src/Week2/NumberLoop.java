/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16

*/

package Week2;
import java.util.Scanner;

public class NumberLoop {

    public static void loop(int number) {


        //Bu koşulu sağlayarak ve recursive metot kullanarak deseni elde ettik.
       if(number<=0){
           System.out.print(number+ " ");
           return;

       }else if(number>0){
           System.out.print(number + " ");
           loop(number-5);
           System.out.print(number + " ");
        }



    }

    public static void main(String[] args) {
        //Kullanıcın gireceği sayıyı değişkene atadık ve Scanner kullanarak girişi sağladım.
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        number=input.nextInt();

        //Döngü metodunu çağırdım.
       loop(number);
    }
}
