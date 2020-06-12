package by.tr.mod14;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library = new ArrayList<Book>();
    public Library(){}
    public void addBook(Book book){
        library.add(book);
    }
    public boolean deleteBook(Book book){
        return library.remove(book);
    }
    public boolean deleteBookByTitle(String title){
        for (Book book :library){
            if (book.getTitle().toLowerCase().equals(title.toLowerCase()))
                library.remove(book);
                return true;
        }
        return false;
    }
    public List<Book> findByAuthor (String author){
        List<Book> authorspecific = new ArrayList<Book>();
        for (Book book :library){
            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
                authorspecific.add(book);
            }
        }
        return authorspecific;
    }


    @Override
    public String toString() {
        return "by.tr.mod14.Library{" +
                "library=" + library +
                '}';
    }
}
