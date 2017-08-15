package io_test;

import java.io.*;


public class test2 {
	public static void main(String[] args) throws IOException {
		//ºg¿…
		FileWriter fw = new FileWriter("src//main5//abc.txt");
		fw.write("test \nasijd \nmi4"); 
		fw.flush();
		fw.close();
		
		//≈™¿…
		FileReader fr = new FileReader("src//main5//abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()){
			System.out.println(br.readLine());
		}
		fr.close();
		br.close();
		
		//∂}∑s¿…
		FileWriter nw = new FileWriter("src//main5//ccc.txt");
		nw.write("apple \nbenana \norenge \nnew");
		nw.flush();
		nw.close();
		
		//≈™∑s¿…
		FileReader nr = new FileReader("src//main5//ccc.txt");
		BufferedReader bnr = new BufferedReader(nr);
		
		while(bnr.ready()){
			System.out.println(bnr.readLine());
		}
	}
}
