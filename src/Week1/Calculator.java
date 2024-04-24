package Week1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1,number2,select;    // İşlem için değişkenlerimizi oluşturduk.
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number :");   //Kullanıcıdan sayı girmesi ve işlem seçmesi için scanner kullanıldı.
        number1=input.nextInt();
        System.out.print("Enter the second number :");
        number2=input.nextInt();
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        select=input.nextInt();

        switch (select){      // Switch case yapısıyla kullanıcının seçimlerine göre işlem yaptık.
            case 1:
                System.out.println("Addition :" + (number1+number2));
                break;
            case 2:
                System.out.println("Subtraction :" + (number1-number2));
                break;
            case 3:
                System.out.println("Multiplication :" + (number1*number2));
                break;
            case 4:
                if(number2!=0){
                    System.out.println("Division :"+(number1/number2));
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Wrong action selection!!");
        }
    }
}
