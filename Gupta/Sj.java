package Gupta;


abstract class Sj {
abstract void run();

}
class Shu extends Sj
{
void run()
{
System.out.println("hello");
}
class Abs{
	

public void main(String[] args) {
	
	Sj b=new Shu();
	b.run();
}	 
}	
}
