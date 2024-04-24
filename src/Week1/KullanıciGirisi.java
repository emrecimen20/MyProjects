package Week1;
import java.util.Scanner;

public class KullanıciGirisi {
    public static void main(String[] args) {
        //kullanıcı adı şifre ve şifre değişiklik istendiği durumundaki select değişkenlerini tanımladık.
    String kullaniciAdi,sifre;
    int select;
    Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz :");
        kullaniciAdi=input.nextLine();
        System.out.print("Şifrenizi Giriniz :");
        sifre=input.nextLine();
        if(kullaniciAdi.equals("emrecimen") && sifre.equals("patika123")){ //kullanıcı adı ve şifre başarılı durumu.
            System.out.println("Giriş Başarılı!!");
        }else if (!(kullaniciAdi.equals("emrecimen")) && sifre.equals("patika123")){  //kullanıcı adı hatalı durumu.
            System.out.println("Kullanıcı adı hatalı!");
        } else if ((kullaniciAdi.equals("emrecimen")) && !(sifre.equals("patika123"))){  //şifre yanlış durumu.
            System.out.println("Şifre Yanlış! Sıfırlamak istiyor musun ?");
            System.out.println("1-Evet\n2-Hayır");  //şifreyi sıfırlamak için evet veya hayır seçeneği koyduk.
            select=input.nextInt();
            input.nextLine();
           if (select==1){
               System.out.print("Yeni şifre giriniz :");
               sifre=input.nextLine();
               if(sifre.equals("patika123")){ //şifre eski şifreyle aynı olunca kabul etmedik bunun dışındakiler kabul edildi.
                   System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
               }else{
                   System.out.println("Şifre oluşturuldu!");
               }
           }else{
               System.out.println("İyi günler");
           }
        }else{
            System.out.println("Kullanıcı Adı ve şifre yanlış.");
        }
    }
}
