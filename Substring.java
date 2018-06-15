package assignment7;
public class Substring {
	public static void main(String args [])
	{
		String str = "xyz";
		int length = str.length();
		int i , j;
		String sub = "";
		for (i = 0; i <= length; i++)
		{
			for(j = 1; j <= length - i; j++)
			{
				sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	}
}
