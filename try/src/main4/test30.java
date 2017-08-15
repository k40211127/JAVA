package main4;

public class test30 {
	public static void main(String[] args) {
		char ch1='A';
		char ch2='台';
		char ch3='\u0041';
		char ch4='\101';
		int i1=ch1;  //自動轉型為 int
		int i2=ch2;  //自動轉型為 int
		int i3=ch3;  //自動轉型為 int
		int i4=ch4;  //自動轉型為 int
		System.out.println(ch1);   //輸出 A
		System.out.println(ch2);   //輸出 台
		System.out.println(ch3);   //輸出 A
		System.out.println(ch4);   //輸出 A
		System.out.println(i1);      //輸出 65
		System.out.println(i2);      //輸出 21488
		System.out.println(i3);      //輸出 65
		System.out.println(i4);      //輸出 65
	}
}
