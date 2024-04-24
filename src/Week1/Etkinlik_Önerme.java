package Week1;
import java.util.Scanner;

public class Etkinlik_Önerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz :");
        sicaklik=input.nextInt();
        if((sicaklik<5)){
            System.out.println("Kayak yapmayı öneriyorum!");
        } else if ( ((sicaklik>5) && (sicaklik<15))) {
            System.out.println("Sinemaya gitmeni öneriyorum!");
        } else if (((sicaklik>15) && (sicaklik<25))) {
            System.out.println("Pikniğe gitmeni öneriyorum!");
        }else {
            System.out.println("Yüzmeye gidebilirsin!");
        }
    }
}
