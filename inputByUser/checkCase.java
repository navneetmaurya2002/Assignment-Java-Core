package inputByUser;
import java.util.*;
public class checkCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character to check its Case:");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.print(ascii+": ");
        if(ascii>=65 && ascii<=90)
        {
            System.out.println("Entered character is UpperCase Character.");
        }
        else if(ascii>=97 && ascii<=122)
        {
            System.out.println("Entered character is LowerCase Character");
        }
    }
}
