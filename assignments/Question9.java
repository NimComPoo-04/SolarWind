import java.util.Scanner ; 

public class Question9
{
	private int[] val ; // this is var for [ 7 | 8 | 5 | 4 ]

	// this inits the Question9 obj...
	Question9(int[] val)
	{
		this.val = val ; 
	}

	/* TODO:This method finds the freaquency */
	public int Frequency(int find)
	{
		// this is the var which holds the no. of eles...
		int freak = 0 ;
	       	for( int i = 0 ; i < val.length ; i++)
		{
			if(val[i] == find)
			{
				freak++ ; 
			}
		}	
		return freak ; 
	}	

	/* TODO:This function if the no. is really a prime */
	public boolean isPrime(int id)
	{
		if( id == 1) return false ; 

		// this funcition is uses a mathematical prop of 
		// the nos. if it  is a prime...
		for( int i = 2 ; i < (int)Math.sqrt(id)+1 ; i++)
		{
			if( id % i == 0 )
				return false ; 
		}
		return true ; 
	}

	/* 
	 * This is the function which abs the complecity 
	 * or to tell the truth does the real job by 
	 * bringing every thing together
	 */
	public void DoSomething()
	{
		// this var helps to check the data already in 
		String A = ""; 
		for( int i = 0 ; i < val.length ; i++)
		{
			if(isPrime(val[i]) && A.indexOf(val[i]+"")==-1)
			{
				System.out.println("Freaquency of"+
						" the prime "+
						val[i]+
						": "+
						Frequency(val[i]));
				A += val[i]+" "; 
			}
		}
	}

	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the size of array: ") ;
	      	int len = sc.nextInt() ; 
		System.out.println("Enter the elemets of the array: ") ; 
		int[] gg = new int[len] ; 
		for( int i = 0  ; i < len ; i++)
		{
			gg[i] = sc.nextInt() ; 
		}

		Question9 q = new Question9(gg) ; 
		q.DoSomething();
	}
}
