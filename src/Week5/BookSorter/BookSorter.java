
/*Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
 Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.Bu sınıftan 5 tane nesne oluşturun ve nesneleri
 Set tipinde bir yapısında saklayınız.Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına
 göre sıralamasını sağlayınız.
 Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
 */
package Week5.BookSorter;
import java.util.Set;
import java.util.TreeSet;

public class BookSorter {
    public static void main(String[] args) {

        //Objelerimi tutmak için TreeSet kullandım ve alfabetik sıralama yaptırdığım OrderNameComparatorı yazdım.
        Set<Book> books=new TreeSet<>(new OrderNameComparator());

        //Kitap objelerimi ürettim.
        books.add(new Book("Lord of The Rings",600,"J.R.R Tolkein","1982"));
        books.add(new Book("Metro 2033",500,"Dmitry Glukhovsky","2002"));
        books.add(new Book("BioShock: Rapture",400,"John Shirley","2011"));
        books.add(new Book("Harry Potter and the Order of the Phoenix",550,"J.K. Rowling","2003"));
        books.add(new Book("The Witcher",235,"Andrzej Sapkowski","1990"));

        //foreach döngüsüyle kitap isimlerimi alfabetik sıralamaya göre yazdırdım.
        System.out.println("Alfabetik sıralama :");
        for(Book i:books){
            System.out.println(i.getBookName());
        }

        //Objelerimi tutmak için TreeSet kullandım ve sayfa sayısına göre sıralama yaptırdığım OderPageNumberComparator yazdım.
        TreeSet<Book> books2=new TreeSet<>(new OrderPageNumComparator());

        //Kitap objelerimi ürettim.
        books2.add(new Book("Lord of The Rings",600,"J.R.R Tolkein","1982"));
        books2.add(new Book("Metro 2033",500,"Dmitry Glukhovsky","2002"));
        books2.add(new Book("BioShock: Rapture",400,"John Shirley","2011"));
        books2.add(new Book("Harry Potter and the Order of the Phoenix",550,"J.K. Rowling","2003"));
        books2.add(new Book("The Witcher",235,"Andrzej Sapkowski","1990"));
        System.out.println("=====================================");

        //foreach döngüsüyle kitap isimlerimi sayfa sayısına  göre yazdırdım.
        System.out.println("Sayfa sayısına göre sıralama :");
        for(Book w: books2){
            System.out.println(w.getBookName());
        }
    }
}
