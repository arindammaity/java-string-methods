package ilp;
import java.util.*;
public class EqualsIgnoreCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x=sc.nextLine();
		String b = sc.nextLine();
		if(x.equalsIgnoreCase(b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
