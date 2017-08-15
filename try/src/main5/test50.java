package main5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test50 {
	public static void main(String[] args) throws Exception{
		String file1 = "abc.txt";
		try {
			BufferedReader inFile = new BufferedReader(new FileReader(file1));
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please try again.");
		}
	}
}
