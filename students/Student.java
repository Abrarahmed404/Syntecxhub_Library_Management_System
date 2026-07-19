
package students;

import java.io.Serializable;
import java.util.ArrayList;
import books.*;


      //we cannpot simplpy copy paste raw RAM memory directly into a hard drive
      //becaus a hard drive only understands a flat and sequential stream 
      //thats why we are implementing serializable 
      
public class Student implements Serializable{

      //giving objects a serial Number
    private static final long UID= 1L;  

    private String name;
    private String fname;
    private int age;
    private String roll;
    private ArrayList<Book> barrowedBooks;
    
    public Student(String name,String fname,int age,String roll){
    
        this.name = name;
        this.fname = fname;
        this.age = age;
        this.roll = roll;
        barrowedBooks = new ArrayList<Book>();
    }
    
    
    
    public String getName(){
        return name;
    }
    
    public String getFname(){
        return fname;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getRoll(){
        return roll;
    }
        
    public ArrayList<Book> getbarrowedList(){
        return barrowedBooks;
    }
    
    
    
    public void setname(String name){
        this.name = name;
    }
    
    public void setFname(String name){
        fname = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setRoll(String roll){
        this.roll = roll;
    }
    
    
    
    
    

}
