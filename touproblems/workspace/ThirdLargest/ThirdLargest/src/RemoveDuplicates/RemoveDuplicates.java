package RemoveDuplicates;

import java.io.*;


public class RemoveDuplicates {



	public static void main(String[] args) throws IOException {


		        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//captures user input
		        System.out.print("Enter any word : ");
		        String sample =reader.readLine();
		        int l = sample.length();//assigns length of the word
		        char text;
		        String ans=""; //holds the answer

		        for(int i=0; i<l; i++)
		        {
		            text = sample.charAt(i);
		            if(text!=' ') //compares the character occurrence
		                ans = ans + text;
		            sample = sample.replace(text,' '); //Replacing all occurrence of the current character by a space
		        }

		       System.out.println("Word Is : " + ans);
		    }


	}


