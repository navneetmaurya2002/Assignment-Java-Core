package loops;

/*
       *
      **
     ***
    ****
   *****
  ******
*/
public class pattern5 {
    public static void main(String[] args) {
       int rows=7;
       for(int i=0;i<=rows;i++)
       {
           for(int j=0;j<=rows-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=0;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
    }
    
}
