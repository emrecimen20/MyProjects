package Week1;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double pi=3.14; int r,merkezAci;
        Scanner input= new Scanner(System.in);
        System.out.print("Yarıçap Giriniz :");
        r=input.nextInt();
        System.out.print("Merkez Açı Giriniz :");
        merkezAci=input.nextInt();
        double alan=(pi*(r*r)*merkezAci)/360;
        System.out.print("Üçgenin Alanı :" +alan);
    }
}
