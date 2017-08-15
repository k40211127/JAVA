package main4;

public class test37 {
	public static void main(String[] args) {
		byte b=127;  //int 轉 byte
		short s=b;     //byte 轉 short
		int i=s;          //short 轉 int
		long l=i;        //int 轉 long
		float f=l;       //long 轉 float
		double d=f;  //float 轉 double
		System.out.println(b);   //輸出 127
		System.out.println(s);   //輸出 127
		System.out.println(i);    //輸出 127
		System.out.println(l);    //輸出 127
		System.out.println(f);    //輸出 127.0
		System.out.println(d);   //輸出 127.0
	}
}
