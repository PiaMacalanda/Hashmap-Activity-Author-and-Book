import java.util.HashMap;

public class BookReport {

    public static void main(String[] args) {

        BookDA bookDA = new BookDA();
        AuthorDA authorDA = new AuthorDA();

        bookDA.loadData();
        authorDA.loadData();

        HashMap<String, Book> bookMap = bookDA.getBookMap();

        for (Book book : bookMap.values()) {
            System.out.println(book.getIsbn() + " " + book.getTitle());
            
            Author author = book.getAuthor();
            
            if (author != null) {
                System.out.println("\t" + author.getName() + " - " + author.getBio() + "\n");
            } 
            
            else {
                System.out.println("\tAuthor information not available");
            }
        }
    }
}