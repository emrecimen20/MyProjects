package Week1;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        int math,physic,chemical,turkish,music;
Scanner input= new Scanner(System.in);
        System.out.print("Please enter your math grade :");
        math = input.nextInt();
        System.out.println(math);

        System.out.print("Please enter your physic grade :");
        physic = input.nextInt();
        System.out.println(physic);

        System.out.print("Please enter your chemical grade :");
        chemical = input.nextInt();
        System.out.println(chemical);

        System.out.print("Please enter your turkish grade :");
        turkish = input.nextInt();
        System.out.println(turkish);

        System.out.print("Please enter your music grade :");
        music = input.nextInt();
        System.out.println(music);

        float average = (math + physic + chemical + turkish + music )/5;

        System.out.println("Your GPA : " + average);

        String conc = (average>60) ? "Congratulations" : "Failed the Grade";
        System.out.print(conc);
    }
}
