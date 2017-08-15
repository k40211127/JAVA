package main4;

public class test35 {
	public static void main(String[] args) {
		byte b=(byte)65;
		short s=(short)123;
		int i=(int)123L;
		long l=(long)1.23F;
		float f=(float)1.23D;
		char c1=(char)65L;
		char c2=(char)s;
		char c3=(char)b;
		byte b1=(byte)c3;
		
		System.out.println(b);   //輸出 65
		System.out.println(s);   //輸出 123
		System.out.println(i);    //輸出 123
		System.out.println(l);    //輸出 1
		System.out.println(f);    //輸出 1.23
		System.out.println(c1);  //輸出 A 
		System.out.println(c2);  //輸出 {
		System.out.println(c3);  //輸出 A 
		System.out.println(b1);  //輸出 65
	}
}
