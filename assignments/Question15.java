import java.util.Scanner ; 

public class Question15
{
	/* finds char */
	void check(String str, char c)
	{
		int dat = 0 ;
		for( int i = 0 ; i < str.length() ; i++)
		{
			if( str.charAt(i) == c)
				dat++ ; 
		}
		System.out.println("The no of "+c+" present = "+dat) ; 
	}

	/* hides voweles */
	void check( String str )
	{
		System.out.print("Module2: ");
		str = str.toLowerCase() ;
		for( int i = 0 ; i < str.length() ; i++)
		{
			if( "aeiou".indexOf(str.charAt(i)) != -1)
				System.out.print(str.charAt(i)+" ") ; 	
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter dat for checking: ") ;
	       	String s = sc.next() ; 
		char c = sc.next().charAt(0) ;
		Question15 q = new Question15() ; 
		q.check(s,c) ; 
		q.check(s) ; 	
		System.out.println() ;
	}
}
