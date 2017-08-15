package main2;

public class test17 {
	public static void main(String args[]){
		int x =1;
		for (;x<100;x++){
			if(4*x*x-64*x+256==0){
				break;
			}
		}
		System.out.println(x);
	}
}
