/*Soru: 10 elemanlı tek boyutlu bir dizi içerisinde kullanıcıdan alınan indeksteki elemanı döndüren bir Java metodu yazın.
Eğer belirtilen indeks dizi boyutunun dışındaysa, metot bir hata mesajı döndürmelidir.Dizinin elmanlarını manuel olarak tanımlayın.*/

package Week5;
import java.util.Scanner;

public class TryCatch {

    //I set the number received from the user equal to that number element of the array and returned it.
    public static int turnStaff(int[] arr,int num){
      for(int i : arr){
          i=num;
      }
        return arr[num];
    }
    public static void main(String[] args) {
        //I created an array and asked which element of the array the user would like to see.
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin kaçıncı elemanını görmek istersiniz :");

        //I created a try catch method and caught the error that might occur and showed the error message.
        try {
            int num=input.nextInt();
            System.out.println(turnStaff(arr, num));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
