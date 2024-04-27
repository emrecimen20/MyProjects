/* Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
*EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
*EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir. */

package Week1;
import java.util.Scanner;

public class EbobveEkok {
    public static void main(String[] args) {

        //Öncelikle burada değişkenlerimizi tanımladık ve kullanıcının sayı girebilmesi için Scanner kullandık.
        int ebob=0,n1,n2,i=1,select;
        Scanner input=new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz :");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2=input.nextInt();
        System.out.println("1-EBOP\n" + "2-EKOK");
        System.out.print("Yapmak İstediğiniz İşlem :");
        select=input.nextInt();

        //Kullanıcının sayıların ebob veya ekokunu bulması için seçim yaptırdım.Bunun için switch-case kullandım
switch (select){
    case 1:
        if(n1>n2){                        //Kullanıcıdan girilecek sayılardan hangisi daha büyük bilmediğimiz için
            while (i<=n1 && i<=n2){       //iki durumu da değerlendirdik.
                if(n1%i==0 && n2%i==0){
                    ebob=i;               //İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğğ ebob yani i sayısı oluyor.
                }
                i++;
            }
            System.out.println(ebob);
        }else{
            while (i<=n1 && i<=n2){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.println(ebob);
        }
        break;
    case 2:
        if(n1>n2){                           //İki ya da daha fazla doğal sayının ortak katlarının en küçüğü direk i sayısı oluyor
            while (i<=n1*n2){
                if(i%n1==0 && i%n2==0){
                    System.out.println(i);
                    break;
                }
                i++;
            }

        }else{
            while (i<=n1*n2){
                if(i%n1==0 && i%n2==0){
                    System.out.println(i);
                    break;
                }
                i++;
            }

        }
        break;
}
    }
}
