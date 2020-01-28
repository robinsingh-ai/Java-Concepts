package robin;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int n,i,s,c;
		int array[];
		Scanner sc = new Scanner(System.in);
		while(true)
		
		{
			System.out.println("Entre your choice");
			System.out.print("1.Linear search\n2.Exit");
			c=sc.nextInt();
			if(c==2)
			{System.out.println("Exited");
			break;
			}
			
			else
			{
			
		
switch(c)
{
case 1:
		System.out.println("Entre no of elements u want in array");
		n=sc.nextInt();
		array = new int[n];
		System.out.println("Entre your Numbers");
		
		for(i=0;i<n;i++)
		{
			 array[i] = sc.nextInt();
			 
		}
		
		for(i=0;i<n;i++)
		{
			
			System.out.println(array[i]);
		}
		
		System.out.println("Entre your search key");
		s=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(array[i]==s)
			{
				System.out.println("Search key "+s+" found at index"+(i+1));
				
			}
		}
			
		
				
				System.out.println("Search key not found");
				
		
        break;
             
default:
        System.out.println("Invalid Option"); 
        break;
        
	}	
}
		
		
		
		
		
		
		

	}
}
}

