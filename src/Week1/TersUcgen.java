/*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
ÖRNEK:
Basamak Sayısı : 10
        *******************
        *****************
        ***************
        *************
        ***********
        *********
        *******
        *****
        ***
         *          */
package Week1;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        //Kullanıcının gireceği değişkeni tanımladım.
        int basSayisi;
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayısı :");
        basSayisi=input.nextInt();

        /*for döngüsü kullanarak ilk aşamada girilen sayı kadar satır olmasını sağladım ve
        yıldızlar arasındaki örüntüyü de i*2-1 şeklinde formülize ettim.*/

        for(int i=basSayisi;i>=1;i--){
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
