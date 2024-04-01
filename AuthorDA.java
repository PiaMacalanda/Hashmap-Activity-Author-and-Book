import java.util.*;
import java.io.*;

public class AuthorDA {

    /**
     * AuthorDA
     */
    private HashMap<String, Author> authorMap;
    public HashMap<String, Author> getAuthorMap;

    public AuthorDA(String name){
        HashMap <String, Author> AuthorMap = new HashMap<>();

        try {
            Scanner authorFile = new Scanner(new FileReader("/workspaces/HashMapActivity/Author.csv"));
            
            authorMap = new HashMap<>();

            while (authorFile.hasNext()) {
                String authorLineData = new String();
                authorLineData = authorFile.nextLine();

                String[] authorLineDataSpecific = new String [3];
                authorLineDataSpecific = authorLineData.split(",");

                if(name.equals(authorLineDataSpecific[0].trim())){

                    Author author = new Author();
                    author.setName(authorLineDataSpecific[1].trim());
                    
                }
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}