import java.util.Scanner ;

public class Question11
{
	private int[] val ; 

	Question11(int[] val)
	{
		this.val = val ; 
	}

	void print()
	{
		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int l = sc.nextInt() ;
		int m = new int[l] ;
		for( int i = 0 ; i < l ; i++)
		{
			m[i] = sc.nextInt() ; 	
		}
		Question11 q = new Question11(m) ; 
		q.print();
	}
}
