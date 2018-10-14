package algoclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClassMain {

	public static void main(String[] a) throws FileNotFoundException {
		
		/*String name = "Renju George 23";
		TweetDetails twD = new TweetDetails();
				
		String name1[] = name.split(" ");
		
		for (int i = 0; i < name1.length; i++) {
			System.out.println(name1[i]);
			twD.firstName = name1[i];
			twD.lastName = name1[i];
			//twD.num = name1[i];
		}*/
		//File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
		File file = new File("D:\\Courses\\SSDI\\twitter\\JUSTICE2.txt");
		  TweetDetails twD;
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  ArrayList<TweetDetails> list = new ArrayList<TweetDetails>();
		  String st; 
		  try {
			while ((st = br.readLine()) != null) { 
				 String input[] = st.split(" "); 
				 twD= new TweetDetails();
			     twD.userName = input[0];
			     twD.time = input[1];
			     twD.tweet = input[2];
			     twD.retweet_count = input[3];
			     twD.followers = input[4];
			     list.add(twD);
			     
			}
			for (int i = 0; i <list.size(); i++) {
				System.out.println("User "+i);
				System.out.print("\t UserName = "+list.get(i).userName);
				System.out.print("\t Time = "+list.get(i).time);
				System.out.print("\t Tweet = "+list.get(i).tweet);
				System.out.print("\t RetweetCount = "+list.get(i).retweet_count);
				System.out.print("\t Followers = "+list.get(i).followers);
				System.out.println();
				
			}
			
			
			
			for (int i = 0; i <list.size(); i++) {
				System.out.print("\t Followers = "+list.get(i).followers);
				System.out.println();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  } 
		//System.out.println(name.split(" "));
	}
