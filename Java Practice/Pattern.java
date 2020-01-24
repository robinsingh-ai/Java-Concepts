package robin;
//Simple pattern using break and continue statement
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int row,column;
		stop:
		{
		  nextRow:
			  for( row=1;row<=8;row++)
	                  
	{
		if(row==6)
			break stop;
		System.out.println();
		for( column=1;column<=15;column++)
		{
			if( column>row)
			  continue nextRow;
			System.out.print("*");
			
		}
	}
	              
			 
		
		}
		 
		    
		    	
		 
		}
		

	}


