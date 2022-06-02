package Array;

public class Myarray 
{	
	public static void main(String[] args) 
	{
		int[] ages = {36, 34,39, 26}; 	
		Myarray ma =new Myarray();
		ma.find_max_min(ages);
		ma.captain();
		

	}
	public void find_max_min (int[] ages) 
	{ //36	34	39	26	26
		int mr_youth= ages[0]; 
		int position = 0; 
		for(int i=1; i<ages.length; i++)
		{
		if(ages[i]<mr_youth)
		{ mr_youth = ages[i]; position = i;  } 

		}
		System.out.println("Mr. Youth is " + mr_youth + " position is "+ position); 

    }
	public void captain()
	{
	int[] ages = {36,34,39,26,38}; 
	int captain =0, vice_captain=0; 
	for(int i=0; i<ages.length; i++)
	{
	if(ages[i]>captain)	{ vice_captain = captain; captain = ages[i]; }

	else if(ages[i]>vice_captain)	{	vice_captain = ages[i];		}

	}
	System.out.println(captain); 
	System.out.println(vice_captain);
	}
}
