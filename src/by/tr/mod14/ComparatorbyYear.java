package by.tr.mod14;

import java.util.Comparator;

public class ComparatorbyYear implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            if(o1.getPublishedYear() < o2.getPublishedYear()){
                return -1;
            }
            else if(o1.getPublishedYear() == o2.getPublishedYear()){
                return 0;
            }
            else return 1;
        }
    }

