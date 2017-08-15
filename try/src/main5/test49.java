package main5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test49 {
	public static void main(String[] args) {
		File f = new File("testF.txt");
		if(f.exists()==false){
			try{
				f.createNewFile();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		try {
			FileWriter fWriter = new FileWriter(f);
			BufferedWriter out = new BufferedWriter(fWriter);
			out.write("Hello");
			out.close();
		} catch (Exception e){
			e.printStackTrace();
		}
			
	}
}
