
//Write a class to store and print the details of a Book – id, title, author.
package encapsulation;

public class Book {

    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public static void main(String[] args) {
        Book bookData = new Book(1534,"White Tiger", "Aravind");

        System.out.println("Book ID "+ bookData.getId());
        System.out.println("Book title "+bookData.getTitle());
        System.out.println("Book Author "+bookData.getAuthor());
    }

    public void Showdetails(){
        System.out.println("ID "+id);
        System.out.println("Title : "+title);
        System.out.println("Author "+author);
    }
}
