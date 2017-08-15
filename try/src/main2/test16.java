package main2;

public class test16 {
	public static void main(String args[]){
		int n = 1234;
		for ( ; n > 0; n=n/10){
			int r = n%10;
			System.out.println(r);
		}
	}
}
