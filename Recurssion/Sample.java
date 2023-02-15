package Recurssion;

public class Sample {
	public static void recurssion(int no)
	{
		if(no==1)
	{
			if(no%2==0)
			 
		
			System.out.println(no);
		}
		else{if(no%2==0)
		
			System.out.println(no);
			recurssion(no-1);
		}
	}
	public static void main(String[] args) {
		recurssion(10);
		
	}

}
