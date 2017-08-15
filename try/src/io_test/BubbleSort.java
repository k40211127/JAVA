package io_test;

public class BubbleSort {
	static int [] num = {23,11,12,33,44,55};
	public static void main(String[] args) {
		bubble_sort();
		for(int i : num){ System.out.print(i + " "); }System.out.println("");
		bubble_sortt();
		for(int i : num){ System.out.print(i + " "); }
	}
	public static void bubble_sort(){		
		int temp;
		for (int i=0;i<=num.length-1;i++){
			for (int j=0;j<=num.length-1;j++){
				if (num[i]>num[j]) swap(i,j);
			}
		}	
	}
	private static void bubble_sortt() {
		int temp;
		for (int i=num.length-1;i>=0;i--){  
			for (int j=0;j<=i;j++){         
				if (num[i]<num[j]) swap(i,j);
			}
		}
	}
	
	public static void swap(int i , int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}
