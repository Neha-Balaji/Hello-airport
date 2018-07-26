package airport;
import java.util.Scanner;
//import java.io.*;



public class HelloAirport {

	public static void main(String[] args) {
		Flight f = new Flight();
		Booking b=new Booking();
		int menuChoice;
		Scanner in=new Scanner(System.in);
		//private ObjectInputStream input;
		while(true)
		{
			System.out.println("\n\n\n\n");
			   System.out.println("Welcome to Airport Tickiting System\n\n");
			   System.out.println("*************************************");
			   System.out.println("* Quaid-e-Azam International Airport*");
			   System.out.println("*             MAIN MENU             *");
			   System.out.println("*        ENTER YOUR CHOICE          *");
			   System.out.println("*    (1)-- FOR LOCAL BOOKING        *");
			   System.out.println("*  (2)--FOR INTERNATIONAL BOOKING   *");
			   System.out.println("*(3)------------------SEARCH RECORD *");
			   System.out.println("*(0)-----------------------FOR EXIT *");
			   System.out.println("*************************************");
			   System.out.println("\n");
			   System.out.println("PLEASE ENTER CHOICE ::"); 
			   menuChoice=in.nextInt();
			  switch(menuChoice)
			  {
			  case 1:
				   b.chooseAirlineLocal();
				   b.show();
				   break;
			   case 2:
				   b.chooseAirlineInternational();
				   b.show();
				   break;  
				case 3:
					{
		          //input=new ObjectInputStream(new FileInputStream("Person.txt"));
				int sid;
				System.out.println("Enter ID to search data \n");
				sid=in.nextInt();
				f.readinfo(sid);
				break;
			        }
		
				default:
				System.out.println("\nNice To See U , Thanks for Comming!!\n\n");
				//exit(0);		    
			}
			}
		
			}
}

			  
			
		
		

	


