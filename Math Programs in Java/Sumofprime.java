import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumofprime {
static List<Integer> a=new ArrayList<>();

/*	static boolean ispr(int l)
	    {  boolean isprime=true;
	        for(int i=2;i<=l/2;i++)
	        {
	            if(l%i==0)
	            isprime=false;
	            break;
	        }
	    
	        return isprime;
	    }*/
	static long prime_Sum(int n)
    { int sum=0;
    
    if(n==1)
    return 0;
    
    for(int i=2;i<=n;i++)
        {
    	int count=0;
        for(int j=2;j*j<=i;j++)
        	
        { 
        	if(i%j==0)
         
        	{
        		count++;
        		}
        }
        if(count==0)
        {
       sum+=i;
        a.add(i);
        }
        }
    long ans=sum;
        return  ans;
    }
	
	static void printa()
	{
		for(int b:a)
		{
			System.out.print(b+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prime_Sum(n));
		printa();

	}}



 