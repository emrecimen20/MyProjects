package Week5.BookSorter;


public class Book{
    private String bookName;
    private Integer pageNum;
    private String wtriterName;
    private String relaseDate;

    public Book(String book, Integer pageNum, String wtriterName, String relaseDate) {
        this.bookName = book;
        this.pageNum = pageNum;
        this.wtriterName = wtriterName;
        this.relaseDate = relaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getWtriterName() {
        return wtriterName;
    }

    public void setWtriterName(String wtriterName) {
        this.wtriterName = wtriterName;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }


}
