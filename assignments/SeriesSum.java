import java.util.Scanner ; 

public class SeriesSum
{
	private double x ; 
	private int n ; 
	private double sum ;

	SeriesSum()
	{
		x = 0.0d ; 
		n = 0 ;
		sum = 0.0d ;
	}

	// TODO: returns the value of one term
	double term(int p, int q)
	{
		return 1.0d * p/q ; 
	}
	
	// TODO: accepts the data of x and n
	void accept()
	{
		// this helps in input
		Scanner sc = new Scanner(System.in) ;
	        System.out.println("Enter x and n for the oparation : ");	
		this.x = sc.nextInt() ; 
		this.n = sc.nextInt() ; 
	}

	// TODO: displays the value of member of sum
	void displaysum()
	{
		System.out.println("The Sum := "+this.sum);
	}

	// TODO: calcultes the sum of the given series using the appropiate data
	double calcsum()
	{
		int pow = 2; int denim = 1 ; 
		for( int i = 0 ; i < this.n ; i++)
		{
			this.sum += term((int)Math.pow(this.x, pow), denim) ;
		       	System.out.print("x^"+pow+"/"+denim+" + ");	
			pow = pow*2+(i+1) ; 
			denim = pow + (pow-(i+1))/2;
		}
		return this.sum ; 
	}

	public static void main(String args[])
	{
		SeriesSum sp = new SeriesSum() ; 
		sp.accept() ; 
		double s = sp.calcsum() ;
		sp.displaysum() ; 
	}
}
