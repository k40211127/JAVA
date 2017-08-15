package main2;

public class test14 {
	public static void main(String args[]){
		int a = 333,b = 111;
		while(true){
			if (a<b){
				int temp = a;
				a = b ;
				b = temp;
			}
			int c = a % b;
			if (c==0) break;
			a=b;
			b=c;
		}		
		System.out.println(b);
	}
}

