import java.util.HashMap;

public class BookReport{

    public static void main(String[] args) {
        
        BookDA bookDA = new BookDA();
        AuthorDA authorDA = new AuthorDA();

        bookDA.loadData();
        authorDA.loadData();

        HashMap<String, Book> bookMap = bookDA.getBookMap();
        HashMap<String, Author> authorMap = authorDA.getAuthorMap();
    
        for (Book book : bookMap.values()) {
           System.out.println(book.getIsbn() + " " +book.getTitle());
           Author author = authorMap.get(book.getAuthorName());
           System.out.println("\t" + author.getName() + " - " + author.getBio());
        }
    }
}
