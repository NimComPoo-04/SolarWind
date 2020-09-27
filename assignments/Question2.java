import java.util.Scanner ; 

public class Question2
{
	private int dq , dw ; 

	Question2(int dq, int dw)
	{
		this.dq = dq ; 
		this.dw = dw ; 
	}

	/*Gets the multiple*/
	int GetMul()
	{
		int sum = 0 ; // to store the sum of the val
		int dq = this.dq ; // to avoid editing the original
		int dw = this.dw ; // to avoid editing the original
		int len = (int)Math.log10(dq)+1 ; 
		/*
		 * does one thing and does it well
		 * it calcultes the value for the __ but it does not try that
		 * it follows the *NIX principle
		 */
		for( int i = 0 ; i < len ; i++)
		{
			// to make it more efficient 
			int pow = (int)Math.pow(10,len-i-1) ;
			System.out.println(pow);
			sum += (dq/pow) * (dw%10) ;
		       	System.out.println(dw+" "+dq) ; 	
			dw = dw / 10 ; 
			dq = dq % pow ;
			System.out.println(dw+" "+dq) ; 	
			System.out.println(sum);
		}

		return sum ; 
	}
	
	/*Gets nearest prime in row*/
	int GetPri(int mul)
	{
		for ( int i = mul ; ; i++)
		{
			if(isPrime(i)) return i ;
		}
	}

	/* Checks if the no. is prime*/
	boolean isPrime(int n)
	{
		if( n == 1) return false  ;
		for( int i = 2 ; i <= Math.sqrt(n)+1 ; i++)
		{
			if( n % i == 0) return false  ;
		}
		return true ; 
	}

	public static void main(String args[])
	{
		// this program will print nearest prime
		// this  handles the input
		Scanner sc = new Scanner(System.in) ;

		// takes a input of 5 digit nos
		int d,dd ; 
		do // input guard
		{
			d =sc.nextInt() ; 
			dd = sc.nextInt() ; 
		}
		while(d > 99999 || dd > 99999 || d < 10000 || dd < 10000) ; 

		// this implemets the obj feature
		Question2 w = new Question2(d,dd) ;
	       	int mul = w.GetMul() ; // this gets the mul result
		int pri = w.GetPri(mul) ; // this gets the prime result
		System.out.println("The Mul = "+mul+" The nearest prime = "+pri);
	}
}
