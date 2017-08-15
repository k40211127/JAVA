package main3;

import java.util.Scanner;

public class test27 {
	public static void main(String[] args) {
		
		float number = (float) Math.random()*1000.0f;
		//double number2 = Math.random();
		// float = 單經度  		double = 倍經度  
		int number2 = (int)number;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		
		while (true){
			if (guess > number2){
				System.out.println("再小一點");
			}
			else if (guess < number2){
				System.out.println("再大一點");
			}
			else{
				System.out.println("BINGO"); break;
			}
			guess = scanner.nextInt();
		}
	}
}
