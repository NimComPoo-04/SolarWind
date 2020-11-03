import java.util.*;
public class Pattern
{
    int lineno ;
    Pattern(int lineno)
    {
        this.lineno = lineno;
    }

    public void pat()
    {
        int x = lineno ;
        for(int i = 0 ; i &lt;= x ; i++)
        {
            if(i == 1) continue;
            for(int j = x ; j&gt;= i ; j--)
            {
                System.out.print(&quot; &quot;);
            }
            for(int j = 0; j&lt;=i ;j++)
            {
               System.out.print(fact(i)/(fact(j)*fact(i-j))+ &quot; &quot;);
            }
            System.out.println();
        }
    }

    public int fact(int n)
    {
        int k = 1 ;
        for(int i = 1 ;i&lt;=n ; i++)
        {k*= i ;}
        return k ;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);int a;
        do
        {
            System.out.print(&quot;Enter the line no. : &quot;);
            a = sc.nextInt();
        }while(a&lt;=0);
        Pattern b = new Pattern(a);
        b.pat();
    }
}
