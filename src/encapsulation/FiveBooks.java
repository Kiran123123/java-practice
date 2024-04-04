//Write a program to store 5 books, print details of all books and show the details based on a given book id.

package encapsulation;

import java.util.ArrayList;

public class FiveBooks {

    public static ArrayList<Book> storeInfo() {
        ArrayList<Book> bookDetails = new ArrayList<Book>();
        bookDetails.add(new Book (1,"Cricket", "Mike"));
        bookDetails.add(new Book(2, "Football", "Peter"));
        bookDetails.add(new Book(3,"Tennis","Paul"));
        bookDetails.add(new Book(4,"Basketball", "Chris"));
        bookDetails.add(new Book(5,"Golf","Charlie"));
        return bookDetails;
    }

    public static void printBookDetails(ArrayList<Book> bookDetails, int id){
        boolean found = false;
        for(int i=0; i<bookDetails.size();i++){
           if(bookDetails.get(i) != null && bookDetails.get(i).getId()==id){
             found = true;
               System.out.println("ID found");
               bookDetails.get(i).Showdetails();
               break;
           }
        }
        if(!found){
            System.out.println("Given ID " + id +" is not found");
        }
    }

    public static void main(String[] args) {

        ArrayList<Book> bookData = storeInfo();
        printBookDetails(bookData,6);

    }
}
