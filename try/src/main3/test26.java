package main3;

import java.util.Scanner;

public class test26 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		//�bif �P�_ �@�Ӧr��O�_����t�@�Ӧr�� �n��equals
		if (string.equals("scissors"))
		{
			System.out.println("stone");
		}
		else if (string.equals("paper"))
		{
			System.out.println("scissors");
		}
		else
		{
			System.out.println("paper");
		}
	}
}
