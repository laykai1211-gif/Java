package 練習4;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Library L = new Library();
        Book b = new Book("山","黑貴","123");
        Book c = new Book("水","黑貴","123");
//        List<Book> books=new ArrayList<>();
//        books.add(new Book("山","黑貴","124"));
//        books.add(new Book("水","黑貴","124"));
        b.borrowBook();
        b.returnBook();
        L.addBook(b);
        L.addBook(c);

        L.processBorrow("123");
        L.processBorrow("123");


    }
}
