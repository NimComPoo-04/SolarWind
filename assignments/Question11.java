import java.util.Scanner ;

public class Question11
{
	private int[] val ; 

	Question11(int[] val)
	{
		this.val = val ; 
	}

	String toHex(int dat)
	{
		String s = "" ; 
		while( dat != 0 )
		{
			int dy = dat%16 ; 
			dat/=16 ;
		        // this calculation of s makes the prog	
			s = ""+ (char)(dy > 9? 'A'+dy%10 : '1'+(dy-1)) +s ; 
		}
		return s ; 
	}

	void print()
	{
		for( int i = 0 ; i < val.length ; i++)	
			System.out.println(val[i]+" => "+toHex(val[i]));
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int l = sc.nextInt() ;
		int[] m = new int[l] ;
		for( int i = 0 ; i < l ; i++)
		{
			m[i] = sc.nextInt() ; 	
		}
		Question11 q = new Question11(m) ; 
		System.out.println("") ; 
		q.print();
	}
}
