package bottles;
import java.text.MessageFormat;
import java.util.Scanner;

public class beerfactory {
	 static String bottles(final int n){
	  return MessageFormat.format("{0,choice,0#No more bottles|1#One bottle|2#{0} bottles} of beer", n);
	 }
	 public static void main(final String[] args){
	  String bosun = bottles(99);
	  for (int count = 99; count > 0;){
	   System.out.println(bosun + " on the wall");
	   System.out.println(bosun);
	   System.out.println("Take one down, pass it around");
	   bosun = bottles(--count);
	   System.out.println(bosun + " on the wall\n");
	  }
	 }
	}


