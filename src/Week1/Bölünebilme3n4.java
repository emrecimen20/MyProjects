//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

package Week1;
import java.util.Scanner;

public class Bölünebilme3n4 {
    public static void main(String[] args) {

        //Önce değişkenlerimizi girdik.
        int number,toplam=0,adet=0;
        double ortalama=0;

        //Kullanıcıdan istediğimiz sayıyı scannerla tanımladık.
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        number=input.nextInt();

        //Önce for döngüsünde bu sayıların toplamını ve kaç tane olduğunu bulduk.
        for(int i=0; i<=number ;i++){
            if(i%3==0 && i%4==0){
               toplam+=i;
               adet++;
            }

        }

        // Eğer birden fazla 3 e ve 4 e bölünen sayı varsa ortalamayı hesaplamasını sağladık.
        if(adet>0){
            ortalama=toplam/adet;
        }
        System.out.println("0 dan " + number + "a kadar olan 3 ve 4 e tam bölünen sayıların ortalaması :" + ortalama);
    }
}
