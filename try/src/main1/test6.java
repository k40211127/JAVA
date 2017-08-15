package main1;

public class test6 {
	public static void main(String args[]){
		int x=5,y=2,z=3;
		if (x>y & x>z){
			System.out.println(x);
		}
		if (y>z & y>x){
			System.out.println(y);
		}
		if (z>x & z>y){
			System.out.println(z);
		}		
				/* 優化邏輯運算時間*/
		
		if (x>y && x>z){
			System.out.println(x);
		}
		if (y>z && y>x){
			System.out.println(y);
		}
		if (z>x && z>y){
			System.out.println(z);
		}
	}
}
