import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vinuri {
	
   public static void main(String args[]) throws FileNotFoundException {
	   
     
      Scanner input1 = new Scanner(System.in);
	  
      System.out.println("Enter the word:");
      String word = input1.next();//getting the word from the user
	  
      boolean flag = false;
      int count = 0;

      Scanner input2 = new Scanner(new FileInputStream("example.txt"));//didn't specify the absolute path since the both files contain in the same folder.
	  
      while(input2.hasNextLine()) {
         String line = input2.nextLine();
         if(line.indexOf(word)!=-1) {
            flag = true;
            count = count+1;
         }
      }
	  
      if(flag) {
         System.out.println("This txt file contains the word - "+ word);
		 System.out.println("Occurences : "+count);
      } else {
         System.out.println("This txt file doesn't contain the word you entered:(");
      }
   }
}