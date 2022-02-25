class demo{
	int i;
	float f;
	int result;
	public demo()
	{
		i=5;
		f=5.5f;
		System.out.println(result=i+(int)f);
	}
	public demo(float i)
	{
		System.out.println("Hello this is parameterized constructor."+i);
	}
	
}

public class constructor{
	public static void main(String args[])
	{
	demo d=new demo();
		}
}

/*
constructor is an member method
same name as class name
doesn't return any thing
it is used to allocate memory 
it is called automatically after creating an object
constructor can be overloaded
*/