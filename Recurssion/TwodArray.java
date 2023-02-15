package Recurssion;



import java.util.Scanner;
public class TwodArray{
	int arr[][]=null;
	public TwodArray(int rowsize,int colsize)
	{
		arr=new int[rowsize][colsize];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.MIN_VALUE;
			}
		}
	}
	
public void insertTDA(int rowlocation,int collocation,int values)
{
	if(arr[rowlocation][collocation]==Integer.MIN_VALUE)	
	{
		
		arr[rowlocation][collocation]=values;
		System.out.println("sucessfully inserted");
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)	
		{		System.out.print(arr[i][j]+" ");
		}
	
	System.out.println();
	}}

public void search(int rowlocation,int collocation,int searchvalues){
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
{
	if(arr[rowlocation][collocation]==searchvalues){
		
	
		System.out.print( arr[rowlocation][collocation]+" ");

	}}}
		System.out.println("searched values successfully");
		

		
	


for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)	
	{		System.out.print(arr[i][j]+" ");
	}
System.out.println();

}}
public void delet(int rowlocation,int collocation)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
	if(arr[rowlocation][collocation]!=Integer.MIN_VALUE)
	{
		arr[rowlocation][collocation]=Integer.MIN_VALUE;
		System.out.println("values deleted succesfully"+" "+arr[i][j]);
	}
	}

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)	
	{		System.out.print(arr[i][j]+" ");
	}
System.out.println();
}
}
}




