/*Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.*/

package Week2;
import java.util.Scanner;

public class RecursiveAsal {

    public static boolean isPrimeNumber(int sayi,int bolen) {

        /*Sayı kendine eşit olana kadar bolen değerini bir artırdım. Sayı kendine eşitlenene kadar
        hiçbir koşulu sağlamadığı zaman asal sayı oldu. Eğer sayı kendine eşitlenene kadar diğer 2 koşuldan birini
        saplasaydı değerim false dönecekti ve asal sayı olmayacak. */

        if (sayi <= 1) {
            return false;
        }
        if (bolen >= sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return isPrimeNumber(sayi,bolen+1);
    }
    public static void main(String[] args) {

        //Girilecek sayımızı değişkene atadım ve scanner kullanarak kullanıcıdan girişini sağladım.
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        number=input.nextInt();

        //Asal sayı olup olmadığını kontrol eden metodum true dönerse asal sayıdır false dönerse asal değildir şeklinde mantık kurdum.
        if(isPrimeNumber(number,2)){  //en küçük asal sayı 2 olduğu için böleni 2 den başlattım.
            System.out.print("Sayı asal sayıdır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }
    }
}
