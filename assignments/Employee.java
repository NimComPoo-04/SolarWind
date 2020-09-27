import java.util.Scanner ; 

public class Employee
{
	private int pan ; // to store the personal account no 
	private String name ; // to store the name of the employee
	private double taxincome ; // stores the annual taxincome
	private double tax ; // stores tax that is calculated
	
	/* TODO:  Stores pan, name, taxable income */
	public void input()
	{
		// facilates the input of data
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter pan no.:");
		this.pan  = sc.nextInt() ; 
		System.out.println("Enter name of indivisual: ");
		this.name = new Scanner(System.in).nextLine() ; 
		System.out.println("Enter taxiable income: "); 
		this.taxincome = sc.nextDouble() ; 
	}

	/* TODO: Caluclates the taxible income of employee */
	public void calc()
	{
		if( this.taxincome <= 1E6 )
			this.tax = 0 ; 
		else if( this.taxincome <= 15E4 )
			this.tax = (taxincome-1E6) * 0.1 ; 
		else if( this.taxincome <= 25E4 )
			this.tax = (taxincome-15E4) * 0.5 + 5000 ; 
		else if( this.taxincome > 25E4 )
			this.tax = (taxincome-25E4) * 30.0/100.0 + 25000 ;
	}

	/* TODO: Display the income in a sensible manner */
	public void display()
	{
		System.out.println("Pan Number\tName\tTax-income\tTax");
		System.out.println(this.pan+"\t"+
				this.name+"\t"+
				this.taxincome+"\t"+
				this.tax) ;	
	}

	public static void main(String args[])
	{
		Employee e = new Employee() ;
		e.input() ;
		e.calc() ; 
		e.display() ; 
	}
}
