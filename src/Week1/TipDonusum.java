/*Soru: Java'da tip dönüşümlerini anlamak için bir program yazınız. Daha sonra bu tam sayıyı ondalıklı
 Bu program, öncelikle kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini istesin.
 sayıya dönüştürerek ve bu ondalıklı sayıyı tam sayıya dönüştürerek sonuçları ekrana yazdırsın.*/
package Week1;
import java.util.Scanner;

public class TipDonusum {
    public static void main(String[] args) {

        //Kullanıcının gireceği sayıları değişkenlere atadım ve Scanner kullanarak sayı girişini sağladım.
        int number1;
        double number2;

        Scanner input=new Scanner(System.in);
        System.out.print("Tam Sayı Giriniz :");
        number1=input.nextInt();

        System.out.print("Ondalıklı Sayı Giriniz :");
        number2=input.nextDouble();

        //int i double a double ı inte çevirdim ve ekrana bastırdım.
        double number3=number1;
        int number4=(int)number2;

        System.out.println(number3);
        System.out.println(number4);
    }
}
