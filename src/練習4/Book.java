package 練習4;

public class Book {
    private String bookName;
    private  String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String bookName, String author, String isbn) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
//        if ()
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return "書名: " + bookName + " | ISBN: " + isbn + " | 狀態: " + (isBorrowed ? "已借出" : "在庫");
    }

    public Book() {
    }
    public void borrowBook(){
    if (this.isBorrowed){
        System.out.println("❌ 錯誤：書名「" + bookName + "」目前已被借出。");
    }else {
        this.isBorrowed=true;
        System.out.println("✅ 成功：您已借閱「" + bookName + "」。");
    }
    }
    public void returnBook(){
        if(!this.isBorrowed){
            System.out.println("⚠️ 提示：這本書「" + bookName + "」本來就沒被借出，不需要歸還。");
        }else {
            this.isBorrowed=false;
            System.out.println("✅ 成功：您已歸還「" + bookName + "」。");
        }

    }
}
