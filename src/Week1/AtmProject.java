//Pratik - ATM Projesi.

package Week1;
import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımladık.
        String username,password;
        int right=3,balance=1500,select = 0,price;
        Scanner input=new Scanner(System.in);

        //Döngüleri kullanarak atm işlemlerinin yapılmasını sağladım.

        while (right>0){
            System.out.print("Kullanıcı Adınız :");
            username=input.nextLine();
            System.out.print("Şifreniz :");
            password=input.nextLine();
           if((username.equals("emre"))&&(password.equals("cimen"))){
               System.out.println("Merhaba Patika Bankasına Hoşgeldiniz!");
               do {
                   System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n"+"3-Bakiye Sorgulama\n"+"4-Çıkış Yap");
                   System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                   select=input.nextInt();
                   switch (select){
                       case 1:
                           System.out.print("Para Miktarı :");
                           price=input.nextInt();
                           balance+=price;
                           break;
                       case 2:
                           System.out.print("Para Miktarı :");
                           price=input.nextInt();
                           if(price>balance){
                               System.out.println("Yetersiz Bakiye.");
                           }else {
                               balance-=price;
                           }
                           break;
                       case 3:
                           System.out.println("Toplam Bakiye :" + balance);
                           break;
                       case 4:
                           System.out.println("Tekrar Görüşmek Üzere!");
                           break;
                   }

               }while (select!=4);
               break;
           }else {
               right--;
               System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar Deneyiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan deneme hakkınız :" + right);
                }
           }

        }



    }
}
