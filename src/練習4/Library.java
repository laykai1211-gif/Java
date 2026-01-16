package 練習4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void processBorrow(String isbn){
        boolean found=false;
    for(Book b :books){
        if (isbn.equals( b.getIsbn())){
            b.borrowBook();
            found=true;
            break;
        }
        }
    if(!found){
        System.out.println("沒有這本書:"+isbn);
    }
    }
    }

