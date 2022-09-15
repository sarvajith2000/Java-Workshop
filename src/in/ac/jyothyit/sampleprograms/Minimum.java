package in.ac.jyothyit.sampleprograms;
public class Minimum{
	public static int findMinimum(int a , int b)
	{
	if(a<b)
		return a;
	else
		return b;
	
		
	}
	public static int findMinimum(int a , int b , int c)
	{
		if(a<b && a<c)
			return a;
		if(b<a && b<a)
			return b;
		return c;
	}
}