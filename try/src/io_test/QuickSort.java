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
		        if(left < right){ // �T�w�O�_�i�H�Ƨ�
		            int i = left;
		            int j = right + 1;
		            
		            while(true){
		                while(i+1 < num.length && num[++i] < num[left]);  // �V�k��A����������I�j��
		                while(j-1 >= 0 && num[--j] > num[left]);          // �V����A����������I�p��
		                	if(i >= j) break;
		                	swap(i,j);
		            }
		            swap(left,j); //       ����I�Pj�洫(�o�ɭԪ�j�w�g�]������I�p���ƤF)		            
		            sort(left, j - 1);//   ���j�Ƨǰ���I���b��		            
		            sort(j + 1 , right);// ���j�Ƨǰ���I�k�b��
		        }
		    }
	public static void swap(int i, int j){ 
		 int temp = num[i];
		 num[i] = num[j];  //  �洫
		 num[j] = temp;
	}
}