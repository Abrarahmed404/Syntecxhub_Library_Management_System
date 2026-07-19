  package dataManagement;
  
  import java.io.*;
  import students.Student;
  import books.*;
  import java.util.ArrayList;
  
  public class DataManagement{
  
                                                        //           * * * * Data management * * * *
      
  
  
          //files where data will be stored 
      private static final String students_file = "student.txt";
      private static final String books_file = "books.txt";
      
      
      public static void saveStudents(ArrayList<Student> students){
          try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/abrar-ahmed/LibraryManagementSystem/dataManagement/student.txt"))){
                    
                oos.writeObject(students);              
                          
          }         
          catch(IOException e){
              System.out.println("Exception caught: " + e);
              
          }
                   
      }
      

      public static ArrayList<Student> loadStudents(){
      
          File f = new File("/home/abrar-ahmed/LibraryManagementSystem/dataManagement/student.txt");
          if(!f.exists()){
            
            return new ArrayList<Student>();
          }
          
      
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            
          return (ArrayList<Student>) ois.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Exception caught: " + e);    
            return new ArrayList<Student>();
        }


      }     
      
      
       public static void saveBooks(ArrayList<Book> books){
       
          
         try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/abrar-ahmed/LibraryManagementSystem/dataManagement/books.txt"))){
                    
                oos.writeObject(books);              
                          
          }         
          catch(IOException e){
              System.out.println("Exception caught: " + e);
              
          }
       }
       
       public static ArrayList<Book> loadBooks(){
          File f = new File("/home/abrar-ahmed/LibraryManagementSystem/dataManagement/books.txt");
            if(!f.exists()){
              return new ArrayList<Book>();
            }
            
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            
          return (ArrayList<Book>) ois.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Exception caught: " + e);    
            return new ArrayList<Book>();
        }
       }
       
     
      

}
