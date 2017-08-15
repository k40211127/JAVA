package main3;

public class test24 {
	public static void main(String[] args) {
		int lucky[] = {3,5,-2,-6,4,0,8};
		int cumulative[] = new int [lucky.length];
		
		cumulative[0] = lucky[0];
		System.out.println(cumulative[0]);
		for (int i=1;i<=lucky.length-1;i++){
			cumulative[i] = cumulative[i-1] + lucky[i];
			System.out.println(cumulative[i]);
		}
	}
}
