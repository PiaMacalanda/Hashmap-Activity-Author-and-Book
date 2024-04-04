import java.io.*;
import java.util.*;

public class BookDA {

    private HashMap<String, Book> bookMap;

    public HashMap<String, Book> getBookMap() {
        return bookMap;
    }

    public BookDA(){
        bookMap = new HashMap<>();
    }

    public void loadData() {

        try{

            try (Scanner bookInput = new Scanner(new FileReader("Book.csv"))) {
                while(bookInput.hasNextLine()){

                String[] bookSplitData = bookInput.nextLine().split(",");

                Book book = new Book();
                book.setIsbn(bookSplitData[0].trim());
                book.setTitle(bookSplitData[1].trim());
                book.setAuthorName(bookSplitData[2].trim());

                setAuthor(book);
                bookMap.put(book.getIsbn(), book);

            }
            }
        }

        catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    private void setAuthor(Book book){
        AuthorDA authorDA = new AuthorDA();
        authorDA.loadData();
        HashMap<String, Author> authorMap = authorDA.getAuthorMap();

        Author author = authorMap.get(book.getAuthorName());
        if(author != null){
            book.setAuthor(author);
        }
    }
}

