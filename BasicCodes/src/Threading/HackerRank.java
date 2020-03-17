package Threading;

import java.util.ArrayList;

public class HackerRank {
public static void main(String args[]) {
	
	String sentence="he had had";
	String words[] = sentence.split(" ");  
    String duplicate="";
  for(int i = 0; i < words.length-1; i++) {   
      for(int j = i+1; j < words.length; j++) {  
          if(words[i].equals(words[j])) {  
              //Set words[j] to 0 to avoid printing visited word  
             duplicate= words[j];
             break;
          }  
      }  
System.out.println(duplicate);
	
}
}
}
