package io_test;

public class QuickSortt {
	static int[] num = {41,24,76,11,45,64,21,69,19,36};
	
	public static void main(String[] args) {
		quick_sort();
		for (int i:num) { System.out.print(i + " "); }
	}
	public static void quick_sort(){
		sort(0,num.length-1);
	}
	
	public static void sort(int left,int right){
	
		if (left < right){
			int i =left,j= right+1;
			while (true){
				while(i++ < num.length && num[i] < num[left]);
				while(j-- >= 0 && num[j] > num[left]);
				if (i >= j ) break; 
				swap(i,j);
			}
			swap(left,j);
			sort(left, j - 1);
			sort(j + 1 , right);
		}                 
	}
	
	public static void swap(int i , int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;	
	}
}
