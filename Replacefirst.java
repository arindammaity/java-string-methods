package ilp;
import java.util.*;
public class Replacefirst
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char t = sc.next().charAt(0);
		int count=1;
		for(int i=0;i<x.length();i++)
		{
			char h =x.charAt(i);
			if(h==t)
			{
				
				x = x.replaceFirst(String.valueOf(h), String.valueOf(count));
				count++;
			}
		}
		System.out.println(x);
	}

}
