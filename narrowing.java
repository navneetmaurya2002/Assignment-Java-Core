// class narrowing
// {
// 	public static void main(String[] args) {
// 		double myDouble=12.2324;
// 		int myInt=(int) myDouble;
// 		short myShort=(short) myInt;
// 		byte myByte=(byte) myShort;
// 		System.out.println(myDouble);
// 		System.out.println(myInt);
// 		System.out.println(myShort);
// 		System.out.println(myByte);
// 	}
// }

class narrowing{

	public static void main(String[] args) 
{
	double num1=10.46,num2=7.89;
	int con1,con2;
	System.out.println(num1);
	con1=(int)num1;
	System.out.println(con1);
	System.out.println(num2);
	con2=(int)num2;
	System.out.println(con2);
}
}