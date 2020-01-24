package robin;
import java.util.Scanner;
public class MenuDrivenProgram {

	public static void main(String[] args) {
	
		int x,y,choice,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a very simple menu driven program");
		while(true)
		{
			System.out.println("Entre your Choice");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5Exit");
			choice=sc.nextInt();
			
			if(choice==5)
			{ 
				 break;
			}
			else
			{
				switch(choice)
				{
				case 1:
					x=sc.nextInt();
					y=sc.nextInt();
					s=x+y;
					System.out.println("Addition of the two numbers is "+s);
					break;
					
				case 2:
					x=sc.nextInt();
					y=sc.nextInt();
					s=x-y;
					System.out.println("Subtraction of the two numbers is "+s);
					break;
					
				case 3:
					x=sc.nextInt();
					y=sc.nextInt();
					s=x*y;
					System.out.println("Multiplication of the two numbers is "+s);
					break;
					
				case 4:
					x=sc.nextInt();
					y=sc.nextInt();
					s=x/y;
					System.out.println("Division of the two numbers is "+s);
					break;
					
				default :
					System.out.println("********INVALID OPTION*******");
					break;
					
				}
			}

	}

}
}