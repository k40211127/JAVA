package main1;

public class test8 {
	public static void main(String args[]){
		int n=2;
		if (n % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		int x=5,y=2,z=3;
		if (x>y){
			if (x>z){
				System.out.println(x);
			}
			else{
				System.out.println(z);
			}
		}
		else{
			if (y>z){
				System.out.println(y);
			}
			else{
				System.out.println(z);
			}
		}
		
		
	}
}
