package Recurssion;

public class Permutation {
	static void permutation(String str,String per)
	{
		if(str.length()==0)
		{
			System.out.println(per+" ");
		}else{
			for(int i=0;i<str.length();i++)
			{
				String f1=str.substring(0,i)+str.substring(i+1);
				String f2=per+str.charAt(i);
				permutation(f1,f2);
				
			}
		}
	}
	public static void main(String[] args) {
		permutation("1234","");
	}

}
