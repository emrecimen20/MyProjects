package Week1;
import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Kenar Uzunluğunu Giriniz :");
        a=input.nextInt();
        System.out.print("İkinci Kenar Uzunluğunu Giriniz :");
        b=input.nextInt();
        System.out.print("Üçüncü Kenar Uzunluğunu Giriniz :");
        c=input.nextInt();
        float u=(a+b+c)/2;
        int ucgenCevre=(a+b+c);
        System.out.print("Üçgenin Çevresi :");
        System.out.println(ucgenCevre);
        float ucgenAlan=u*(u-a)*(u-b)*(u-c);
        System.out.print("Üçgenin Alanı :");
        System.out.println(ucgenAlan);
    }
}
