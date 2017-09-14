package SCF;
import java.awt.Label;
import java.io.*;
import java.util.Random;

import homework.Swap;
public class SCF {
	
	
	public SCF(int[] Parent1,int[] Parent2){
		
		int Parent3[]=new int[9];
		
		System.out.print("Parent3：");
		for (int i=0;i<9;i++) {
			if(Parent1[i] == Parent2[i]) {Parent3[i]=Parent1[i];}else {Parent3[i]=9;}
			System.out.print(Parent3[i]+" ");
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
		
		for (int i=select[0];i<=select[1];i++) {
			Parent3[i] = Parent1[i];
		}
		System.out.print("Parent3：");
		for (int i=0;i<9;i++) {	System.out.print(Parent3[i]+" ");}	
		
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
				if (Parent3[j] == 9) {Parent3[j] = Integer.parseInt(bf[i]);break;}
			}
		}System.out.println();
		
		System.out.print("Parent3：");
		for (int i=0;i<9;i++) {	System.out.print(Parent3[i]+" ");}	System.out.println();

	}	
	
	
	public static void main(String arg[]) throws IOException {
		FileReader fr = new FileReader("src//homework//parent1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int Parent1[]=new int[9],Parent2[]=new int[9],Parent3[]=new int[9];
		String temp="",bf[];
		
		temp = br.readLine();	bf = temp.split(" ");	for (int i=0;i<bf.length;i++) {	Parent1[i] = Integer.parseInt(bf[i]);}
		temp = br.readLine();	bf = temp.split(" ");	for (int i=0;i<bf.length;i++) {	Parent2[i] = Integer.parseInt(bf[i]);}
		for (int i=0;i<9;i++) {	System.out.print(Parent1[i]+" ");}	System.out.println();
		for (int i=0;i<9;i++) {	System.out.print(Parent2[i]+" ");}	System.out.println();
		
		for (int i=0;i<9;i++) {
			if(Parent1[i] == Parent2[i]) {Parent3[i]=Parent1[i];}else {Parent3[i]=9;}
			System.out.print(Parent3[i]+" ");
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
		
		for (int i=select[0];i<=select[1];i++) {
			Parent3[i] = Parent1[i];
		}
		for (int i=0;i<9;i++) {	System.out.print(Parent3[i]+" ");}	
		
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
		
		bf = str.split(" ");  
		for (int i=0;i<bf.length;i++) {
			for (int j=0;j<Parent3.length;j++) {
				if (Parent3[j] == 9) {Parent3[j] = Integer.parseInt(bf[i]);break;}
			}
		}System.out.println();
		
		for (int i=0;i<9;i++) {	System.out.print(Parent3[i]+" ");}	System.out.println();
		
	}
}
