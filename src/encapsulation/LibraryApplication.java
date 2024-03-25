package encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private int id;
    String title; // Changed access modifier to default (package-private)
    String author; // Changed access modifier to default (package-private)

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(int id, String title, String author) {
        Book book = new Book(id, title, author);
        books.add(book);
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public void updateBook(int id, String title, String author) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == id) {
                book.title = title;
                book.author = author;
                break;
            }
        }
    }

    public void showBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Book ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found with ID: " + id);
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class LibraryApplication {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some initial books
        library.addBook(1, "The Catcher in the Rye", "J.D. Salinger");
        library.addBook(2, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(3, "1984", "George Orwell");

        // Menu loop
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Show Book");
            System.out.println("5. List All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();  // Read user input

            switch (choice) {
                case 1:
                    library.addBook(4, "The Great Gatsby", "F. Scott Fitzgerald");
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    library.removeBook(2);
                    System.out.println("Book removed successfully.");
                    break;
                case 3:
                    library.updateBook(1, "The Catcher in the Rye (Updated)", "J.D. Salinger (Updated)");
                    System.out.println("Book updated successfully.");
                    break;
                case 4:
                    library.showBook(1);
                    break;
                case 5:
                    library.listAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        } while (choice != 6);

        // Close the scanner
        scanner.close();
    }
}
