package by.tr.mod14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.*;


public class LibraryTesting {
    public static void main(String[] args) {
        Library lib = new Library();
        try{
        File file = new File("C:\\Users\\Aliaksandra_Bychkous\\IdeaProjects\\Task14\\src\\by\\tr\\mod14\\books.txt");
        Scanner f = new Scanner(file);
        while (f.hasNextLine()) {
            String line = f.nextLine();
            String[] bookParams = line.split(",");
         //  System.out.println(line);
            Book filebook = new Book (bookParams[0],bookParams[1],Integer.parseInt(bookParams[2]), Double.parseDouble(bookParams[3]));
            lib.addBook(filebook);
        }
            System.out.println(lib);
        }
      catch (FileNotFoundException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
        List booksbyAuthor = lib.findByAuthor("Harper Lee");
        Comparator cp =new  ComparatorbyPrice();
        booksbyAuthor.sort(cp);
        System.out.println("Sorting by Price for author Harper Lee");
        System.out.println(booksbyAuthor);

        Comparator cy =new  ComparatorbyYear();
        booksbyAuthor.sort(cy);
        System.out.println("Sorting by Year for author Harper Lee");
        System.out.println(booksbyAuthor);



    }
}

