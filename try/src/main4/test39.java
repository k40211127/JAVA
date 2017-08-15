package main4;

public class test39 {
	public static void main(String[] args) {
		float f1=(float)1234.5678;        //必須強制轉型
		float f2=(float)1.2345678e3;    //必須強制轉型
		System.out.println(f1);              //輸出 1234.5678
		System.out.println(f2+"\n");              //輸出 1234.5678

		int i=1/2;
		float f=10/3;
		double d=10.0/3;
		System.out.println(i);    //輸出 0
		System.out.println(f);    //輸出 3.0
		System.out.println(d);   //輸出 3.3333333333333335
	}
}
