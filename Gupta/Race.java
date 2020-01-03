package Gupta;
import java.util.*;

public class Race {
 public static void main(String[] args)
		 {
		       
Thread Tortoise = new Tortoise();        
		 Tortoise.start();                        		     
		 for(int a=5;a<10;a++)
		            {

		              System.out.println("Distance covered by Rabit     = "+(a));   
		            }

		    System.out.println("!!Rabit IS GOING TO SLEEP!");  

		    try
		    {
		      Thread.sleep(8000);                           
		    }
		    catch(InterruptedException ie)
		    {
		   
		    }

		    System.out.println("!!!!Rabit AGAIN STARTED THE RACE !!!");         

		    for(int b=10;b<20;b++)
		      System.out.println("Distance covered by Rabit      =  "+(b));
		    System.out.println("!!!!Rabit HAS COMPLETED THE  RACE !!!");
		 

		  }
		}

		class Tortoise extends Thread
		{   
		    public void run()
		    {
		                for(int c=5;c<20;c++)
		                {
		                  System.out.println("Distance covered by TORTOISE =  "+c);    
		                }
		                System.out.println("!!!TORTOISE HAS WON THE RACE!!!"); 
		 
		  }
	}

