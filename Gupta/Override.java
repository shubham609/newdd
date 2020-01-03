package Gupta;


	class Sub
	{
	void run(int a, int b )
	{
	System.out.println("hahaha");
	}
	}
	class Sub1 extends Sub
	{
	void run(int a,int b)
	{
		super.run(10,20);
	System.out.println("chal pra ho");
	}
	}
	class Override
	{
	public static void main(String args[])
	{
	Sub1 ob=new Sub1();

	ob.run(10,20);
	ob.run(10,20);
	}
	}

