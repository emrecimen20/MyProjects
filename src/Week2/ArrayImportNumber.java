package Week2;
import java.util.Scanner;

public class ArrayImportNumber {
    public static void main(String[] args) {
        int n; boolean sayiBulundu;
        Scanner input=new Scanner(System.in);

        int[] arr={15,12,788,1,-1,-778,2,0};
        System.out.print("Girilen sayı :");
        n=input.nextInt();

        int enKucukYakinSayi = Integer.MIN_VALUE;
        int enBuyukYakinSayi = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i == n) {
                sayiBulundu = true;
                break;
                }
            if (i < n && i > enKucukYakinSayi) {
                enKucukYakinSayi = i;
            }
            if (i > n && i < enBuyukYakinSayi) {
                enBuyukYakinSayi = i;
            }
        }

        System.out.println("Girilen sayıdan küçük, en yakın sayı :" + enKucukYakinSayi);
        System.out.println("Girilen sayıdan büyük, en yakın sayı :" + enBuyukYakinSayi);
    }
}
