
//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
package Week2;
public class ArrayFrequency {

    public static void main(String[] args) {
        int[] arr={10,20,20,10,10,20,5,20};

        // Tekrar sayılarını tutacak bir dizi oluşturdum.
        int[] tekrarSayileri=new int[101];

        // Dizideki her bir öğeyi ziyaret ediyoruz.
        for(int i:arr){
            tekrarSayileri[i]++;
        }


        // Sonuçları yazdırdık.
        for(int i=0;i<tekrarSayileri.length;i++){
            int tekrarSayisi=tekrarSayileri[i];
            if(tekrarSayisi>0){
                System.out.println(i + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
            }
        }
    }
}
