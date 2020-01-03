import java.io.*;
class Except{

	public static int add(int a, int b) throws IOException{
		return a+b;
	}

	public static void checkAge(int age) throws MyException{
		if(age>21){
			
		}else{
			throw new MyException();
		}
	}
	public static void main(String arg[]){
		System.out.println("Before Exception");
		try{
		for(int i = 0; i <= 10; i++){
	System.out.println();		System.out.println(i);
			if(i == 7){
				//throw new MyException();
			}
		}
		System.out.println(add(3,5));
		checkAge(20);
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Finally will always run");
		}

		System.out.println("After Exception");
	}
}