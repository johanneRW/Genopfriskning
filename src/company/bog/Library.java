package company.bog;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList();

    public void addBookToLibrary(Book book) {
        library.add(book);
    }


    public boolean isAlreadyInTheLibrary(Book book) {
        boolean isInTheLibrary = false;
        String searchIsbn = book.getIsbnNumber();
        for (int i = 0; i < library.size(); i++) {
            Book currentBook = library.get(i);
            String isbn = currentBook.getIsbnNumber();

            if (isbn.equals(searchIsbn)) {
                isInTheLibrary = true;
            }
        }

        return isInTheLibrary;
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("123456789", "title1", 1999);
        Book book2 = new Book("234567890", "title2", 2022);
        Book book3 = new Book("345678901", "title3", 2022);
        Book book4 = new Book("456789012", "title4", 2011);

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);

        System.out.println(library.isAlreadyInTheLibrary(book3));
        System.out.println(library.isAlreadyInTheLibrary(book4));

    }

}
