package Week1;
import java.util.Scanner;

public class TaxiMetre {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float range; double birKm=2.20; int begin=10;
        System.out.print("Gidilecek Mesafe :");
        range=input.nextFloat();
        double totalPrice= begin+(range*birKm);
        totalPrice = (totalPrice<=20) ? 20 : totalPrice;
        System.out.println(totalPrice);
    }
}
