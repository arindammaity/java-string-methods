package ilp;
import java.util.*;
public class Split 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String x = sc.nextLine();
		String[] k= x.split(" ");
		for(int i=0;i<k.length;i++)
		{
		System.out.println(k[i]);
		}
	}

}
