package Gupta;

public class abx {

	
	public int totalHillPatern(int input1, int input2, int input3){
		int row=1,num=input2,sum=0;
		 int i = 0;
		while(input1-- >0){
		 i=0;
		  while(i++ < row){
		  sum+=num;
		  num+=input3;
		  row++;
		  }
		 return sum;
		}
		return i;

	}
}