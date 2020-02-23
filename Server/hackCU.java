package hackCU;

import java.util.ArrayList;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hackCU {
	
	
	public static double percent(int word, int wordCount){
		return ((word * 100) / wordCount);
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println(percent(2, 10) + "%");
		
		String line = "";
		String word = "";
		int count = 0;
		int maxCount = 0;
		ArrayList<String> words = new ArrayList<String>();  
				
		File file = new File("/Users/ilianacastillon/Desktop/hackCUpowerpoint.txt");
		
		
		
		BufferedReader bReader = new BufferedReader(new FileReader(file));
		
		line = bReader.readLine();
		
		while(bReader != null) {
			String string [] = line.toLowerCase().split(" ");
			for(String s : string) {
				words.add(s);
			}
		}
		for (int i = 0; i < words.size(); i++) {
			count = 1;
			for(int j = i + 1; j < words.size(); j++) {
				
				if(words.get(i).equals(words.get(i))) {
					count ++;
				}
			}
			if(count > maxCount) {
				maxCount = count;
				word = words.get(i);
			
			}
		}
		
		System.out.println("Most repeated word: " + word);    
		bReader.close();  
			

	}

}
