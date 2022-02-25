
package ifelse;
import java.util.*;

public class discount {
    public static Scanner sc=new Scanner(System.in);
    static int  quant,discount,cost;
    public int accept()
    {
        
        System.out.print("Enter the quantity of items:");
        quant=sc.nextInt();
        return quant;
    }
    public int cost()
    {
        System.out.print("The total cost without discount is:");
        cost=quant*100;
        return cost;
    }
    public double discount()
    {
        System.out.print("The total discount on purchase is :");
        if(quant >10)
        {
            
            discount=(int)(cost*0.1);
        }
        else{
            discount=0;
        }
        return discount;
    }
    public static void main(String[] args) {
        discount obj=new discount();
        System.out.println(obj.accept());
        System.out.println(obj.cost());
        System.out.println(obj.discount());
        System.out.println("The total Paying amount is :"+(cost-discount));
    }
    
}
