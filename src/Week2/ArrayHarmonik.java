
/*Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi */

package Week2;
public class ArrayHarmonik {
    public static void main(String[] args) {
        double sum=0,harmonikOrt;
        double[] arr={1.0,2.0,3.0,4.0,5.0};

        //Dizinin armonik serisini bulduk.
        for(double i=1.0;i<=arr.length;i++){
            sum+=1.0/i;
        }

        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi.Sounucumuzu bastırdım.
        System.out.println(harmonikOrt = arr.length / sum);
    }


}
