package Gupta;

import java.util.Scanner;

class Second {

	int a,b,c;
	public int sum()
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
	
	 class Third extends Second
		{
		int syso() {
			System.out.println("b");
			// TODO Auto-generated method stub
         return 0;
		}
		}
		public class First{
			
		public static void main (String[] args) {
			Second  a=new Second();
			a.sum();
			
			 		
		}
		
		}


