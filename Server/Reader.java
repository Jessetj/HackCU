import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

// ThatPartHACKCU Assignment
// Author: Amanuel Bulbula
// Date: Feb 22, 2020
// Class: CS165
// Email: amanuelb@rams.colostate.edu

public class Reader {

	public static void reader(String[] args) throws IOException {
		File f = new File("hackCUpowerpoint.txt");
		Scanner sc = new Scanner(f);
		
		String sameW [] = null;
		int wordC = 0;
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String x = "";
	    
		while((x = br.readLine()) != null) {
			sameW = s.split(" ");
			sc += sameW.length;
		}
		fr.close;
		System.out.println("Number of words in: " + wordC);
		
	}
}
