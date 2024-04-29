
//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

package Week2;
import java.util.Scanner;

public class PalindromNumber {

    /*Sayıyının 10 a bölümünden kalan bize son basamağı veriyor ve sayıyı direk 10 böldüğümüzde son basamaktaki sayıyı
     atmış bir şekilde yeni sayıyı elde ediyoruz.Bu yüzden bu algoritmayı kullandık.
     Sonucumuz true dönünce girilen sayı Palidrom,false dönünce sayımızın Palidrom bir sayı olmadığını gösteriyor.*/

    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10) + lastNumber;
            temp/=10;
        }
        if(reverseNumber==number){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        //Kullanıcının sayıyı girmesi için Scanner kullandım ve bunu ispalidron fonksiyonuna gönderdim.
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number=input.nextInt();
        System.out.println(isPalindrom(number));
    }
}
