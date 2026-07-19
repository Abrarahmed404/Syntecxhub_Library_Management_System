package library;


import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import dataManagement.*;
import students.Student;
import books.*;



public class Library implements Serializable{




//           * * * * Logic management * * * *


    private ArrayList<Student> students;
    private ArrayList<Book> books;
    private static Library l1;
    
     private Library(){
    
        students = new ArrayList<Student>();
        books = new ArrayList<Book>();
        
    }    
    
    
    
    public static Library getInstance(){
        if(l1 == null){
            l1 = new Library();
        }
        return l1;
        
    }
    
    
    public void addBooks(String title,String author,int edition,BookType type){        
        books.add(new Book(title,author,edition,type));
    }
    
    public void removeBooks(String title){
      for(int i = 0; i< books.size(); i++){
        if(books.get(i).getTitle().equals(title)){
            System.out.println("Book " + books.get(i).getTitle() + " is Removed.");
            books.remove(i);
            return;
        }
      }
          System.out.println("Book Not Found");
          
     
    }
    
    public void addStudents(String name,String fname,int age,String roll){
        students.add(new Student(name,fname,age,roll));
    }
    
    public void removeStudents(String name){
      for(int i = 0; i< students.size(); i++){
        if(students.get(i).getName().equals(name)){
            System.out.println("Student named " + students.get(i).getName() + " is Removed.");
            students.remove(i);
        }
        else{
          System.out.println("Book Not Found");
        }
      }
    }
    
    
     public void barrowBook(String name, String title){
    
        for(Student student : students){
          if(student.getName().equals(name)){
            
             for(Book book : books){
               if(book.getTitle().equals(title)){
               
                   if(book.isAvail() == true){
                      book.setAvail();
                      student.getbarrowedList().add(book);
                      System.out.println(student.getName() + " has barrowed book " + book.getTitle());
                      return;
                   }
                   else{
                     System.out.println("This Book is already barrowed");
                     return;
                   }
               }  

             }
             
                     System.out.println("Book is not Available in Library");
                     return;
          }
            
        }
                   System.out.println("Student is Not Registered");
     }
     
     public void returnBook(String name, String title){
     
         for(Student student : students){
          if(student.getName().equals(name)){

            ArrayList<Book> barrowedBooks = student.getbarrowedList();
             for(Book book : barrowedBooks){
               if(book.getTitle().equals(title)){
               
                  
                      book.setAvail();
                      System.out.println(student.getName() + " has barrowed book " + book.getTitle());
                      barrowedBooks.remove(book);
                      return;                   
               }

             }
             
                     System.out.println("Book is not in Student's record");
                     return;
          }
            
        }
                   System.out.println("Student is Not Registered");   
     
     }
     
     public void searchBook(String title){
     
        for(Book book :books){
          if(book.getTitle().equals(title)){
              System.out.println("\nTitle     :" + book.getTitle());
              System.out.println("Author    :" + book.getAuthor());
              System.out.println("Edition   :" + book.getEdition());
              System.out.println("ISBN      :" + book.getISBN());
              System.out.println("Type      :" + book.getBookType());
              System.out.println("Available :" + book.isAvail()+ "\n");
              return;
          }
          
        }
     
     }
    



    public void registeredStudents(){
    
      System.out.println("\n                 ----------------");
      System.out.println("         * * * * List of Students * * * *");
      System.out.println("                 ----------------\n\n");
      
      if(students.size() == 0){
      System.out.println("Students List is empty");
      return;
    }  
      System.out.println("There are " + students.size() + " Students available\n");
      
          for(int i = 0; i < students.size(); i++){
      System.out.println((1+i) + ". "+students.get(i).getName()+"\n");
        }
    }
    
    
    public void availableBooks(){
    
      System.out.println("\n                 -------------");
      System.out.println("         * * * * List of Books * * * *");
      System.out.println("                 -------------\n\n");
      
      if(books.size() == 0){
      System.out.println("Books List is empty");
      return;
    }  
      System.out.println("There are " + books.size() + " Books in Library\n");
      
          for(int i = 0; i < books.size(); i++){
             System.out.println((1+i) + ". "+books.get(i).getTitle()+"\n");
        }
    }
    
    
    public ArrayList getBooks(){
      return books;
    }
    
    public ArrayList getStudents(){
      return students;
    }
    
    public void saveData(){
      DataManagement.saveBooks(books);
      DataManagement.saveStudents(students);
    }
    
    public void loadData(){
        students = DataManagement.loadStudents();
        books = DataManagement.loadBooks();
    }
    
 }
