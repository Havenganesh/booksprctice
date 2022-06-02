package Array;

import java.util.Scanner;

public class ArrayAssign {

	public static void main(String[] args) {
		
		
		ArrayAssign ar =new ArrayAssign();
//		ar.vall();
		ar.oddEven();
	
	}
	public void oddEven()
	{
		Scanner sc=new Scanner(System.in);
		int[] one=new int[5];
		for(int i=0;i<one.length;i++)
		{
			System.out.println("enter the value");
			one[i]=sc.nextInt();
		}
		for(int i=0;i<one.length;i++)
		{
			if(one[i]%2==0)
			{
				System.out.println(one[i]+" odd number");
			}
			else if(one[i]%2==1)
			{
				System.out.println(one[i]+" even number");
			}
		}
		sc.close();
	}
	public void vall()
	{
		int[] make = new int[5];
		Scanner sc=new Scanner(System.in);
		int total=0;
		for(int i=0;i<make.length;i++)
		{
			System.out.println("please enter the value");
			make[i]=sc.nextInt();
			total=total+make[i];
		}
		for(int i=0;i<make.length;i++)
		{
			int j=make[i];
			System.out.println(j);
		}
		System.out.println(total);
		sc.close();
	}

}
