package Gupta;
import java.io.*;

public class Fileoutput {

	public static void main(String[] args) {
		
		try{
			FileOutputStream fos=new FileOutputStream("test.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos);		
String s= "hahhah";
	byte b[]= s.getBytes();		
	fos.write(b);
	fos.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
