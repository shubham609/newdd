package Gupta;

import java.util.Scanner;

public class Collg {
public static void main(String[] args) {
int x,n=123,sum=0,y ,sum1=0,v;

while (n>0)
{
	x=n%10;
	sum=sum+x;
	n=n/10;
	
}
v=sum;
while(v>0)
{
	y=v%10;
	sum1=sum1+y;
	v=y/10;
}
System.out.println(sum);

}
}
