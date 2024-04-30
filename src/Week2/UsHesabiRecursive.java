/*Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.*/

package Week2;
import java.util.Scanner;

public class UsHesabiRecursive {

    /*Taban sayısını üs sayısı kadar çarpacak şekilde bir döngü kullandım.Üssü 0 olan bir sayı 1 olduğu için
    ilk koşulu 1 olarak döndürdüm.*/
    public static int power(int base,int exponent){
        int result;
        if(exponent==0){
            return 1;
        }else{
            return base*power(base,exponent-1);
        }
    }

    public static void main(String[] args) {

        //Gireceğimiz sayıları değişkenlere atadım.
        int number1,number2;
        Scanner input=new Scanner(System.in);

        System.out.print("Taban Değeri giriniz :");
        number1=input.nextInt();
        System.out.print("Üs Değeri Giriniz :");
        number2=input.nextInt();

        //Üs alma metodunuı çağırdım.
        System.out.println(power(number1,number2));
    }
}
