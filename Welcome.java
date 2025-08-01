import java.util.Scanner;

public class Welcome{
 public static void main(String []arg){
           Scanner name = new Scanner(System.in);
 
           System.out.println("Enter the first name:");
           String firstname = name.nextLine();

           System.out.println("Enter the last name:");
           String lastname = name.nextLine();

           System.out.println("Welcome to the Second Year" +firstname+ " " +lastname);
           

}

}
