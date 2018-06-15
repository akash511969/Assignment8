package assignment7;
import java.util.Scanner;
public class CountWords {
	 public static void main(String...s)
	 {
	  int word=1;
	  String str="count number of words";
	  for(int i=0;i<str.length();++i)
	  {
	   if(str.charAt(i)==' ')
	    word++;
	  }
	  System.out.println("Number of words="+word);
	 }
}