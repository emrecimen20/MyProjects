package Week5.BookSorter;

import java.util.Comparator;

public class OrderPageNumComparator implements Comparator<Book> {

    //Sayfa sayısına göre sıralama yapmamı sağlayan method.
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPageNum(), o2.getPageNum());
    }
}
