package Array;

public class ArrayFactorial {

	public static void main(String[] args) {
		ArrayFactorial ar =new ArrayFactorial();
//		ar.factorial();
//		ar.square();
		ar.prime();

	}

	private void prime() 
	{int[] no= {2,3,6,8,13,21,17,18,19};
	for(int k=0;k<no.length;k++) {
		int n=no[k];
		boolean div=true;
		if(n%2==0)
		{
			if(n==2) 
				System.out.println(n+" is a prime number");
			else
			    System.out.println(n+" is not a prime number");
			div=false;
		}
		else
			for(int i=3;i<n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not a prime number");
					div=false;
					break;
				}
			}
		if(div)
			System.out.println(n+" is a prime number");
		}
	}

	private void square() 
	{
		int[] no= {2,3,4,7,5};
		int[] no1=new int[no.length];
		for(int i=0;i<no.length;i++)
		{
			no1[i]=no[i]*no[i];
			System.out.println(no[i]+" square is "+no1[i]);
		}
		
	}

	private void factorial() 
	{
		int[] no= {2,3,5,4,7};
		int[] no1= new int[no.length];
		for(int j=0;j<no.length;j++)
		{
			int value=no[j];
		int fac=1;
		for(int i=1;i<=value;i++)
		{
			fac=fac*i;
			no1[j]=fac;
		}
		System.out.println(fac);
		}
		for(int i=0;i<no1.length;i++)
		{
			System.out.print(no[i]+" 's factorial is = ");
			
			System.out.println(no1[i]+" ");
		}
	}
	

}
