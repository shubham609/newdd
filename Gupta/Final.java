package Gupta;

import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		 final int a=10,c;
		 System.out.println("what you want to enter");
		 
Scanner sc=new Scanner (System.in);
int b=sc.nextInt();
c=a+b;
b=c+a;
a=a+b;
System.out.println(c);
System.out.println(b);
System.out.println(a);


	}

}
