import library.Library;
import dataManagement.DataManagement;
import java.util.Scanner;
import books.*;

        
    public class Main{
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          Library l1 = Library.getInstance();
    
          l1.loadData();
    
    
            System.out.println("                     -------------------");      
            System.out.println("             * * * * Welcome to Library * * * *");
            System.out.println("                     ------------------");      
            System.out.println(); 
      
      do{
            System.out.println("1. Student.     2. Adminstration\n");
            String mode = sc.nextLine();
            
                 
            
        if(mode.equals("2")){
            System.out.println("Enter Your Password.");
                  String password = sc.nextLine();
                  
               if(!password.equals("404Admin")){
                  System.out.println("Your Password is wrong.");                  
                  System.out.println("Access denied Try Again or Enter as Student\n");
                  continue;
               }
          do{
    
      
      
      
      
      
            System.out.println("\n1. Add Students.             2. Add Books.\n");
            System.out.println("3. Barrow Books.             4. Return Book.\n");
            System.out.println("5. Search Book.              6. Available Books.\n");
            System.out.println("7. Registered Students.      8. Remove Student\n");
            System.out.println("9. Remove Book.              10. Exit\n");
            System.out.println("Choose one option");
      
      
            String option=sc.nextLine();

              switch(option){
        
                case "1":
                  System.out.println("Enter Your Name");
                  String name = sc.nextLine();
            
                  System.out.println("Enter Your Father`s Name");
                  String fname = sc.nextLine();
            
                  System.out.println("Enter Your age");
                  int age = sc.nextInt();
            
                  sc.nextLine();
                  System.out.println("Enter Your Roll No.");
                  String roll = sc.nextLine();
            
                  l1.addStudents(name,fname,age,roll);
            
                  break;
            
                case "2":
                  System.out.println("Enter Title");
                  String title = sc.nextLine();
            
                  System.out.println("Enter Author Name");
                  String author = sc.nextLine();
            
                  System.out.println("Enter edition of Book");
                  int edition = sc.nextInt();
            
                  sc.nextLine();
                  System.out.println("Choose Book Type");
                  System.out.println("\n1. Novel.   2. Science.   3.Philosophy.   4.Computer.  5.Mathematics   6.Medical\n");
            
                  String optn = sc.nextLine();
              
                      switch(optn){
              
                        case "1":
                          l1.addBooks(title,author,edition,BookType.Novel);
                          break;
                        case "2":
                          l1.addBooks(title,author,edition,BookType.Science);
                          break;
                        case "3":
                          l1.addBooks(title,author,edition,BookType.Philosophy);
                          break;
                        case "4":
                          l1.addBooks(title,author,edition,BookType.Computer);
                          break;
                        case "5":
                          l1.addBooks(title,author,edition,BookType.Mathematics);
                          break;
                        case "6":
                          l1.addBooks(title,author,edition,BookType.Medical);
                          break;
                        default :
                          System.out.println("Please choose from given options");
              
                      }
            
            
            
                  break;
            
                case "3": 
                  System.out.println("Enter your name");
                  String name1 = sc.nextLine();
            
                  System.out.println("Enter Book Title");
                  String title1 = sc.nextLine();
            
                  l1.barrowBook(name1,title1);
                  break;
                  
                case "4":
                  System.out.println("Enter Student's name");
                  String sName = sc.nextLine();
            
                  System.out.println("Enter Book Title");
                  String bTitle = sc.nextLine();
              
                  l1.returnBook(sName,bTitle);                
                  break;
                  
                case "5":
                  System.out.println("Enter Book Title");
                  String title3 = sc.nextLine();
            
                  l1.searchBook(title3);
                  break;
                  
                case "6":
                  l1.availableBooks();
                  break;
                  
                case "7":                
                  l1.registeredStudents();          
                  break;
            
                case "8":
                  System.out.println("Enter the name of Student");
                  String name2 = sc.nextLine();
                  l1.removeStudents(name2);  
                  break;
                case "9":
                  sc.nextLine();
                  System.out.println("Enter the Title of Book");
                  String title2 = sc.nextLine();
                  l1.removeBooks(title2);         
                  break;
                case "10":
                
                  l1.saveData();
          
                  System.out.println("\n               -----");
                  System.out.println("        * * * * End * * * *");
                  System.out.println("               -----");
                  return;
            
                default :
                  System.out.println("Your input is not correct");
            
              }
        
          }while(true);
        
        }        
        else if(mode.equals("1")){
          
                do{
            
                    System.out.println("\n 1. Search Book.              2. Available Books.\n");
                    System.out.println(" 3. Exit.\n");
                    System.out.println("Choose any option.\n");
                    
                    String opt = sc.nextLine();
            
                        switch(opt){
                          case "1":
                            System.out.println("Enter Book Title");
                            String title3 = sc.nextLine();
            
                            l1.searchBook(title3);
                            break;
                            
                          case "2":
                            l1.availableBooks();
                            break;
                          case "3":
                            return;
                          default :
                            System.out.println("Your input is not correct");
                        }
                 }while(true);
                 
                
              
        }
        else{          
                System.out.println("Your input is not correct");
        }
            
      }while(true);       
    
    }

}
