package Week6.NotePadApp;

import java.io.*;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {

        // notlar.txt dosyasını okuma işlemi.
        try {
            FileReader fileReader = new FileReader("C:\\Users\\PC\\IdeaProjects\\MyProjects\\src\\Week6\\NotePadApp\\notlar.txt");
            BufferedReader buffReader =new BufferedReader(fileReader);
            String readedText;
            while ((readedText = buffReader.readLine()) != null) {
                System.out.println(readedText);
            }
            buffReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Kullanıcıdan metin girmesini istiyorum.
        Scanner input =new Scanner(System.in);
        System.out.println("Metin giriniz :");
        String metin = input.nextLine();

        // notlar.txt dosyasının içine metin yazma işlemi.
        try {
            FileWriter writeFile =new FileWriter("C:\\Users\\PC\\IdeaProjects\\MyProjects\\src\\Week6\\NotePadApp\\notlar.txt",true);
            PrintWriter printWriter = new PrintWriter(writeFile);

            printWriter.println(metin); // Kullanıcıdan alınan metni dosyaya yazıyorum.
            printWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
