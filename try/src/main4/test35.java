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
		
		System.out.println(b);   //��X 65
		System.out.println(s);   //��X 123
		System.out.println(i);    //��X 123
		System.out.println(l);    //��X 1
		System.out.println(f);    //��X 1.23
		System.out.println(c1);  //��X A 
		System.out.println(c2);  //��X {
		System.out.println(c3);  //��X A 
		System.out.println(b1);  //��X 65
	}
}
