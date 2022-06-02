package Array;

public class Insertionsorting {

	public static void main(String[] args) {
		int[] arra= { 12,13,8,16,9,4,2,17,29,1,30,10};
		Insertionsorting ar= new Insertionsorting();
//		ar.sorting(arra);
//		printArray(arra);
//		ar.mytype();
//		ar.mytype2();//failure
//		ar.typeEdit();
		ar.sortOnly();

	}

//	private void mytype2() {//failure
//		int[] ary= { 12,13,8,16,9,4,2,17,29,1,30,10};
//		for(int i=1;i<ary.length;i++)
//		{
//			int B =ary[i];
	
//			int A =ary[i-1];
//			while(A>B&&(i-1)>=0)
//			{
//				B=B+A;
//				A=B-A;
//				B=B-A;
//			}	
//			for(int j=0;j<ary.length;j++)
//			{
//				System.out.print(ary[j]+" ");
//			}
//			System.out.println();
//		}
//		for(int j=0;j<ary.length;j++)
//		{
//			System.out.print(ary[j]+" ");
//		}	
//	}

	private void mytype() {
		int[] ary= { 12,13,8,16,9,4,2,17,29,1,30,10};
		for(int i=1;i<ary.length;i++)
		{
			for(int j=0;j<ary.length;j++)
			{
				System.out.print(ary[j]+" ");
			}
			System.out.println();
			int B=ary[i];
			System.out.println("B = "+B);
			int A=ary[i-1];
			System.out.println("A = "+A);
			System.out.print("A>B :"+A+">"+B);
			if(A>B)
				System.out.println(" = true");
			else
				System.out.println(" = false");
			while(A>B&&(i-1)>=0)
			{
				System.out.println("ary["+(i-1)+"] ="+ary[i-1]);
		        System.out.println("ary["+i+"] ="+ary[i]);
				ary[i]=ary[i]+ary[i-1];
				System.out.println("ary["+i+"] ="+ary[i]);  
				ary[i-1]=ary[i]-ary[i-1];
				System.out.println("ary["+(i-1)+"] ="+ary[i-1]);
				ary[i]=ary[i]-ary[i-1];
				System.out.println("ary["+i+"] ="+ary[i]);
				i--;
				System.out.println("i = "+i);
				B=ary[i];
				if(i>=1)
					A=ary[i-1];
			}	
		}
		for(int j=0;j<ary.length;j++)
		{
			System.out.print(ary[j]+" ");
		}
		
	}

	private void sorting(int array[]) {
		int n =array.length;   
		for(int i=0;i<n;++i)
		{
			int key =array[i]; 
			int j=i-1;         
			  while (j >= 0 && array[j] > key) 
			    {
	              array[j + 1] = array[j];
	              j = j - 1;               
	            }
			  array[j + 1] = key; 
		}	
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }

	 public void typeEdit()
	 {
		        int n=1;
				int[] ary= { 12,13,8,16,9,4,2,17,29,1,30,10};
				for(int i=1;i<ary.length;i++)
				{   
					if(n<ary.length)
					    i=n;
					else
						i=n-1;
					for(int j=0;j<ary.length;j++)
					{
						System.out.print(ary[j]+" ");
					}
					System.out.println();
					int B=ary[i];
					System.out.println("B = "+B);
					int A=ary[i-1];
					System.out.println("A = "+A);
					System.out.print("A>B :"+A+">"+B);
					if(A>B)
						System.out.println(" = true");
					else
						System.out.println(" = false");
					while(A>B&&(i-1)>=0)
					{
						System.out.println("ary["+(i-1)+"] ="+ary[i-1]);
				        System.out.println("ary["+i+"] ="+ary[i]);
						ary[i]=ary[i]+ary[i-1];
						System.out.println("ary["+i+"] ="+ary[i]);
						ary[i-1]=ary[i]-ary[i-1];
						System.out.println("ary["+(i-1)+"] ="+ary[i-1]);
						ary[i]=ary[i]-ary[i-1];
						System.out.println("ary["+i+"] ="+ary[i]);
						i--;
						System.out.println("i = "+i);
						B=ary[i];
						if(i>=1)
							A=ary[i-1];
					}	
					n++;
				}
				for(int j=0;j<ary.length;j++)
				{
					System.out.print(ary[j]+" ");
				}

	 }
	 public void sortOnly()
	 {
		        int n=1;
				int[] ary= { 12,13,8,16,9,4,16,15,21,29,28,2,17,29,1,30,10};
				for(int i=1;i<ary.length;i++)
				{   
					if(n<ary.length)
					    i=n;
					else
						i=n-1;
					int B=ary[i];
					int A=ary[i-1];
					while(A>B&&(i-1)>=0)
					{
						ary[i]=ary[i]+ary[i-1];
						ary[i-1]=ary[i]-ary[i-1];
						ary[i]=ary[i]-ary[i-1];
						i--;
						B=ary[i];
						if(i>=1)
							A=ary[i-1];
					}	
					n++;
				}
				for(int j=0;j<ary.length;j++)
				{
					System.out.print(ary[j]+" ");
				}

	 }
}
