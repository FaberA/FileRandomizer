package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		Random random = new Random();
		PrintWriter output = new PrintWriter("randomized_list.txt");
		
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}

		while(!lines.isEmpty()){
			output.println(lines.remove(random.nextInt(lines.size())));
		}
		
		output.close();
		input.close();
	}

}
