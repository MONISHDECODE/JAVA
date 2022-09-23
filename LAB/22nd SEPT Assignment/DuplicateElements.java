/*
NAME: MONISH.B
USERNAME : AF0218356
BATCH : CG2576
MAIL ID : Monishofficialmail@gmail.com
GitHubLink : https://github.com/MONISHDECODE/JAVA
*/

//TO FIND DUPLICATE ELEMENTS AND COPY TO ANOTHER ARRAY
// 1 2 3 5 3 = [3 3]

import java.util.Scanner;
class DuplicateElements
{
	public static void main(String[] args)//main method
	{
		int[] x=new int[5];//array declaration
		int[] y=new int[5];
		
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			x[i]=sc.nextInt();//get the array elements
		}
			System.out.println("Duplicate array:");
			for(int i=0;i<=4;i++)
			{
				for(int j=i+1;j<=4;j++)
				{
					if(x[i]==x[j])//check the condition
					{
						y[i]=x[j];//assign value to y array
						System.out.println("["+y[i]+" "+y[i]+"]");//print duplicate array
					}
				}
			}
	}
}

/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/