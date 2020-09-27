import java.util.Scanner ; 

public class mobike
{
	private int bno ; // stores the bike no.
	private int phno ; // stors the phone no.
	private int days ; // stores the days of rent
	private int charge ; // stoers the charge
	private String name ; // stores the name of the custormes


	/* TODO: stores the input of custormers */
	public void input()
	{
		// this facilitates the output
		Scanner sc = new Scanner(System.in) ; 
		System.out.print("The Bike Number:- ") ;
	       	this.bno = sc.nextInt() ; 	
		System.out.print("The Biker Name:- ") ; 
	       	this.name = new Scanner(System.in).nextLine() ; 	
		System.out.print("The Phone number:- ") ; 
	       	this.phno = sc.nextInt() ; 	
		System.out.print("The number of days:- ") ; 
	       	this.days = sc.nextInt() ; 	
	}

	/* TODO: to compute the rental charge */
	public void computer()
	{
		if( this.days <= 5 )
			this.charge = 500 * this.days ; 
		else if( this.days <= 10)
			this.charge = 400 * (this.days-5) + 2500 ; 
		else
			this.charge = 200 * (this.days-10) + 2500 + 2000 ;
	}

	/* TODO: to print the charges in a betufil way */
	public void display()
	{
		System.out.println("Bike No.\t"+
				"Phone no.\t"+
				"Name\t"+
				"No. of days\t"+
				"Charge");
		System.out.println(bno+
				"\t"+phno+
				"\t"+name+
				"\t"+days+
				"\t"+charge);
	}

	public static void main(String args[])
	{
		mobike m = new mobike() ; 
		m.input() ; 
		m.computer() ;
		m.display() ; 
	}
}
