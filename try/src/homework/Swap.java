package homework;

import java.util.Random;

public class Swap {	

	public Swap(int[] num) {//建構子
	//可以定義無參數的建構方法，或具有參數的建構方法，程式在運行時，會根據配置物件時所指定的引數資料型態等來決定，該使用哪一個建構方法。
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
