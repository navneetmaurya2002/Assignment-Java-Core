class Employee
{
	int empid;
	String empname;
	String empadd;
	long salary;
	String city;
	String country;


	// constructor overloading and chaining

	public Employee(int empid,String empname,String empadd)
	{
		this.empid=empid;
		this.empname=empname;
		this.empadd=empadd;
	}

	public Employee(int empid,String empname,String empadd,long salary)
	{
		this(empid,empname,empadd);
		this.salary=salary;
	}
	public Employee(int empid,String empname,String empadd,long salary,String city,String country)
	{
		this(empid,empname,empadd,salary);
		this.city=city;
		this.country=country;
	}
public int getEmpid()
{
	return empid;
}
public String getEmpname()
{
	return empname;
}
public String getEmpadd()
{
	return empadd;
}
public double getSalary()
{
	return salary;
}
public String getCity()
{
	return city;
}
public String getCountry()
{
	return country;
}
}
public class ConstructorChaining{
public static void main(String[] args) {
	Employee emp1=new Employee(101,"Navneet","powai",30000,"mumbai","India");
System.out.println(emp1.getEmpid()+" "+emp1.getEmpname()+" "+emp1.getEmpadd()+" "+emp1.getSalary()+" "+emp1.getCity()+" "+emp1.getCountry());
}
}