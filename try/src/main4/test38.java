package main4;

public class test38 {
	public static void main(String[] args) {
		byte b1=127;                //�Ȱ줺�۰��૬
		byte b2=(byte)128;        //�Ȱ�~�ݱj���૬
		short s1=32767;            //�Ȱ줺�۰��૬
		short s2=(short)32768;  //�Ȱ�~�ݱj���૬
		System.out.println(b1);   //��X 127
		System.out.println(b2);   //��X -128
		System.out.println(s1);   //��X 32767
		System.out.println(s2);   //��X -32768
		
	}
}
