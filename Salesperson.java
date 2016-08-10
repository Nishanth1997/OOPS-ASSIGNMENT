package salesperson;

import java.util.*;

public class Salesperson {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no of salesmen:");
	int n=scan.nextInt();
	int []A=new int [n];
	for(int i=0;i<n;i++)
	{
		System.out.print("enter the grosspay of employee "+(i+1)+" :");	
		A[i]=scan.nextInt();
		A[i]=(int) (200+(0.9*A[i]));
	}
	int []res=new int[9];
	for(int i=0;i<n;i++)
	{
		if(A[i]>=200 && A[i]<300)
			res[0]++;
		else if(A[i]>=300 && A[i]<400)
			res[1]++;
		else if(A[i]>=400 &&A[i]<500)
			res[2]++;
		else if(A[i]>=500 &&A[i]<600)
			res[3]++;
		else if(A[i]>=600 &&A[i]<700)
			res[4]++;
		else if(A[i]>=700 &&A[i]<800)
			res[5]++;
		else if(A[i]>=800 &&A[i]<900)
			res[6]++;
		else if(A[i]>=900 &&A[i]<1000)
			res[7]++;
		else
			res[8]++;
		
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("the gross pay of employee" +(i+1)+ " :"+A[i]);
	}
	System.out.println("Range of GrossPay                             Number of Salesmen");
	
	System.out.println("   $200-299                                   "+res[0] );
	System.out.println("   $300-399                                   "+res[1] );
	System.out.println("   $400-499                                   "+res[2] );
	System.out.println("   $500-599                                   "+res[3] );
	System.out.println("   $600-699                                   "+res[4] );
	System.out.println("   $700-799                                   "+res[5] );
	System.out.println("   $800-899                                   "+res[6] );
	System.out.println("   $900-999                                   "+res[7] );
	System.out.println("   $1000 and over                             "+res[8] );
	}
}