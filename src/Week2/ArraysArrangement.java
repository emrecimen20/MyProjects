
/* Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
 Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/

package Week2;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysArrangement {
    public static void main(String[] args) {
        int n,number,startIndex=0; //Dizinin boyutunu n,eleman olarak girilecek sayıları number, yeni dizinin index numarasını startIndex olarak verdim.

        //Kullanıcın girdi yapabilmesi için scanner sınıfı kullandım.
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin Boyutu :");
        n=input.nextInt();

        int[] arr=new int[n]; //Kullanıcının gireceği sayıları bu oluşturduğum diziye attım.

        //Kullanıcıdan eleman girdisi aldım ve bu girilen sayıları arrayimize attım.
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı :");
            number=input.nextInt();
            arr[startIndex++]=number;
        }

        Arrays.sort(arr); //Oluşan array i küçükten büyüğe sıralatmak için sort u kullandım.

        //foreach döngüsüyle elemanlarımızı küçükten büyüğe sıralattım.
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
