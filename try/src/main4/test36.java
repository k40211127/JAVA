package main4;

public class test36 {
	public static void main(String[] args) {
		char c='A';
		byte b='A';   //用 b=c 不行 
		short s='A';  //用 b=c 不行
		int i=c;
		long l=c;
		float f=c;
		double d=c;
		System.out.println(b);  //輸出 65
		System.out.println(s);  //輸出 65
		System.out.println(c);  //輸出 A
		System.out.println(i);   //輸出 65
		System.out.println(l);   //輸出 65
		System.out.println(f);   //輸出 65.0
		System.out.println(d);  //輸出 65.0
	}
}
