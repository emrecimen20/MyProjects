package Week1;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00,kg; //Meylerin kg fiyatları yazıldı.

        //Her seferinde tek tek hangi meyveden kaç kg istendiği kullanıcıya soruldu.

        System.out.print("Armut Kaç kilo ? :");
        kg=input.nextDouble();
        double armutPrice=armut*kg;

        System.out.print("Elma Kaç kilo ? :");
        kg=input.nextDouble();
        double elmaPrice=elma*kg;

        System.out.print("Domates Kaç kilo ? :");
        kg=input.nextDouble();
        double domatesPrice=domates*kg;

        System.out.print("Muz Kaç kilo ? :");
        kg=input.nextDouble();
        double muzPrice=muz*kg;

        System.out.print("Patlıcan Kaç kilo ? :");
        kg=input.nextDouble();
        double patlıcanPrice=patlıcan*kg;

//Meyvelerin kg ları hesaplandıktan sonra toplam fiyat bastırıldı

        double toplam=patlıcanPrice+armutPrice+muzPrice+domatesPrice+elmaPrice;
        System.out.println("Toplam Tutar :" + toplam);
    }
}
