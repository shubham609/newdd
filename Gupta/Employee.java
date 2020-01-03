package Gupta;

public class Employee {
String name;
String id;
Address add;
public Employee(String id,String name,Address add)
{
	this.name=name;
	this.id=id;
	this.add=add;
	
	
			
}
public void show()
{
	System.out.println(id+" "+name);
System.out.println(add.city+" "+add.country+" "+add.state);

}
public static void main(String[] args) {
	Address ob=new Address("punkhh","punjab","india");
	Employee ob1=new Employee("306","shubham",ob);
	ob1.show();
}

}