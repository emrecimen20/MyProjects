/*Soru: Kullanıcı tarafından girilen bir metinde en çok geçen kelimeyi bulup ekrana yazdıran bir Java projesi yazınız.
 */
package Week5.MostWords;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Metin giriniz :");
        String text= input.nextLine();

        // Metni boşluklardan böldüm ve tek tek kelimeleri elde ettim.
        String[] arr=text.split(" ");

        //Kelimeleri tutacak HashMap i oluşturdum.
        HashMap<String,Integer> words=new HashMap<>();

        for(String w : arr){
       if(words.containsKey(w)){
           // Eğer kelime zaten HashMap'te varsa, count'u bir artırdım.
           words.put(w,words.get(w)+1);
       }else {
           // Eğer kelime HashMap'te yoksa, count'u 1 olarak belirledim.
           words.put(w,1);
            }
        }

        // En çok tekrar eden kelimeyi bulmak için değişkenler atadım.
        String MostRepeatedWord=null;
        int maxNumber = 0;

        // HashMap'i döngüyle dolaşarak en çok tekrar eden kelimeyi buldum.
        for(String word : words.keySet()){
            int counting = words.get(word);
            if(counting>maxNumber){
                MostRepeatedWord=word;
                maxNumber=counting;
            }
        }

        // En çok tekrar eden kelimeyi yazdırdım.
        if(MostRepeatedWord!=null){
            System.out.println("En çok tekrar eden kelime ==> " + MostRepeatedWord);
        }

    }
}
