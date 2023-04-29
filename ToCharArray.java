package ilp;
import java.util.*;
public class ToCharArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char[] p = x.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			System.out.println(i);
		}
	}

}
