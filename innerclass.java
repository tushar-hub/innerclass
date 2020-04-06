import java.io.*;
import java.util.*;
class abc
{
String name;
String date_of_birth;
int marks_percentage;
int registration_id;
public abc()

{
	
	
Scanner input=new Scanner(System.in);
System.out.println("ENTER THE STUDENT'S NAME:\n\n");
name=input.nextLine();
System.out.println("students name is:"+name);
 System.out.print("Enter any date in 8 digits (dd/mm/yyyy) format: ");
date_of_birth=input.nextLine();
System.out.println("ENTER THE STUDENT'S MARKS PERCENTAGE:\n\n");
marks_percentage=input.nextInt();
if(marks_percentage <=65)
	{
		int counter;
		    Random rnum = new Random();
//      System.out.println("Random Numbers:");
      
      for (counter = 1; counter <= 1; counter++) 
	  {
		  		 
        System.out.println(rnum.nextInt(90));
		registration_id=rnum.nextInt(90);

		 
      }
    }
	else
	{
   System.out.println("ENTER THE STUDENT'S REGISTRATION ID:\n\n");
   registration_id=input.nextInt();
}


  
}

 void display()
{
System.out.println(name);
	System.out.println(date_of_birth);
	System.out.println(marks_percentage);
	System.out.println(registration_id);
}
 class xyz
{
	int Roll_no;
	String Section_name;

void show()
{
 Scanner input=new Scanner(System.in);
	System.out.println("PLEASE ENTER STUDENTS ROLL NO.");
	Roll_no=input.nextInt();
	
	
	System.out.println("PLEASE ENTER STUDENT'S SECTION NAME:");
	Section_name=input.nextLine();
	
}
}
}
class TestNested
{
public static void main(String[] args)
{

abc a1=new abc();
//abc.xyz x1=a1.new abc.xyz();
abc.xyz x1=a1.new xyz();
x1.show();
a1.display();
}
}
