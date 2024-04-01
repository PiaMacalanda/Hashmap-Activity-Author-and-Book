public class Book {

    private String isbn;
    private String title;
    private String authorName;


    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setName (String authorName){
        this.authorName = authorName;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthorName(){
        return authorName;
    }

}