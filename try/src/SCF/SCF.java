package SCF;

import java.util.Random;

public class SCF {
	public SCF(int[] Parent1,int[] Parent2){
		
		int Parent3[]=new int[9];
		System.out.print("Parent3：");
		for (int i=0;i<9;i++) {
			if(Parent1[i] == Parent2[i]) {Parent3[i]=Parent1[i];}else {Parent3[i]=-1;}
			if(Parent3[i] == -1) {System.out.print("\t");}
			else {System.out.print(Parent3[i]+"\t");}
		}
		
		Random ran = new Random(); int ran_num;	int [] num1 = new int[Parent2.length];	for (int i=0;i<num1.length;i++){num1[i]=i;}
		int [] select = new int[Parent3.length];	  //宣告第二個用作記錄順序的陣列 
		
		for (int i=0;i<2;i++){	
			ran_num= ran.nextInt(num1.length-i);	
			select[i]=num1[ran_num];
			for (int j=ran_num;j<select.length-i-1;j++){
				num1[j] = num1[j+1];
			}
		}
		if (select[0] > select[1]) {int temp1 = select[0]; select[0]=select[1]; select[1]=temp1;}
		System.out.println("選取格：" + select[0] + " " + select[1]);
		
		for (int i=select[0];i<=select[1];i++) {Parent3[i] = Parent1[i];}
		
		System.out.print("Parent3：");
		for (int i=0;i<9;i++) {
			if(Parent3[i] == -1) {System.out.print("\t");}
			else {System.out.print(Parent3[i]+"\t");}
		}
		
		String str="";
		for (int i=0;i<9;i++) {
			int count=0;
			for (int j=0;j<9;j++) {
				if (Parent2[i]!=Parent3[j]) {count++;}
				else {break;}
				if (count==9) {str += Parent2[i] +" ";}
			}
		}
		System.out.print("缺少了：" + str);
		String bf[];
		
		bf = str.split(" ");  
		for (int i=0;i<bf.length;i++) {
			for (int j=0;j<Parent3.length;j++) {
				if (Parent3[j] == -1) {Parent3[j] = Integer.parseInt(bf[i]);break;}
			}
		}System.out.println();
		
		System.out.print("Parent3：");
		for (int i=0;i<9;i++) {	System.out.print(Parent3[i]+"\t");}	System.out.println();
			
	}	
}
