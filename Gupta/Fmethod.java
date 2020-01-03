package Gupta;

import java.util.Scanner;

public class Fmethod {

	int a,b,c;
	final int sum()
	{
		System.out.println("enter two no");
		Scanner sc=new Scanner(System.in);
		 b=sc.nextInt();
		 a=sc.nextInt();
		

		c=a+b;
		
		System.out.println(c);
		return 1;
	}
}
	
		public class N extends Fmethod
		{
		int syso() {
			System.out.println("b");
			// TODO Auto-generated method stub
return 0;
		}
		public void main (String[] args) {
			Fmethod  a=new Fmethod();
			a.sum();
			 		
		}
		
		}


