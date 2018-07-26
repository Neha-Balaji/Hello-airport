package airport;
import java.util.*;
import java.lang;
import java.util.Arrays;

public class Booking extends Flight {
	protected int airline;
	protected int destinationChoice;
	protected String destination;
		
	protected int tripChoice;
	protected String trip;

	protected int dateChoice;
	protected String date;

	protected int timeChoice;
	protected String time;

	protected int classChoice;
	protected String classType;

	protected double price;
		
	protected int seats;
		
	protected char tt;
	private Scanner in=new Scanner(System.in);


	public void chooseAirlineInternational()
		{
			System.out.println("\nIn which Airline you want to travel");
			System.out.println("(1) - Pakistan International Airlines");
			System.out.println("(2) - Qatar  Airline ");
			
			System.out.println("\nEnter your choice: ");
			airline=in.nextInt();

			Runtime.getRuntime().exec("cls");

		  switch(airline)
		  {
		  case 1:
			System.out.println("\n\n      Welcome to Pakistan International Airlines");
			chooseInternationalDestination();
		   break;
		  case 2:
			System.out.println("\n\n         Welcome TO Qatar Airline");
		   chooseInternationalDestination();
		   break;
		  default:
			  System.out.println("\n\nInvalid Choice! Try Again.");
		  }
		}
		
		void chooseAirlineLocal()
		{
			System.out.println("\nIn which Airline you want to travel");
			System.out.println("(1) - Air Blue Airlines");
			System.out.println("(2) - Shaheen Airlines");

			
			System.out.println("\nEnter your choice: ");
			airline=in.nextInt();
			Runtime.getRuntime().exec("cls");

		

		  switch(airline)
		  {
		  case 1:

			System.out.println("\n\n       Welcome To Air Blue Airlines");
			chooseLocalDestination();
		   break;
		  case 2:
			System.out.println("\n\n       Welcome To Shaheen Airlines");
		   	chooseLocalDestination();
		  
		   break;
		  default:
			  System.out.println("\n\nInvalid Choice! Try Again.");
		  }
		}

		void chooseLocalDestination()
		{
			System.out.println("Here are the available Local Flights:");
			System.out.println("---------------");
			System.out.println("(1) - Sargodha");
			System.out.println("(2) - Lahore");
			System.out.println("(3) - Murree");
			System.out.println("(4) - Sialkot");
			System.out.println("(5) - Peshawar");
			System.out.println("(6) - Karachi");
			System.out.println("(7) - Multan");
			System.out.println("\n(0) - Go Back");
			System.out.println("---------------");
			System.out.println("\nEnter your choice: ");
			destinationChoice=in.nextInt();
			System.out.println("\n");

			switch(destinationChoice)
			{
			case 1:
				destination="Sargodha";
				price=3000;
				break;
			case 2:
				destination="Lahore";
				price=2500;
				break;
			case 3:
				destination="Murree";
				price=1500;
				break;
			case 4:
				destination="Sialkot";
				price=3000;
				break;
			case 5:
				destination="Peshawar";
				price=2500;
				break;
			case 6:
				destination="Karachi";
				price=2000;
				break;
			case 7:
				destination="Multan";
				price=3500;
				break;
			case 0:
				Runtime.getRuntime().exec("cls");
				chooseAirlineLocal();
				break;
			default: 
				chooseAirlineLocal();
				break;
			}
			chooseTrip();
		}
		void chooseInternationalDestination()
		{
			System.out.println("Here are the available International Flights:");
			System.out.println("---------------");
			System.out.println("(1) - LONDON");
			System.out.println("(2) - BEIJING");
			System.out.println("(3) - DUBAI");
			System.out.println("(4) - HONGKONG");
			System.out.println("(5) - PARIS");
			System.out.println("(6) - MAKKAH");
			System.out.println("(7) - DOHA");
			System.out.println("\n(0) - Go Back");
			System.out.println("---------------");
			System.out.println("\nEnter your choice: ");
			destinationChoice=in.nextInt();
			switch(destinationChoice)
			{
			case 1:
				destination="LONDON";
				price=6500;
				break;
			case 2:
				destination="BEIJING";
				price=10000;
				break;
			case 3:
				destination="DUBAI";
				price=8500;
				break;
			case 4:
				destination="HONGKONG";
				price=4500;
				break;
			case 5:
				destination="PARIS";
				price=12000;
				break;
			case 6:
				destination="MAKKAH";
				price=3800;
				break;
			case 7:
				destination="DOHA";
				price=9500;
				break;
			case 0:
				Runtime.getRuntime().exec("cls");
				chooseAirlineInternational();
				break;
			default: 
				System.out.println("\nInvalid Choice! Sorry, the program will exit now.\n\n");
				Runtime.getRuntime().exec("cls");
				//exit(0);
			}			
			chooseTrip();	
		}
		void chooseTrip()
		{
			System.out.println("\nOne-way or Round Trip?");
			System.out.println("----------------------");
			System.out.println("(1) - One-way Trip");
			System.out.println("(2) - Round Trip");
			System.out.println("----------------------");
			System.out.println("\nEnter your choice: ");
			tripChoice=in.nextInt();

			switch(tripChoice)
			{
			case 1:
				trip="ONE WAY";
				break;
			case 2:
				trip="ROUND TRIP";
				price=price*2;
				break;
			case 0:

				Runtime.getRuntime().exec("cls");
				break;
			default: 
				chooseInternationalDestination();
				Runtime.getRuntime().exec("cls");

			}
			chooseDate();
		}
		void chooseDate()
		{
			System.out.println("\nCHOOSE THE DATE OF YOUR DEPARTURE");
			System.out.println("----------------------");
			System.out.println("(1) - December 23");
			System.out.println("(2) - December 24");
			System.out.println("(3) - December 25");
			System.out.println("\n(0) - Go Back");
			System.out.println("----------------------");
			System.out.println("\nEnter your choice: ");
			dateChoice=in.nextInt();
			switch(dateChoice)
			{
			case 1:
				date="23/Dec/2015";
				Runtime.getRuntime().exec("cls");
				System.out.println("\nFlight available!\n");
				break;
			case 2:
				date="24/Dec/2015";
				Runtime.getRuntime().exec("cls");
				System.out.println("\nSorry, Flight not available! Please choose another date.\n");
				chooseDate();
				break;
			case 3:
				date="25/Dec/2015";
				Runtime.getRuntime().exec("cls");
				System.out.println("\nFlight available!\n");
				break;
			default: 
				System.out.println("\nInvalid Choice! Sorry, the program will exit now.\n\n");
				Runtime.getRuntime().exec("cls");
				//exit(0);		
			}
			chooseTime();
		}

