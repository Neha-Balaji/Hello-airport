package airport;

import java.util.*;
import java.io.*;


public class Flight {
	
	private Formatter output;
	Scanner in = new Scanner(System.in);
	protected int id;
	protected int contact;
	protected String lastName;
	protected String firstName;
    output=new Formatter("Person.txt");
		
    public void   getInfo()
	{
		
			System.out.println("\nPlease enter CNIC ::");
			id=in.nextInt();
			output.format("%d ",id);
		
			System.out.println("\n\nPASSENGER INFORMATION");
			System.out.println("\nFIRST NAME: ");
			firstName=in.next();
		
			output.format("%s ",firstName);
			System.out.println("LAST NAME: ");
			lastName=in.next();
		
			output.format("%s ",lastName);
			System.out.println("CONTACT NUMBER: ");
			contact=in.nextInt();
		
			output.format("%d\n",contact);
			System.out.println("\n");
			Runtime.getRuntime().exec("cls");

	}

		public void   readinfo(int value)
	{
		
			in=new Scanner(new File("Person.txt"));
			
			int id;
			String fname,lname,cont;
			String temp;
			int found=0;
		while(in.hasNext())
		{
			id=in.nextInt();
			
				if (id==value)
			{
			
				found=1;
					break;
			}
			
			temp=in.next();
			temp=in.next();
			temp=in.next();
		
		}
		
			if (found==1)
		{
			
			fname=in.next();
			
			lname=in.next();
			
			cont=in.next();	
			
			System.out.println("\nInfo About user is ");
			System.out.printf( "\nCNIC  = %d",id); 
			System.out.printf( "\nFirst Name  = %s",fname);
			System.out.printf( "\nLast Name  = %s",lname);
			System.out.printf( "\nContact  = %d",cont);
			
		}
		else
		{
		System.out.println("Record Not found \n");
		}
	}
		void print()
		{
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(contact);
		}

}
