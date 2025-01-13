import java.util.Scanner;
// Number of HandShakes
public class HandShakes{
    public static void main(String []args){
   
    // Create Scanner reference
    Scanner sc=new Scanner(System.in);
   
    // Number of students
    System.out.println("Enter number of students");
    int noOfStudents=sc.nextInt();
   
    // calculating number of handshakes
    int totalHandshakes=(noOfStudents*(noOfStudents-1))/2;
   
    // dispaly all details
    System.out.println("The total handshakes "+totalHandshakes);
   
    // closing Scanner
    sc.close();
   
    }
}
