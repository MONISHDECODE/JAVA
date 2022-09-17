//WRITE A PROGRAM TO PRINT DETAILS

/*
studentId : AF0218356
name: MONISH.B
batch : FORENOON
attendance : 95.5
number : 8939507021
GitHubLink : https://github.com/MONISHDECODE/JAVA
*/


import java.util.Scanner;
public class Details 
{
public static void main(String[]args)
{
String studentId, name, batch;
float attendance;
long number;
String GitHubLink;

Scanner input=new Scanner(System.in);

System.out.println("Enter the student StudentId:");
studentId=input.nextLine();

System.out.println("Enter the Student Name:");
name=input.nextLine();

System.out.println("Enter the Student Batch:");
batch=input.nextLine();

System.out.println("Enter the Student Attendance:");
attendance=input.nextFloat();

System.out.println("Enter the Student Number:");
number=input.nextLong();

System.out.println("Enter the Student GitHubLink:");
GitHubLink=input.next();

System.out.println("The ID of the Student:"+studentId );
System.out.println("The Name of the Student:"+name );
System.out.println("The Batch of the Student:"+batch );
System.out.println("The Attendance % of the Student:"+attendance );
System.out.println("The Number of the Student:"+number );
System.out.println("The GitHubLink of the Student:"+GitHubLink );

}
}

/*https://github.com/MONISHDECODE/JAVA*/