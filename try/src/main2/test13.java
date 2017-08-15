package main2;

public class test13 {
	public static void main(String args[]){
		int n=1234;
		while(n>0){
			int r = n % 10;
			int q = n / 10;
			System.out.println(r + "\t" + q);
			n=q;
		}
		
	}
}


