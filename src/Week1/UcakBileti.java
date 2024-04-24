package Week1;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int distance,age,tripType;
        double price=0.10,normalPrice,yasIndirimi,indirimliTutar,gidisDonus,toplamTutar;
        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz :");
        distance=input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        age=input.nextInt();
        System.out.print("Yolculuk tipini giriniz :");
        tripType=input.nextInt();

        normalPrice=(distance*price);


        if((age<12) && (tripType==1)){
            yasIndirimi=(normalPrice*50)/100;
            indirimliTutar=normalPrice-yasIndirimi;
            gidisDonus=(indirimliTutar*20)/100;
            toplamTutar=(indirimliTutar-gidisDonus)*2;
            System.out.print("Toplam Tutar :" + toplamTutar);
        } else if ((age<12)&&(tripType==2)) {
            yasIndirimi=(normalPrice*50)/100;
            indirimliTutar=normalPrice-yasIndirimi;
            System.out.println("Toplam Tutar :" + indirimliTutar);
        } else if ((age>12) && (age<24) && (tripType==1)) {
            yasIndirimi=(normalPrice*10)/100;
            indirimliTutar=normalPrice-yasIndirimi;
            gidisDonus=(indirimliTutar*20)/100;
            toplamTutar=(indirimliTutar-gidisDonus)*2;
            System.out.println("Toplam Tutar :" + toplamTutar);
        } else if((age>12) && (age<24) && (tripType==2)) {
            yasIndirimi=(normalPrice*10)/100;
            indirimliTutar=normalPrice-yasIndirimi;
            System.out.println("Toplam Tutar :" + indirimliTutar);
        } else if ((age>24)&&(age<65)&&(tripType==1)) {
            gidisDonus=(normalPrice*20)/100;
            toplamTutar=(normalPrice-gidisDonus)*2;
            System.out.println("Toplam tutar :" + toplamTutar);
        } else if ((age>24)&&(age<65)&&(tripType==2)) {
            System.out.println("Toplam Tutar :" + normalPrice);
        } else if ((age>65) && tripType==1) {
            yasIndirimi=(normalPrice*30)/100;
            indirimliTutar=normalPrice-yasIndirimi;
            gidisDonus=(indirimliTutar*20)/100;
            toplamTutar=(indirimliTutar-gidisDonus)*2;
            System.out.print("Toplam Tutar :" + toplamTutar);
        } else if ((age>65) && (tripType==2)) {
            yasIndirimi=(normalPrice*30)/100;
            indirimliTutar=normalPrice-yasIndirimi;
            System.out.println("Toplam Tutar :" + indirimliTutar);
        }else{
            System.out.println("Hatalı veri Girdiniz!");
        }
    }
}
