package books;

import java.io.Serializable;

public class Book implements Serializable{
    private String title;
    private String author;
    private int edition;
    private int ISBN = 11200;
    private BookType type;
    private boolean avail = true;
    
    
    public Book(String title, String author, int edition,BookType type){
        
        
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.type = type;    
    }
    
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author; 
    }
    
    public int getEdition(){
        return edition;
    }
    
    public int getISBN(){
        return ISBN;
    }
    
    public BookType getBookType(){
        return type;
    }
    
    public Boolean isAvail(){
        return avail;
    }
    
    
    
    public void setTitle(String name){
        this.title = title;
    }
    
    public void setAuthor(String name){
        author = name;
    }
    
    public void setEdition(int edition){
        this.edition = edition;
    }
    
    public void setBookType(BookType type){
        this.type = type;
    }
    
    public void setAvail(){
        if(avail==false)
        avail = true;
        else
        avail = false;
    }

}
