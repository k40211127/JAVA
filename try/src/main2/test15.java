package main2;

public class test15 {
	public static void main(String args[]){
		int n=10,x=5,y=2; //����n  �դѪ�x �ߤW��y
		int h= 0,d=0;
		
		while(h<=n){
			d++;
			h = h+x;
			if (h>=n){break;}
			h = h-y;
		}
		System.out.println(d+"��");
	}
}
