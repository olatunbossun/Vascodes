package bottles;
import java.text.MessageFormat;
import java.util.Scanner;

public class Beer {
	 public static String song(final int n){
	  return MessageFormat.format("{0,choice,0#No more bottles|1#1 bottle|2#{0} bottles} of beer", n);
	 }

   public static StringBuilder song(){
     StringBuilder st = new StringBuilder();
     for (int count = 99; count > 0;){
       st.append(song(count) + " on the wall, " + song(count) + "\n");
       st.append("Take one down, pass it around, " + song(--count) + " on the wall\n\n");
       if (count == 0) {
         st.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall\n");
       }
     }
     return st;
   }

   public static void main(final String[] args){
     System.out.println(song());
   }
}


