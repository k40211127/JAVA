package homework;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Read_Random_Order_Summ {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//homework//xyy.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int num = Integer.parseInt(br.readLine());
		double xy[][] = new double[num][2];
		String temp="",bf[];
		int count = 0,total=1;
		
		while(total <=num){
			temp = br.readLine();
			bf = temp.split(" ");
			for(int i=0 ; i<bf.length;i++){	
				xy[count][i] = Double.parseDouble(bf[i]);
			}
			count++;total++;
		}
		fr.close();
		br.close();
		
		/*for (double i[]:xy){
			for (double i2:i){
				System.out.print(i2+"\t");
			}
			System.out.print("\n");
		}*/
		
		//int number[] = new int[num];
		
		Random ran = new Random();
		int[] number = new int[num];
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
		}
		for (int i=0;i<number.length;i++){
			number[i] = number[i]-1;
			System.out.print(number[i]+" ");
		}
		System.out.println();
		//System.out.println(Math.sqrt(36));//開根號
		//System.out.println(Math.pow(2, 10));//a取b次方
		//System.out.println(Math.abs(-10));
		for (int i=0;i<xy.length;i++){
			for (int j=0;j<2;j++){
				xy[i][j] = Math.pow(xy[i][j],2);//System.out.print(xy[i][j]+"\t");
			}	
			//System.out.println();
		}
		
		double sum=0.0;
		
			for (int i=0;i<xy.length-1;i++){
					//System.out.print(Math.sqrt(Math.abs(xy[i][0]-xy[i+1][0]+(xy[i][1]-xy[i+1][1])))+"\n");
					//System.out.print(Math.sqrt(Math.abs(xy[number[i]][0]-xy[number[i+1]][0])+Math.abs((xy[number[i]][1]-xy[number[i+1]][1])))+"\n");
					sum += Math.sqrt(Math.abs(xy[number[i]][0]-xy[number[i+1]][0])+Math.abs((xy[number[i]][1]-xy[number[i+1]][1])));
			}
			sum += Math.sqrt(Math.abs(xy[number[num-1]][0]-xy[number[0]][0])+Math.abs((xy[number[num-1]][1]-xy[number[0]][1])));
			System.out.println(sum);
			
			//sum +=Math.sqrt(Math.abs(xy[i][0]-xy[i+1][0]+(xy[i][1]-xy[i+1][1])));
			//System.out.print(Math.sqrt(Math.abs(xy[0][0]-xy[1][0]+(xy[0][1]-xy[1][1]))));
			/*
			 * 10筆資料(練習檔)       10筆資料(每個點的平方)    隨機點(原點)與下一個隨機連接點(類推),      
			   565.0  575.0		319225.0  330625.0	      一直到10個座標都連完1次,
			    25.0  185.0 	   625.0   34225.0            接著在,連回第一個隨機點(原點).
			   345.0  750.0		119025.0  562500.0
			   945.0  685.0		893025.0  469225.0
			   845.0  655.0		714025.0  429025.0
			   880.0  660.0		774400.0  435600.0
			    25.0  230.0	       625.0   52900.0
			   525.0 1000.0		275625.0 1000000.0
			   580.0 1175.0		336400.0 1380625.0
			   650.0 1130.0		422500.0 1276900.0
			     						
			  			*/
	}
}
