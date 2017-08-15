package io_test;

public class InsertionSort {
	static int [] num = {123456,123,12,33,44,55};
	public static void main(String[] args) {
		insertion_sort();
		for(int i : num){
			System.out.print(i + " ");
		}
	}
	public static void insertion_sort(){
		for(int i = 1; i < num.length; i++){
			int tmp = num[i];	 //紀錄目前要插入的值				
	           int datum = i - 1;	 //插入值的前一筆資料為基準點		
	           while(datum > -1 && tmp < num[datum]){	 //尋找到比插入值還要小的，若否則值往後推		
	                num[datum+1] = num[datum];			
	                datum--;			
	           }				
	        num[datum+1] = tmp; //datum因不符合while而跳出，所以datum前一筆為最後符合的值，插入
	    }		                 
	}
}
