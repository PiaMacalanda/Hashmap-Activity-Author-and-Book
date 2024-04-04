import java.io.*;
import java.util.*;

public class AuthorDA {

    private HashMap<String, Author> authorMap;

    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }

    public AuthorDA() {
        authorMap = new HashMap<>();
    }

    public void loadData() {
        
        try {
            try (Scanner authorInput = new Scanner(new FileReader("Author.csv"))) {
                // Skip the header row
                if (authorInput.hasNextLine()) {
                    authorInput.nextLine();
                }

                while (authorInput.hasNextLine()) {
                    String[] authorSplitData = authorInput.nextLine().split(",");

                    Author author = new Author();
                    author.setName(authorSplitData[0].trim());
                    author.setBio(authorSplitData[1].trim());

                    authorMap.put(author.getName(), author);
                }
            }
        } 
        
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
