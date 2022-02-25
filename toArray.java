import java.util.*;
// public class toArray{
// 	public static void main(String[] args) {
//ArrayList<Integer> ArrLis=new ArrayList<Integer>();

// 		ArrLis.add(32);
// 		ArrLis.add(67);
// 		ArrLis.add(85);
// 		System.out.println("ArrayList :"+ArrLis);
// 		Object[] arr=ArrLis.toArray();
// 		System.out.println("Elements of ArrayList as Array:"+Arrays.toString(arr));

// 	}
// }


public class toArray{
	public static void main(String[] args) {
		ArrayList<String> color_list=new ArrayList<String>();
		color_list.add("Red");
		color_list.add("Green");
		color_list.add("Blue");
		System.out.println("Size of List:"+color_list.size());
		for(String value:color_list)
		{
			System.out.println("Color ="+value);
		}
		Object[] obj=color_list.toArray();
		System.out.println("Print Elements from first to last :");
		for(Object value:obj)
		{
			System.out.println("Color:"+value);
		}
	}
}