			void chooseTime()
			{
				System.out.println("\nAVAILABLE TIMES FOR DEPARTURE");
				System.out.println("----------------------");
				System.out.println("(1) - 5:00 AM");
				System.out.println("(2) - 8:45 AM");
				System.out.println("(3) - 3:00 PM");
				System.out.println("(4) - 9:45 PM");

				System.out.println("\n(0) - Go Back");
				System.out.println("----------------------");
				System.out.println("\nEnter your choice: ");
				timeChoice=in.nextInt();

				switch(timeChoice)
				{
				case 1:
					time="5:00 AM";
					break;
				case 2:
					time="8:45 AM";
					break;
				case 3:
					time="3:00 PM";
					break;
				case 4:
					time="9:45 PM";
					break;
				case 0:
					Runtime.getRuntime().exec("cls");
					chooseDate();
					break;
				default: 
					System.out.println("\nInvalid Choice! Sorry, the program will exit now.\n\n");
					Runtime.getRuntime().exec("cls");
				//exit(0);
				}
				chooseClass();
			}
			
			void chooseClass()
			{
				System.out.println("\nIn which class you want to travel?");
				System.out.println("\n---------------");
				System.out.println("(1) - BUSINESS CLASS");
				System.out.println("(2) - ECONOMY CLASS");
				System.out.println("(3) - FIRST CLASS");
				System.out.println("\n(0) - Go Back");
				System.out.println("---------------");
				System.out.println("\nEnter your choice: ");
				classChoice=in.nextInt();
				switch(classChoice)
				{
				case 1:
					classType="BUSINESS CLASS";
					tt='b';
					price=price*3;
					break;
				case 2:
					classType="ECONOMY CLASS";
					tt='e';
					break;
				case 3:
					classType="First Class";
					tt='f';
					price=price*2;
					break;
				case 0:
					Runtime.getRuntime().exec("cls");
					chooseTime();
					break;
				default: 
					System.out.println("\nInvalid Choice! Sorry, the program will exit now.\n\n");
					Runtime.getRuntime().exec("cls");
				//exit(0);

				}
				enterSeats();
			}
			void enterSeats()
			{
			System.out.println("\nEnter no of seats");
			seats=in.nextInt();
				int p[][]=new int[100][100];
				Arrays.fill(p, 0);
				System.out.printf("%d",p[0]);
			int r=13,c=6,z=1,rc;
			String cc;
			for(int i=1;i<=seats;i++)
				{
							
			if((tt=='F')||(tt=='f'))
							
			{
								
			System.out.println("\n\n\tFirst Class");
								
			System.out.println("\n\t\t\tA    B    C    D    E    F");
			for(int k=0;k<2;k++)
			{
			System.out.printf("\n\tRow:%d\t",k+1);
			for(int j=0;j<6;j++)
			{
			System.out.println("* ");
			}
			}
			System.out.println("\n\n\tEnter Row [1,2] : ");
			rc=in.nextInt();
			System.out.println("\n\tEnter Coloumn [A,B,C,D,E,F] : ");
			cc=in.nextLine();
			if((rc!=1)&&(rc!=2))
			{
			System.out.println("\n\n\tInvalid Row");
			}
			else
			{
			check_reserve(p,rc,cc);
			}
			}
			else if((tt=='B')||(tt=='b'))
			{
					System.out.println("\n\n\tBuisness Class");
					System.out.println("\n\t\t\tA    B    C    D    E    F");
					for(int k=3;k<8;k++)
					{
					System.out.printf("\n\tRow:%d\t",k+1);
					for(int j=0;j<6;j++)
					{
					System.out.println("* ");
					}
					}
					System.out.println("\n\n\tEnter Row [3,4,5,6,7] : ");
					rc=in.nextInt();
					System.out.println("\n\tEnter Coloumn [A,B,C,D,E,F] : ");
					cc=in.nextLine();
					if((rc!=3)&&(rc!=4)&&(rc!=5)&&(rc!=6)&&(rc!=7))
					{
					System.out.println("\n\n\tInvalid Row");
					}
					else
					{
					check_reserve(p,rc,cc);
					}
				}

				else if((tt=='E')||(tt=='e'))
				{
					System.out.println("\n\n\tEconomy Class");
					for(int k=8;k<14;k++)
					{
					System.out.printf("\n\tRow:%d\t",k+1);
					for(int j=0;j<6;j++)
					{
					System.out.println("* ");
					}
					}
					System.out.println("\n\n\tEnter Row [8,9,10,11,12,13] : ");
					rc=in.nextInt();
					System.out.println("\n\tEnter Coloumn [A,B,C,D,E,F] : ");
					cc=in.nextLine();
					if((rc!=8)&&(rc!=9)&&(rc!=10)&&(rc!=11)&&(rc!=12)&&(rc!=13))
					{
					System.out.println("\n\n\tInvalid Row");
					}
					else
					{
					check_reserve(p,rc,cc);
					}
					
				}
				else
					System.out.println("\n\nInvalid Ticket Type");
	}  
	 getInfo();
	}
		void show()
		{
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("                                 ELECTRONIC TICKET (c)                          ");
	System.out.println("--------------------------------------------------------------------------------");

	System.out.printf("        -----------------------Passanger Information--------------");
	System.out.printf("         --Name :%s/%s",firstName,lastName                              );
	System.out.printf("         --Contact %d                                 ",contact);
	System.out.printf("         ------------------------Flight Information----------------");
	System.out.printf("         --Origin : Quaid-e-Azam International Airport - Islamabad           ");
	System.out.printf("         --Destination :%s                             ",destination);
	System.out.printf("         --Date of Departure :%d                        ",date);
	System.out.printf("         --Time :%d                                     ",time);
	System.out.printf("         --PLane Type--AirBus A380                                           ");
	System.out.printf("         --Trip Type :%s                                 ",trip);
	System.out.printf("         --------------------------Payable Amount------------------");
	System.out.printf("         --Your Payable Amount is :%d                         ",price);
	System.out.println("\n--------------------------------------------------------------------------------");
		}
		/*void Initialize_s_plan(char[] q,int r,int c)
		{
			q=new char [c];
			for(int i=0;i<c;i++)
			{
				q[i]='*';
			}
		}

		void print_s_plan(char[]q,int c)
		{
			for(int i=0;i<c;i++)
			{
				System.out.println(q[i],"    ");
			}
		}

		void print_plan(char** q ,int r,int c)
		{
			System.out.println("\n\t\t\tA    B    C    D    E    F");
					for(int i=0;i<r;i++)
					{
					System.out.println("\n\t Row "<<i+1<<" :\t");
					print_s_plan(q[i],c);
					}
		}


		void print_class(char[][] q,int r1,int r2,int c)
		{
			System.out.println("\n\n\t\t\tA    B    C    D    E    F");
					for(int i=r1;i<=r2;i++)
					{
					System.out.printf("\n\t Row %d:\t",i+1);
					print_s_plan(q[i],c);
					}
		}*/
		void check_reserve(int p[][],int r,String c)
		{
			int b=0;
			char ch=c.charAt(0);
			switch(ch)
			{
			case 'A':
			case 'a':
			b=0;
			break;
			case 'B':
			case 'b':
			b=1;
			break;
			case 'C':
			case 'c':
			b=2;
			break;
			case 'D':
			case 'd':
			b=3;
			break;
			case 'E':
			case 'e':
			b=4;
			break;
			case 'F':
			case 'f':
			b=5;
			break;
			}
			int[]q=p[r-1];
			if(q[b]=='*')
			{
				System.out.println("Done");
				q[b]='X';
			}
			else
				System.out.println("\n\n\tSeat Unavailable\n\n");
		}

}