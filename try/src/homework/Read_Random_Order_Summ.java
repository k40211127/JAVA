package homework;
import java.io.*;
import java.util.Random;

public class Read_Random_Order_Summ {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//homework//xy.txt");//讀取xy文字練習檔
		BufferedReader br = new BufferedReader(fr);		//暫存讀檔
		
		int num = Integer.parseInt(br.readLine()); 	//讀總共有幾筆資料(做動態陣列用)
		double xy[][] = new double[num][2];        	//宣告二維陣列
		
		String temp="",bf[];	//讀檔 & 字串分割
		int count = 0;		//陣列的列
		while(count < num){     //第0列到最後一列   
			temp = br.readLine();  
			bf = temp.split(" ");  
			for(int i=0;i<2;i++){  //寫入 每一列的[count][0]與[count][1]
				xy[count][i] = Double.parseDouble(bf[i]); //由於readLine讀檔是字串型態，所以需要強制轉型數值
			}
			count++;
		}
		fr.close();//關閉讀檔
		br.close();//關閉暫存讀檔

		
		Random ran = new Random();       	//宣告亂數
		int ran_num;				//接收亂數產生的值
		int [] num1 = new int[num];		//陣列0~10筆(練習檔第一筆)
		for (int i=0;i<num;i++){num1[i]=i;}	//賦予第一個num1[0~9]陣列0~9的數值
		int [] order = new int[num];		//宣告第二個用作記錄順序的陣列
		
		for (int i=0;i<order.length;i++){	//共執行10次(筆)
			ran_num= ran.nextInt(num-i);	//亂數-i 是因為 假設一開始0~9(亂數範圍) 每取走1個值範圍就減少1筆(0~8)..(0~7)..類推
			order[i]=num1[ran_num];		//將num1[ran_num]內的值取走 給order[0]..1..2類推
			//System.out.print(order[i]+" ");
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];//每取走一筆 將後面每一筆往前挪1格
			}
		}

		
		double sum=0.0;
			for (int i=0;i<xy.length-1;i++){ //兩點距離公式；根號((x1-x2)平方+(y1-y2)平方)
				sum += Math.sqrt(Math.pow(xy[order[i]][0]-xy[order[i+1]][0], 2)+Math.pow(xy[order[i]][1]-xy[order[i+1]][1], 2));
			}
			sum += Math.sqrt(Math.pow(xy[order[num-1]][0]-xy[order[0]][0], 2)+Math.pow(xy[order[num-1]][1]-xy[order[0]][1], 2));
			System.out.println("距離總和："+sum);
			
		
		//  Math.sqrt(36); 根號
		//  Math.pow(2,2); a的b次方
		
		//  一. 讀檔； 10筆資料(練習檔)、
		//  二. 順序； 隨機點(原點)與下一個隨機連接點(類推)
		//  三. 總和；一直到10個座標都連完1次, 接著在,連回第一個隨機點(原點).
		//  四. 重複運算；
	}
}
