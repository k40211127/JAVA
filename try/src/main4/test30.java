package main4;

public class test30 {
	public static void main(String[] args) {
		char ch1='A';
		char ch2='�x';
		char ch3='\u0041';
		char ch4='\101';
		int i1=ch1;  //�۰��૬�� int
		int i2=ch2;  //�۰��૬�� int
		int i3=ch3;  //�۰��૬�� int
		int i4=ch4;  //�۰��૬�� int
		System.out.println(ch1);   //��X A
		System.out.println(ch2);   //��X �x
		System.out.println(ch3);   //��X A
		System.out.println(ch4);   //��X A
		System.out.println(i1);      //��X 65
		System.out.println(i2);      //��X 21488
		System.out.println(i3);      //��X 65
		System.out.println(i4);      //��X 65
	}
}
