package main4;

public class test38 {
	public static void main(String[] args) {
		byte b1=127;                //值域內自動轉型
		byte b2=(byte)128;        //值域外需強制轉型
		short s1=32767;            //值域內自動轉型
		short s2=(short)32768;  //值域外需強制轉型
		System.out.println(b1);   //輸出 127
		System.out.println(b2);   //輸出 -128
		System.out.println(s1);   //輸出 32767
		System.out.println(s2);   //輸出 -32768
		
	}
}
