package homework;

import java.util.Random;

public class Swap {
	public static void main(int[] num) {		
		System.out.print("原序列：");	for (int i=0;i<num.length;i++) {System.out.print(num[i]+" ");}		
		
		Random ran = new Random();    int ran_num;	int [] num1 = new int[num.length];	for (int i=0;i<num.length;i++){num1[i]=i;}
		int [] order = new int[num.length];	  //宣告第二個用作記錄順序的陣列 
		System.out.print("交換格：");
		
		for (int i=0;i<2;i++){	
			ran_num= ran.nextInt(num.length-i);	
			order[i]=num1[ran_num];		
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];
			}
		}
		if (order[0] > order[1]) {int temp = order[0]; order[0]=order[1]; order[1]=temp;}
		System.out.println(order[0] + " " + order[1]);
		
		
		int temp2 = num[order[0]];		
		num[order[0]] = num[order[1]];
		num[order[1]] = temp2;
		
		System.out.print("交換後：");
		for (int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
}
