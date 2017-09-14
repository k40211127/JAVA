package SCF;

import java.util.Random;
import SCF.SCF;

public class Call_SCF {
	public static void main(String[] args) {
				
		int[] Parent1 = new int[9];
		int[] Parent2 = new int[9];
		
		System.out.print("Parent1：");	Random_gene(Parent1);	System.out.println();
		System.out.print("Parent2：");	Random_gene(Parent2);	System.out.println();
		SCF call_scf = new SCF(Parent1,Parent2);
	}
	
	
	private static void Random_gene(int Parent[]) {
		Random ran = new Random();       	 //宣告亂數
		int ran_num;						 //接收亂數產生的值
		int [] num1 = new int[Parent.length];//陣列0~9筆(練習檔第一筆)
				
		for (int i=0;i<Parent.length;i++){num1[i]=i;}	//賦予第一個num1[0~9]陣列0~9的數值
		for (int i=0;i<Parent.length;i++){	 //共執行10次(筆)
			ran_num= ran.nextInt(Parent.length-i);	    //亂數-i 是因為 假設一開始0~9(亂數範圍) 每取走1個值範圍就減少1筆(0~8)..(0~7)..類推
			Parent[i]=num1[ran_num];		 //將num1[ran_num]內的值取走 給order[0]..1..2類推
			System.out.print(Parent[i]+" "); //觀看順序
			for (int j=ran_num;j<Parent.length-i-1;j++){
				num1[j] = num1[j+1];		 //每取走一筆 將後面每一筆往前挪1格
			}
		}
	}
}
