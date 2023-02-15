package Recurssion;

import java.util.Scanner;

public class Main2 {
	 static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			
			TwodArray tda=new  TwodArray(3,3);
			for(int i=0;i<9;i++){
				System.out.println("insert the data");
			
			tda.insertTDA(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("search the data");
			tda.search(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println("delet the data");
			tda.delet(sc.nextInt(),sc.nextInt());
			}
			
		}

}
