package Gupta;

import java.io.*;

class C
{
public static void main (String args[])
{
try
{
FileOutputStream fos=new FileOutputStream("b.txt");
String s="hhaha";
byte b[]= s.getBytes();
fos.write(b);
fos.close();
}

catch(Exception e){
System.out.println(e);
}

}
}



