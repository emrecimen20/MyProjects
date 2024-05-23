package Week5.BookSorter;

import java.util.Comparator;


public class OrderNameComparator implements Comparator<Book> {

    //Alfabetik sıralama yapmamı sağlayan method.
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}
