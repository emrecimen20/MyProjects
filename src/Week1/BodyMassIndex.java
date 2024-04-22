package Week1;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double boy,kg;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg=input.nextDouble();
        double vki=kg/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz :" +vki);
    }
}
