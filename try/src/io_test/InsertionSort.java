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
			int tmp = num[i];	 //�����ثe�n���J����				
	           int datum = i - 1;	 //���J�Ȫ��e�@����Ƭ�����I		
	           while(datum > -1 && tmp < num[datum]){	 //�M���񴡤J���٭n�p���A�Y�_�h�ȩ����		
	                num[datum+1] = num[datum];			
	                datum--;			
	           }				
	        num[datum+1] = tmp; //datum�]���ŦXwhile�Ӹ��X�A�ҥHdatum�e�@�����̫�ŦX���ȡA���J
	    }		                 
	}
}
