package Week2;

import java.util.Scanner;

public class NumberLoop {

    public static void loop(int number) {
        System.out.print(number+ " ");
       if(number>0){
           number-=5;
           loop(number);

       } else if (number<=0) {
           System.out.print(number);
           number+=5;
           loop(number);
       }


    }

    public static void main(String[] args) {

        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        number=input.nextInt();

       loop(number);
    }
}
