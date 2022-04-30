package loop;
import java.util.Scanner;

public class Gcd {
		public static void main(String[] args) 
		{
			Gcd basic = new Gcd();
			//basic.gcd();
			basic.lcm();
			basic.gcd1();
		}
	public void gcd()
	{
		int no1=10; int no2=100;
		int div=2;
		int gcd=0;
		int small= no1<no2?no1:no2;
		/*if(no1<no2)
			small=no1;
		else
			small=no2;*/
		while(div<small)
		{
			if(no1%div==0 && no2%div==0)
			{
				System.out.println(div);
				gcd = div;
			}
			div=div+1;
		}
		System.out.println("greatest common Divsor is "+ gcd);	
	}
	public void lcm()
	{
		int no1 =3,no2=10;
		int big =no1>no2?no1:no2;
		int value = big;
		while(true)
		{
		if(big%no1==0 && big%no2==0)
		{
			System.out.println("lcm is = "+big);
			break;
		}
		big=big+value;
	    }
	}
	public void gcd1()
	{
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enetr the a");
			int a =input.nextInt();
			System.out.println("enetr the b");
			int b =input.nextInt();
			int i=1;
			boolean d = true;
			if (a!=b)
			{
				int x=0;
				while(d)
				{
					 x=a/i;
					 int u =x;
					 //System.out.println(x);
					 System.out.println(b%u);
					if(b%x==0) 
					{
					System.out.println("gcd was "+ x);
					d= false;
					}
					++i;
				}
				if(x==1)
				{
					System.out.println("these num dont have gcd");
				}
			}
		}
	}
	}


