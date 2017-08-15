package io_test;

public class QuickSort {
	static int [] num = {41,24,76,11,45,64,21,69,19,36};
	public static void main(String[] args) {
		quick_sort();
		for(int i : num) { System.out.print(i + " "); }
	}

	public static void quick_sort(){ //Quick Sort Start
		sort(0,num.length-1);
	}

	public static void sort(int left, int right){ 	//Recursion
		        if(left < right){ // 確定是否可以排序
		            int i = left;
		            int j = right + 1;
		            
		            while(true){
		                while(i+1 < num.length && num[++i] < num[left]);  // 向右找，直到找到比基準點大的
		                while(j-1 >= 0 && num[--j] > num[left]);          // 向左找，直到找到比基準點小的
		                	if(i >= j) break;
		                	swap(i,j);
		            }
		            swap(left,j); //       基準點與j交換(這時候的j已經跑到比基準點小的數了)		            
		            sort(left, j - 1);//   遞迴排序基準點左半邊		            
		            sort(j + 1 , right);// 遞迴排序基準點右半邊
		        }
		    }
	public static void swap(int i, int j){ 
		 int temp = num[i];
		 num[i] = num[j];  //  交換
		 num[j] = temp;
	}
}