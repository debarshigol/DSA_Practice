package Practice_Problrm;
import java.util.*;

public class StringOperation {

	//Count the number of Vowel, Consonent and Digit
	    public static void main(String args[]){
	        String s="Gupta Is Gandu No 1678";
	        int vowels=0,consonants=0,digits=0;
	        String se=s.toLowerCase();
	        for(int i=0;i<se.length();i++){
	             char ch = se.charAt(i);
	          if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            } else if (ch >= '0' && ch <= '9') {
	                digits++;
	            }
	        }
	        System.out.println("No of digit is - "+ digits);
	         System.out.println("No of vowels is - "+ vowels);
	          System.out.println("No of consonants is - "+ consonants);
	    }
	 
	}
