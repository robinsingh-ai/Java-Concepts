package robin;
import java.util.Scanner;
public class PatternUsingloops {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre Number of rows");
		n=sc.nextInt();
		for(i=1;i<=n;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(i);
				
			}
			System.out.println();
			
		}
	

	}

}
