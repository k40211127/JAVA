package main4;

public class test39 {
	public static void main(String[] args) {
		float f1=(float)1234.5678;        //�����j���૬
		float f2=(float)1.2345678e3;    //�����j���૬
		System.out.println(f1);              //��X 1234.5678
		System.out.println(f2+"\n");              //��X 1234.5678

		int i=1/2;
		float f=10/3;
		double d=10.0/3;
		System.out.println(i);    //��X 0
		System.out.println(f);    //��X 3.0
		System.out.println(d);   //��X 3.3333333333333335
	}
}
