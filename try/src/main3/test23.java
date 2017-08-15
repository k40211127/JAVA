package main3;

public class test23 {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 5;		a[2] = 3;		a[4] = 9;
		System.out.println(a[0]);
		
		int message[] = {31,45,35,67,89,39};
		boolean dinner[] = new boolean[message.length];
		for (int i=0;i<message.length;i++){
			dinner[i] = (message[i] > 30 && message[i] <40);
		    /*	if(message[i]>30 && message[i] <40){
					dinner[i] = true;
				} else {
					dinner[i] = false;
				}
			*/
			System.out.println(dinner[i]);
		}
	}
}
