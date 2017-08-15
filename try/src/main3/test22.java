package main3;

public class test22 {
	public static void main(String[] args) {
		int message[] = {24,56,90,18,45,35,29,91};
		int count = 0;
		for (int i =0;i< message.length;i++){
			if (message[i] > 30 && message[i] < 40){
				count++;
			}
		}
		System.out.println(count);
	}
}
