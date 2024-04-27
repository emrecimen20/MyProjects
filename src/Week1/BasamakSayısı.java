//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

package Week1;
import java.util.Scanner;

public class BasamakSayısı {
    public static void main(String[] args) {

        //Değişkenleri yazdık ve Scanner kullanarak kullanıcı girişi sağladık.
        int number,basValue,toplam=0;
        Scanner input=new Scanner(System.in);
        number=input.nextInt();

        /*int değerinde bir sayının 10 a bölümünden kalan direk o sayının son basamağındaki sayı
        olduğu için bu şekilde bir döngü kurarak sayıları ayırıp topladık.*/
        while (number!=0){
            basValue=number%10;
            toplam+=basValue;
            number/=10;
        }
        System.out.println(toplam);
    }
}
