package main3;

import java.util.Scanner;

public class test25 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		int i = 1;
		while(i<=2){
		switch(day){
			case 1:
				System.out.println("一");
				break;
			case 2:
				System.out.println("二");
				break;
			case 3:
				System.out.println("三");
				break;
			case 4:
				System.out.println("四");
				break;
			case 5:
				System.out.println("五");
				break;
			case 6:
				System.out.println("六");
				break;
			case 7:
				System.out.println("日");
				break;
			}
		i++;
		day = scanner.nextInt();
		}				
	}
}
