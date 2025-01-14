import java.util.Scanner;
public class StringOutOFBoundExceptionEx{
    public static void handelStringOutOfBoundsException(){
        Scanner input=new Scanner(System.in);
        String text=input.next();
        int index=input.nextInt();
        try{
            char ch=text.charAt(index);
            System.out.println(ch);

        }catch(StringIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
        }
    }
    public static  void main(String[] args) {
        
        handelStringOutOfBoundsException();
    }
}