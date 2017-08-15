package main2;

public class test12 {
	public static void main(String args[]){
		int i=1,n=8,m=2,y=m;
		while (i<=n){
			if (i % 2 != 0){
				System.out.println(i);				
			}
			m=m*y;
			i++;
		}
		System.out.println(m);
	}
}
