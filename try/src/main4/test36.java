package main4;

public class test36 {
	public static void main(String[] args) {
		char c='A';
		byte b='A';   //�� b=c ���� 
		short s='A';  //�� b=c ����
		int i=c;
		long l=c;
		float f=c;
		double d=c;
		System.out.println(b);  //��X 65
		System.out.println(s);  //��X 65
		System.out.println(c);  //��X A
		System.out.println(i);   //��X 65
		System.out.println(l);   //��X 65
		System.out.println(f);   //��X 65.0
		System.out.println(d);  //��X 65.0
	}
}
