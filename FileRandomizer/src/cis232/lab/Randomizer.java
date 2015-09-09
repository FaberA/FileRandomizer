package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		Random r = new Random(); // instantiate randomizer
		PrintWriter randomOutput = new PrintWriter("random_list.txt"); // open new file to write to
		
		
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}
		
		while(!lines.isEmpty()){ //while the array is NOT empty
			int random = r.nextInt(lines.size()); // generate random int dependent on elements in array
			randomOutput.println(lines.remove(random)); // write new lines from array to file and remove from array for next loop
		}
		/*For testing purposes, output all the lines
		for(String line : lines){
			System.out.println(line);
		}
		*/
		randomOutput.close();
		input.close();
	}

}
