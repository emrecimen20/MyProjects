package Week2;
import java.util.Scanner;

public class AdvancedCalculator {

    static void plus(){
        Scanner input=new Scanner(System.in);
        int number,result=0,i=1;
        while (true){
            System.out.print(i++ +". Sayı :");
            number=input.nextInt();
            if(number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void minus(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter=input.nextInt();
        int number,result=0;
        for(int i=1;i<=counter;i++){
            System.out.print(i + ". Sayı :");
            number=input.nextInt();
            if(i==1){
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void times(){
        Scanner input=new Scanner(System.in);
        int result=1,number,i=1;
        while (true){
            System.out.print(i++ + ". Sayı :");
            number=input.nextInt();
            if(number==1){
                break;
            }
            if(number==0){
                result=0;
                break;
            }
            result*=number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void divided(){
        Scanner input= new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter=input.nextInt();
        double result=0.0,number;

        for(int i=1;i<=counter;i++){
            System.out.print(i + ". Sayı :");
            number=input.nextInt();
            if(i!=1 && number==0){
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if(i==1){
                result+=number;
                continue;
            }
                 result/=number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void power(){
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base=input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent=input.nextInt();
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        System.out.println("Sonuç :" + result);
    }

    static void factorial(){
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Griniz :");
        int number=input.nextInt();
        int result=1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        System.out.println("Sonuç :" + result);
    }

    static void mod(){
        Scanner input=new Scanner(System.in);
        System.out.print("Modu alınacak sayı :");
        int number1= input.nextInt();
        System.out.print("Bölen :");
        int number2= input.nextInt();
        int result=0;
        if(number1<number2){
            System.out.println("Hatalı giriş.");
        }
        if(number1==number2){

        }
        if(number1>number2){
            result=number1%number2;
        }
        System.out.println("Sonuç :" + result);
    }

    static void alanCevre(){
        Scanner input=new Scanner(System.in);
        int kenar1,kenar2,result;
        System.out.print("1. kenar uzunluğu :");
        kenar1=input.nextInt();
        System.out.print("2. kenar uzunluğu :");
        kenar2=input.nextInt();
       String menu="1-Alan Hesabı\n"+"2-Çevre Hesabı";
        System.out.println(menu);
        System.out.print("İşlem Seçiniz :");
        int select=input.nextInt();

        switch (select){
            case 1:
                result=kenar1*kenar2;
                System.out.println("Sonuç :" + result);
                break;
            case 2:
                result=(kenar1+kenar2)*2;
                System.out.println("Sonuç :" + result);
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz. Tekrar deneyiniz.");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int select;
        String menu="1-Toplama İşlemi\n"
                +"2-Çıkarma İşlemi\n"
                +"3-Çarpma İşlemi\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Faktoriyel Hesaplama \n"
                +"7-Mod Alma \n"
                +"8-Dikdörtgen Çevre ve Alan Hesabı\n"
                +"0-Çıkış Yap";
        do{
            System.out.println(menu);
            System.out.print("İşlem Seçiniz :");
            select=input.nextInt();

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz. Tekrar deneyiniz.");

            }
        }while (select!=0);

    }
}
