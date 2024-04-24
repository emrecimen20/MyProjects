package Week1;
import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik=input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce=input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya=input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik=input.nextInt();


       if((mat>100) || (mat<0)){
           double average=(fizik+turkce+kimya+muzik)/4;
           if (average>55){
               System.out.println("Ortalamanız :" + average);
               System.out.println("Tebrikler dersi geçtiniz");
           }else{
               System.out.println("Ortalamanız :" + average);
               System.out.println("Sınıfta kaldınız");
           }
       } else if ((fizik>100) || (fizik<0)) {
           double average=(mat+turkce+kimya+muzik)/4;
           if (average>55){
               System.out.println("Ortalamanız :" + average);
               System.out.println("Tebrikler dersi geçtiniz");
           }else{
               System.out.println("Ortalamanız :" + average);
               System.out.println("Sınıfta kaldınız");
           }
       } else if ((turkce>100) || (turkce<0)) {
           double average=(fizik+mat+kimya+muzik)/4;
           if (average>55){
               System.out.println("Ortalamanız :" + average);
               System.out.println("Tebrikler dersi geçtiniz");
           }else{
               System.out.println("Ortalamanız :" + average);
               System.out.println("Sınıfta kaldınız");
           }
       } else if ((kimya>100) || (kimya<0)) {
           double average=(fizik+mat+turkce+muzik)/4;
           if (average>55){
               System.out.println("Ortalamanız :" + average);
               System.out.println("Tebrikler dersi geçtiniz");
           }else{
               System.out.println("Ortalamanız :" + average);
               System.out.println("Sınıfta kaldınız");
           }
       } else if ((muzik>100) || (muzik<0)) {
           double average=(fizik+turkce+kimya+mat)/4;
           if (average>55){
               System.out.println("Ortalamanız :" + average);
               System.out.println("Tebrikler dersi geçtiniz");
           }else{
               System.out.println("Ortalamanız :" + average);
               System.out.println("Sınıfta kaldınız");
           }
       }else{
           double average=(fizik+turkce+kimya+mat+fizik)/5;
           if (average>55){
               System.out.println("Ortalamanız :" + average);
               System.out.println("Tebrikler dersi geçtiniz");
           }else{
               System.out.println("Ortalamanız :" + average);
               System.out.println("Sınıfta kaldınız");
           }
       }
    }
}
