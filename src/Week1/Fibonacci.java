/*Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.*/

package Week1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin Eleman Sayısını Giriniz :");
        n=input.nextInt();

        /*Fibonacci serisinin ilk iki elemanı genellikle 0 ve 1 olarak alınır. Ardından, serinin diğer elemanları bu ilk
         iki elemanın toplamı olarak bulunur.Java programında, kullanıcıdan Fibonacci serisinin eleman sayısını alırız.
         Ardından, bir döngü kullanarak Fibonacci serisini oluştururuz.
         Her adımda, önceki iki sayının toplamını alarak bir sonraki sayıyı hesaplarız ve bu sayıları ekrana yazdırırız.
         */
        for(int i=0;i<n;i++){
            System.out.print(a+ " ");
            int toplam=a+b;
            a=b;
            b=toplam;
        }
    }
}
