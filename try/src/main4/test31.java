package main4;

public class test31 {

	public static void main(String[] args) {

		int i1=15;
		int i2=017;
		int i3=0xf; 
		int i4=0b1111;            // 二進制表示法 : Java 7 才有支援
		int i5=9_000_210;         // 以底線代表千位數分段 (Java 7 才有支援)
		System.out.println(i1);   // 輸出 15
		System.out.println(i2);   // 輸出 15
		System.out.println(i3);   // 輸出 15
		System.out.println(i4);   // 輸出 15
		System.out.println(i5);   // 輸出 9000210
	}

}
