
public class Pattern8 {
	public static void main(String[]args)
	{
		Pattern8 p8 = new Pattern8();
		p8.patte8();
		p8.patte9();
		p8.patte10();
		p8.patte11();
		p8.patte12();
	}
	private void patte8() 
	{
		for(int m=5;m>0;m--)//pattern8
		{
			for(int n=m-1;n>0;n--)
				System.out.print(" ");
			for(int n=m;n<=5;n++)
				System.out.print(n+" ");
			System.out.println();
		}
	}
	private void patte9() 
	{
		int letter =64;
		for(int m=1;m<6;m++)
		{
		for(int n=5-m;n>0;n--)
			System.out.print(" ");
		for(int n=1;n<=m;n++)
			System.out.print((char)(letter+n)+" ");
		System.out.println();
		}		
	}
	private void patte10() 
	{
	    int letter =64;	
		for(int m=5;m>0;m--)//pattern8
		{
			for(int n=m-1;n>0;n--)
				System.out.print(" ");
			for(int n=m;n<=5;n++)
				System.out.print((char)(letter+n)+" ");
			System.out.println();
		}
	}
	public void patte11() 
	{
		int k=1;
		for(int m=5;m>0;m--)//pattern8
		{
			for(int n=m-1;n>0;n--)
				System.out.print(" ");
			for(int n=k;n>0;n--)  
				System.out.print("*");
			k= k+2;
			System.out.println();
		}
	}
	public void patte12()
	{
		for(int m=1;m<6;m++)//pattern8
		{
			for(int n=5-m;n>0;n--)
				System.out.print(" ");
			for(int n=0;n<m;n++)
				System.out.print(m+" ");
			System.out.println();
		}
	}
}
