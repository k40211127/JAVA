package main5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test41 {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("�п�J�@�C��r�A�i�]�A�ť�: "); 
        String text = bufferedReader.readLine(); 
        System.out.println("�z��J����r: " + text);
	}
}
