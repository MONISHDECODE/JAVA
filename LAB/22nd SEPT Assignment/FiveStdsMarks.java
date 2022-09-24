/*
NAME: MONISH.B
USERNAME : AF0218356
BATCH : CG2576
MAIL ID : Monishofficialmail@gmail.com
GitHubLink : https://github.com/MONISHDECODE/JAVA
*/

//To input 5 subject marks for 5 students and calculate total,avg,result using arrays?
//Note:Result should be “pass” when each mark above 40 otherwise “fail”

class FiveStdsMarks
{
	public static void main(String[] args) 
	{
		double [] s1= {85.2,55,39.5,60,18};
		double [] s2= {60,32,41,60.5,91};
		double [] s3= {45,55,79,82,81};
		double [] s4= {80,50,80,90,60};
		double [] s5= {35.5,57,63.5,40,38};
		
		double t1=0, t2=0,t3=0,t4=0,t5=0;
		double average;
		
		//5 SUBJECTS MARKS OF STUDENT 1
		System.out.println("\nRESULT FOR STUDENT 1");
		for (int i = 0; i < s1.length; i++) 
		{
			t1=t1+s1[i];
			if (s1[i]>40) 
			{
				System.out.println("PASS");
			}if (s1[i]<40) 
			{
				System.out.println("FAIL");
			}
		}
		System.out.println("{"+"S1 TOTAL:"+t1+"}");
		average=t1/5;
		System.out.println("S1 AVERAGE:"+average+"%");
		
		//5 SUBJECTS MARKS OF STUDENT 2
		System.out.println("\nRESULT FOR STUDENT 2");
		for (int i = 0; i < s2.length; i++) 
		{
			t2=t2+s2[i];
			if (s2[i]>40) 
			{
				System.out.println("PASS");
			}if (s2[i]<40) 
			{
				System.out.println("FAIL");
			}
		}
		
		System.out.println("{"+"S2 TOTAL:"+t2+"}");
		average=t2/5;
		System.out.println("S2 AVERAGE:"+average+"%");
		
		//5 SUBJECTS MARKS OF STUDENT 3
		System.out.println("\nRESULT FOR STUDENT 3");
		for (int i = 0; i < s3.length; i++) 
		{
			t3=t3+s3[i];
			if (s3[i]>40) 
			{
				System.out.println("PASS");
			}if (s3[i]<40) 
			{
				System.out.println("FAIL");
			}
		}
		
		System.out.println("{"+"S3 TOTAL:"+t3+"}");
		average=t3/5;
		System.out.println("S3 AVERAGE:"+average+"%");
		
		//5 SUBJECTS MARKS OF STUDENT 4
		System.out.println("\nRESULT FOR STUDENT 4");
		for (int i = 0; i < s4.length; i++) 
		{
			t4=t4+s4[i];
			if (s4[i]>40) 
			{
				System.out.println("PASS");
			}if (s4[i]<40) 
			{
				System.out.println("FAIL");
			}
		}
		
		System.out.println("{"+"S4 TOTAL:"+t4+"}");
		average=t4/5;
		System.out.println("S4 AVERAGE:"+average+"%");
		
		//5 SUBJECTS MARKS OF STUDENT 5
		System.out.println("\nRESULT FOR STUDENT 5");
		for (int i = 0; i < s5.length; i++) 
		{
			t5=t5+s5[i];
			if (s5[i]>40) 
			{
				System.out.println("PASS");
			}if (s5[i]<40) 
			{
				System.out.println("FAIL");
			}
		}
		
		System.out.println("{"+"S5 TOTAL:"+t5+"}");
		average=t5/5;
		System.out.println("S5 AVERAGE:"+average+"%");
	}

}
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
/*https://github.com/MONISHDECODE/JAVA*/
