/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve
en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.*/

package Week1;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        /*Öncelikle değişkenleri tanımladım.öin ve max değişkenleri yazacağımız sayıların en büyük ve
        en küçüğünü vermesi için.*/

        int n,number,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;;
        Scanner input=new Scanner(System.in);         //Kullanıcı değişkenleri girebilsin diye Scanner tanımladım.

        System.out.print("Kaç tane sayı gireceksiniz :");
        n=input.nextInt();

        /*Kaç tane sayı gireceksinize karşılık olarak negatif bir değere izin vermemesi için
        bu koşulu koydum. Ve koşul sağlandığında kodun devam etmemesi için return kullanıp geriye döndürdüm.*/

        if(n<=0){
            System.out.println("Geçersiz Giriş. Pozitif tam sayı girmelisiniz.");
            return;
        }

        /*for döngüsü kullandım.Ne kadar sayı gireceksiniz sorusunda kullanıcın girdiği değer kadar döngüyü
        devam ettirdim*/

        for(int i=1;i<=n;i++){
            System.out.print(i+". Sayıyı Giriniz :");
            number=input.nextInt();
            if(number<min){
                min=number;
            }
            if(number>max){
                max=number;
            }
        }
        //maax ve min değerlerini ekrana bastırma işlemi.
        System.out.println("En Büyük Sayı :"+max);
        System.out.println("En Küçük Sayı :"+min);
    }
}
