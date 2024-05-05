
/*Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.*/
package Week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int selected,right=0;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;

        Random random=new Random();
        int number=random.nextInt(100);

        while(right<5){
            System.out.print("Tahmininizi Giriniz :");
            selected=input.nextInt();

            //Kullanıcıdan 0-100 arasında tahmin yapması gerektiğini belirttik.Hataya devam ederse hakkından gideceği uyarısı yapıldı.
            if ((selected < 0) || (selected > 99)) {
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if(!isWrong){
                    isWrong=true;
                    System.out.println("Bir daha hatalı Giriş yaparsanız hakkınız düşecek !");
                }else{
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan Hak :" +(5-right) );
                }
                continue;
            }

            //Kullanıcı sayıyı tahmin edince tebrik mesajı bastırdım ve döngüyü bitirdim.
            if(selected==number){
                System.out.println("Tebrikler, Doğru tahmin ! Tahmin ettiğiniz sayı :" + number);
                isWin=true;
                break;
            }else{
                System.out.println("Hatalı bir Sayı girdiniz");
                if(selected>number){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür!");
                }else{
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür!");
                }
                //Kullanıcının yanlış tahminlerini wrong array inde topladım.
                wrong[right]=selected;
                right++;
                System.out.println("Kalan hakkınız :" + (5-right));
            }
        }

        //Oyunu kaybettikten sonra kullanıcının kaybettiğinii tahminleri ve gizli sayımızın kaç olduğunu gösterdim.
        if(!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz :" + Arrays.toString(wrong));
            System.out.println("Gizli Sayı :" + number);
        }
    }
}
