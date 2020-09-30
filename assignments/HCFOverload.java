import java.util.Scanner ; 

public class HCFOverload
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in) ; 
		HCFOverload h = new HCFOverload() ; 
		{
			long a  ; // the first no
			long b  ; // the second no
			a = sc.nextLong() ; 
			b = sc.nextLong() ;
			System.out.println("hcf = "+h.hcf(a,b));
		}
		{
			long a ; // the first no 
			long b ; // the second no
		       	long c ; // the third no
			a = sc.nextLong() ; 
			b = sc.nextLong() ;
			c = sc.nextLong() ; 
			System.out.println("hcf = "+h.hcf( a, b, c ));
		}	
	}

	/* this funtion will find the hcf of two nos.*/
	long hcf(long lq, long lw)
	{
		long d = Math.min(lq,lw) ; 
		long gg = 1 ; 
		for( int i = 1 ; i <= d ; i++)
		{
			if(lq%i == 0 && lw%i == 0 && i > gg )
				gg = i ;  
		}

		return gg ; 
	}

	/* this funciton will find the hcf of 3 nos*/
	long hcf( long a, long s, long d)
	{
		 return hcf( a, hcf(s,d)) ; 
	}
}
