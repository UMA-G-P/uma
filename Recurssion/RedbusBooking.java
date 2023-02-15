package Recurssion;
import java.util.Scanner;
public class RedbusBooking {
	 static Scanner sc=new Scanner(System.in);

public static void main(String[] args)
{

	Redbus rb=new Redbus(40);
	System.out.println("welcome");
	System.out.println(" select how many seats you want to book");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("choose the location and seatnumber");
		rb.ticketbooking(sc.nextInt(),sc.nextInt());
	}
	System.out.println("would u like u check for your conformation ticket,enter 1 for yes and 2 for no");
}
	
}
