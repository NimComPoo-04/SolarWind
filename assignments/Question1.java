import java.util.Scanner ; 

public class Question1
{
	private int query ; // this variable stores the virt row no.
	
	Question1(int d)
	{
		this.query = d ; // this inits the class var...
	}

	void PrintStuff()
	{
		boolean dd = query % 2 == 0 ; 
		for( int i = 0 ; i < query ; i++ ) 
		{
			for( int j = i ; j < query;  j++)
			{
				System.out.print(j+1);
			}

			// this controls the ouput of the middle chars
			for( int j = 0 ; (dd ? 2*i+1 : 2*i) >= j ; j++ )
			{
				char c = '*' ; 
				if( i % 2 != 0 ) c = '#' ; 
				System.out.print(c) ; 
			}

			for( int j = query-i ; j > 0 ; j--)
			{
				System.out.print(j) ; 
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{	
		// this is used to control the input in the system
		Scanner sc = new Scanner(System.in);
		int R ; // this stores the no. of the virt rows

		R = sc.nextInt() ; 

		// this object will be used to implement the object oriented 
		// nature of code
		Question1 q = new Question1(R) ;
		q.PrintStuff() ; 
	}
}
