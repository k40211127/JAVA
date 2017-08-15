package io_test;

public class SelectionSort {
	static int [] num = {123456,123,12,33,44,55};
	public static void main(String[] args) {
		selection_sort();
		 for(int i : num){
		    System.out.print(i + " ");
		 }
	}
		//選擇排序法
	public static void selection_sort(){
		for(int i = 0; i < num.length - 1; i++) {		 
			int m = i;		 
			for(int j = i + 1; j < num.length; j++){ // 找出最小值	 
	               if(num[j] < num[m]) m = j;		 
	        }		  
	        if(i != m){	// 與最前面一筆(未排序)的交換  
	           int temp = num[i];		 
	           num[i] = num[m];		 
	           num[m] = temp;		 
	        }   		 
	    }
	}
}
