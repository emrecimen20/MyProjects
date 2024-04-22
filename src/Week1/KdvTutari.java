package Week1;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
double price,kdvRate1=0.18,kdvRate2=0.08;
Scanner input= new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");

        price=input.nextDouble();
        System.out.println("KDV'siz Fiyat= " + price);
    double kdvTutarı=((price>0) && (price<1000)) ? price*kdvRate1 : price*kdvRate2;
        System.out.println("KDV Tutarı= " + kdvTutarı);
        double toplam=price+kdvTutarı;
        System.out.println("KDV'li fiyat= " + toplam);
    }
}
