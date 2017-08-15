package io_test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//main5//abc.txt");
		BufferedReader br = new BufferedReader(fr);
		while(br.ready()){
			System.out.println(br.readLine());
		}
		fr.close();
		br.close();
		
		
		FileReader frr = new FileReader("src//main5//abc.txt");
		FileWriter fww = new FileWriter("src//main5//abcc.txt");
		BufferedReader brr = new BufferedReader(frr);
		BufferedWriter bww = new BufferedWriter(fww);
		String a="";
		while(brr.ready()){
			String b = brr.readLine();
			System.out.println(b);
			a= a + b;
		}
		frr.close();
		brr.close();
		bww.write(a);
		bww.flush();
		bww.close();
		
		FileReader fr2 = new FileReader("src//main5//abc.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		while(br2.ready()){
			System.out.println(br2.readLine());
		}
		
		
		
		
		
	}
}
