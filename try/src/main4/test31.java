package main4;

public class test31 {

	public static void main(String[] args) {

		int i1=15;
		int i2=017;
		int i3=0xf; 
		int i4=0b1111;            // �G�i���ܪk : Java 7 �~���䴩
		int i5=9_000_210;         // �H���u�N��d��Ƥ��q (Java 7 �~���䴩)
		System.out.println(i1);   // ��X 15
		System.out.println(i2);   // ��X 15
		System.out.println(i3);   // ��X 15
		System.out.println(i4);   // ��X 15
		System.out.println(i5);   // ��X 9000210
	}

}
