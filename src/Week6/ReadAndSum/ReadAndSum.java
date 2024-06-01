/*Soru: Aşağıda verilen bir metin dosyasındaki (.txt) tüm sayıları okuyan ve bu sayıların toplamını döndüren ve ekrana
yazdıran bir Java programı yazınız. Dosyada sadece satır başına bir tam sayı bulunacaktır.
*/

package Week6.ReadAndSum;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndSum {
    public static void main(String[] args) {
        try {
            // FileReader ile okuma işlemi yapıyoruz ve BufferedReader ile bu işlemi hızlandırıyorum.
            FileReader readFile =new FileReader("C:\\Users\\PC\\IdeaProjects\\MyProjects\\src\\Week6\\ReadAndSum\\numbers.txt");
            BufferedReader buffReader = new BufferedReader(readFile);
            String line;
            int sum =0;

            while((line = buffReader.readLine()) != null){
                sum += Integer.parseInt(line); // Gelen String değerleri ınteger a çevirip toplama eşitliyoruz.

            }

            System.out.println(sum); // Toplamı burada yazdırıyoruz.

        } catch (Exception e) {
            System.out.println(e.getMessage()); // Hata mesajı.
        }
    }
}
