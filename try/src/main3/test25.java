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
				System.out.println("�@");
				break;
			case 2:
				System.out.println("�G");
				break;
			case 3:
				System.out.println("�T");
				break;
			case 4:
				System.out.println("�|");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("��");
				break;
			case 7:
				System.out.println("��");
				break;
			}
		i++;
		day = scanner.nextInt();
		}				
	}
}
