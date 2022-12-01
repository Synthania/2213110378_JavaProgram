import javax.swing.*;
import java.util.*;
public class Example_403 {
     public static void main(String[] args) {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.print("Input a sentence : ");
    	 String sentence = scan.nextLine();
    	 while(!sentence.endsWith(".")) {
    		 System.out.print("Input a sentence, agian: ");
    		 sentence = scan.nextLine();
    	 }
    	 System.out.println();
    	 int spaceofWord = 0;
    	 for(int i =0; i<sentence.length();i++) {
    		 if(sentence.charAt(i)==' ') {
    			 spaceofWord++;
    		 }
    	 }
    	 System.out.println("This sentence has "+spaceofWord+" spacebar.");
    	 System.out.println("This sentence has "+(spaceofWord+1)+" words.");
     }
}
