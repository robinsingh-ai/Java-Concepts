package robin;
import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		
		
		int i,j,c,k;
		int add[][]=new int[3][3]; int mut[][]=new int[3][3];int sub[][]=new int[3][3];
		
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Entre Your Choice");
			System.out.println("1.Entre values of both matrix\n2.Display the matrix\n3.Addition\n4.Multiplication\n5.Subtraction\n6.Exit");
			c=sc.nextInt();
			
			if(c==6)
			{break;}
			
			else
			{
			 
				switch(c)
				{
				
				  case 1:
					  System.out.println("Entre values of 1st matrix");
					  
					  for(i=0;i<3;i++)
					  {
						  
						 for(j=0;j<3;j++)
						 {
							 
							 mat1[i][j]=sc.nextInt();
							 
						 }
						  
					  }
					  
					  System.out.println("Entre values of 2nd matrix");
					  for(i=0;i<3;i++)
					  {
						  
						 for(j=0;j<3;j++)
						 {
							 
							 mat2[i][j]=sc.nextInt();
							 
							 
						 }
						 
					  }
					  break;
					  
					  
				
				
				
				  case 2:
					  System.out.println("The first 3X3 matrix is : "); 
					  for (i=0 ; i<3 ; i++)
					  {
					  for (j=0 ; j<3 ; j++)
					  System.out.print(mat1[i][j]+"\t");
					  System.out.println(" ");
					  }

					  System.out.println("The second 3X3 matrix is : "); 
					  for (i=0 ; i<3 ; i++)
					  {
					  for (j=0 ; j<3 ; j++)
					  System.out.print(mat2[i][j]+"\t"); 
					  System.out.println(" ");
					  }
					  break;
				  case 3:
					  System.out.println(" "); 
					  for (i=0 ; i<3 ; i++)
					  {
					  for (j=0 ; j<3 ; j++)
					  add[i][j] = mat1[i][j] + mat2[i][j] ;
					  }
					  System.out.println("The resultant addition 3X3 matrix is :") ; 
					  for (i=0 ; i<3 ; i++)
					  {
					  for (j=0 ; j<3 ; j++)
					  System.out.print(add[i][j]+"\t"); System.out.println(" ");
					  }
					  break;
				  case 4:
					  for( i=0;i<3;i++){ 
					  for( j=0;j<3;j++){    
							  for( k=0;k<3;k++)      
						  {      
						  mut[i][j]+=mat1[i][k]*mat2[k][j];      
						  }
							  
						  System.out.print(mut[i][j]+" "); 
						  }
						  System.out.println();   
						  } 
					  break;
					  
				  case 5:
					  System.out.println(" "); 
					  for (i=0 ; i<3 ; i++)
					  {
					  for (j=0 ; j<3 ; j++)
					  sub[i][j] = mat1[i][j] - mat2[i][j] ;
					  }
					  System.out.println("The resultant Subtraction 3X3 matrix is :") ; 
					  for (i=0 ; i<3 ; i++)
					  {
					  for (j=0 ; j<3 ; j++)
					  System.out.print(sub[i][j]+"\t"); System.out.println(" ");
					  }
					  break;
				 default:
					 System.out.println("*****INVALID OPTION********8");
					 break;
					 
					 
			   }
				
				
				
			}
			
		}
		
	}

}
