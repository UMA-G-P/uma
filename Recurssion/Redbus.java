package Recurssion;

public class Redbus{
	int[] arr=null;
	public Redbus(int numberofseats)
	{
		arr=new int[numberofseats];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.MIN_VALUE;
		}
		
	
	
}

	//TicketBooking
	public void ticketbooking(int location,int num)
	{
		
	
	try{
	{
		if(arr[location]==Integer.MIN_VALUE)
		{
			arr[location]=num;
			System.out.println("the seat num"+num+"sucessfully booking");
		}
		else{
			System.out.println("the seat you are looking is already booked choose another one");
		}
			System.out.println();
			
		}
	}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Invalid seat number,The seat number is 40 choose with in");	
}
}
	
}