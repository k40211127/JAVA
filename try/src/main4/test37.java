package main4;

public class test37 {
	public static void main(String[] args) {
		byte b=127;  //int �� byte
		short s=b;     //byte �� short
		int i=s;          //short �� int
		long l=i;        //int �� long
		float f=l;       //long �� float
		double d=f;  //float �� double
		System.out.println(b);   //��X 127
		System.out.println(s);   //��X 127
		System.out.println(i);    //��X 127
		System.out.println(l);    //��X 127
		System.out.println(f);    //��X 127.0
		System.out.println(d);   //��X 127.0
	}
}
