
/*Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak */

package Week2;
import java.util.Scanner;

public class IsPalindrome {

    static boolean isPalindrome(String str){

        /*Kelimenin ilk indisine i,son indisine j değeri verdim.i yi arttırdım ve j yi azalttım ve aldıkları
        değerleri her defasında karşılaştırdım.Eşitlik olursa true değeri döndürdük ve kelime palindromik oldu.*/

        int i=0;
        int j=str.length()-1;
        while (i<j){
           if(str.charAt(i)!=str.charAt(j)) {
               return false;
           }
           i++;
           j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kelime girmesi için word isimli bir değişken kullandım ve Scanner sınıfı kullandım.
        System.out.print("Kelime Giriniz :");
        word= input.nextLine();

        //isPalindrome metodunda girilen kelimeyi çalıştırdım ve sonuca göre mesajımızı kullanıcıua bastırdım.
        if(isPalindrome(word)){
            System.out.println("Bu kelime palindromik kelimedir .");
        }else{
            System.out.println("Bu kelime palindromik kelime değildir.");
        }

    }

}
