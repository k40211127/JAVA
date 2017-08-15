package main5;

import java.util.Scanner;

public class test48 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入學生分數: "); 
        int scoreOfStudent = scanner.nextInt(); 
        System.out.println("該生是否及格? " + (scoreOfStudent >= 60 ? '是' : '否'));
	}
}
