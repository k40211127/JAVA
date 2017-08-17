package homework;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Read_Random_Order_Sum {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//homework//xy.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int num = Integer.parseInt(br.readLine()); 
		double xy[][] = new double[num][2];        
		
		String temp="",bf[];
		double temp2;
		int count = 0;
		while(count < num){        
			temp = br.readLine();  
			bf = temp.split(" ");  
			for(int i=0;i<2;i++){  
				xy[count][i] = Double.parseDouble(bf[i]); 
			}
			count++;
		}
		fr.close();
		br.close();

		
		Random ran = new Random();          
		/*int[] number = new int[num];		
		for (int a=0; a<number.length;++a) {
		    int i = 0;
		    pick:
		    while (i == 0) {
		        i = ran.ints(1, num+1).findFirst().getAsInt();
		        for (int b = 0; b < a; ++b) {
		            if (number[b] == i) {
		                i = 0;
		                continue pick;
		            }
		        }
		        number[a] = i; 
		    }
		}*/
		
		Random ran2 = new Random();
		int ran_num;
		int [] num1 = new int[num];
		for (int i=0;i<num;i++){ num1[i]=i;}
		int [] order = new int[num];
		
		for (int i=0;i<order.length;i++){
			ran_num= ran2.nextInt(num-i);
			order[i]=num1[ran_num];	
			//System.out.print(order[i]+" ");
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];
			}
		}

		
		double sum=0.0;
			for (int i=0;i<xy.length-1;i++){					
				sum += Math.sqrt(Math.pow(xy[order[i]][0]-xy[order[i+1]][0], 2)+Math.pow(xy[order[i]][1]-xy[order[i+1]][1], 2));
			}
			sum += Math.sqrt(Math.pow(xy[order[num-1]][0]-xy[order[0]][0], 2)+Math.pow(xy[order[num-1]][1]-xy[order[0]][1], 2));
			System.out.println("\n"+"距離總和："+sum);
			
		
		//  Math.sqrt(36); 根號
		//  Math.pow(2,2); a的b次方
		
		//  一. 讀檔； 10筆資料(練習檔)、
		//	二. 順序； 隨機點(原點)與下一個隨機連接點(類推)
		//	三. 總和；一直到10個座標都連完1次, 接著在,連回第一個隨機點(原點).
		//  四. 重複運算；
	}
}
