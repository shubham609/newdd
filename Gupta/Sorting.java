package Gupta;

class Sorting
{



static void sorting (int arr[])


{
System.out.println("after sorting ");

int n=arr.length;
int temp=0;
for(int i=0;i<n;i++)
{
for(int j=1;j<n-i;j++)
{
if(arr[j-1]>arr[j])

{

temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}
}
}
}

public static void main (String args[])
{
int arr[]={21,2,34,12};
System.out.println("print array before sorting");

for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+"");
}
System.out.println();

sorting(arr);
System.out.println("array after sorting");
for(int i=0;i<=arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
