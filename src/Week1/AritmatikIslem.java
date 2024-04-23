package Week1;
import java.util.Scanner;
public class AritmatikIslem {
    public static void main(String[] args) {
        int number1,number2,number3,process;   //Sayılarımızı ve işlemimizi değişken olarak yazddık.
        Scanner input= new Scanner(System.in);

        //Kullanıcının sayıları girmesini sağlıyoruz.
        number1=input.nextInt();
        number2=input.nextInt();
        number3=input.nextInt();
        process=number1+number2*number3-number2; //işlemimizi düzenledik.

        System.out.println("İşlem Sonucu: " +process);  //Sonucumuzu ekrana bastırdık.
    }
}
