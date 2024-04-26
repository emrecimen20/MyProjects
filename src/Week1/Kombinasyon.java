/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
 N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
KOMBİNASYON FORMÜLÜ = C(n,r) = n! / (r! * (n-r)!)*/

package Week1;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        //Değişkenlerimizi girdik.
        int n,r,nFak=1,rFak=1,nrFak=1,kombinasyon;;

        Scanner input=new Scanner(System.in);

        System.out.print("n sayısını giriniz :");
        n=input.nextInt();

        System.out.print("r sayısını giriniz :");
        r=input.nextInt();

        //n ve r nin kombinasyonlarını ve n-r nin kombinasyonunu hesapladık ve formülü uygıladık.
        for(int i=1;i<=n;i++){
            nFak=nFak*i;
        }
        for(int i=1;i<=r;i++){
            rFak=rFak*i;
        }
        for(int i=1;i<=n-r;i++){
            nrFak=nrFak*i;
        }
        kombinasyon=nFak/(rFak*nrFak);
        System.out.println(kombinasyon);
    }
}
