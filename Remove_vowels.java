package assignment7;
import java.util.Scanner;
public class Remove_vowels {
	 public static void main(String args[])
	   {
	       String Orig, New;
	       Scanner scan = new Scanner(System.in);
	       System.out.print("Enter a String : ");
	       Orig = scan.nextLine();
	       New = Orig.replaceAll("[aeiouAEIOU]", "");
	       System.out.print("New String is :");
	       System.out.print(New);
	   }
}
