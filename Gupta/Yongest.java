package Gupta;
import java.awt.*;
import java.util.*;
public class Yongest {

	public static void main(String[] args) {
		int a;
		System.out.println("check mmen is yonger or not");
		System.out.println("enter the man age");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a<=18){
			System.out.println("the man is yongest");
			
		}else
		{
			System.out.println("the man is older");
		}
	}
}
