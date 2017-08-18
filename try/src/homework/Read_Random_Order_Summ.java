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
		int [] num1 = new int[num];		//陣列0~9筆(練習檔第一筆)
		for (int i=0;i<num;i++){num1[i]=i;}	//賦予第一個num1[0~9]陣列0~9的數值
		int [] order = new int[num];		//宣告第二個用作記錄順序的陣列
		System.out.print("隨機順序：");
		for (int i=0;i<order.length;i++){	//共執行10次(筆)
			ran_num= ran.nextInt(num-i);	//亂數-i 是因為 假設一開始0~9(亂數範圍) 每取走1個值範圍就減少1筆(0~8)..(0~7)..類推
			order[i]=num1[ran_num];		//將num1[ran_num]內的值取走 給order[0]..1..2類推
			System.out.print(order[i]+" "); //觀看順序
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];//每取走一筆 將後面每一筆往前挪1格
			}
		}
		
		double Record[][][] = new double[num][num][1]; //三維陣列 用作紀錄(Step1.完成 Step2.待續)
		double sum2=0.0;
		for (int i=0;i<xy.length-1;i++){
				Record[i][i+1][0] = Math.sqrt(Math.pow((xy[order[i]][0]-xy[order[i+1]][0]),2) + Math.pow((xy[order[i]][1]-xy[order[i+1]][1]),2));
				Record[i+1][i][0] = Record[i][i+1][0];
				sum2+=Record[i][i+1][0];
			    //Math.sqrt(Math.pow(xy[order[i]][0]-xy[order[i+1]][0], 2)+Math.pow(xy[order[i]][1]-xy[order[i+1]][1], 2));
		}
		Record[order[num-1]][order[0]][0] = Math.sqrt(Math.pow((xy[order[num-1]][0]-xy[order[0]][0]),2) + Math.pow((xy[order[num-1]][1]-xy[order[0]][1]),2));
		sum2+=Record[order[num-1]][order[0]][0];
		System.out.println("距離總和："+sum2); //這邊的結果與下面的結果是一樣的接下來要做第二步
		//第二步是 一個IF 包住上面運算 內有for(int i=0;i<xy.length-1;i++)
		//再一個IF判斷Record[i][i+1][0]是否!=0 是就直接sum2+=Record[i][i+1][0]; 否就在記錄進去,這樣之後重複都會直接+而不會重複運算;
		
		double sum=0.0;
			for (int i=0;i<xy.length-1;i++){ //兩點距離公式；根號( ( (x1-x2)平方)+(y1-y2)平方) )
				sum += Math.sqrt(Math.pow((xy[order[i]][0]-xy[order[i+1]][0]),2) + Math.pow((xy[order[i]][1]-xy[order[i+1]][1]),2));
			}
			sum += Math.sqrt(Math.pow((xy[order[num-1]][0]-xy[order[0]][0]), 2)+Math.pow((xy[order[num-1]][1]-xy[order[0]][1]), 2));
			System.out.println("\n"+"距離總和："+sum);
			
		
		//  Math.sqrt(36); 根號
		//  Math.pow(2,2); a的b次方
		
		//  一. 讀檔； 10筆資料(練習檔)、
		//  二. 順序； 隨機點(原點)與下一個隨機連接點(類推)
		//  三. 總和；一直到10個座標都連完1次, 接著在,連回第一個隨機點(原點).
		//  四. 重複運算；step1.第一次執行時全部是空的，所以第一次運算時，不做比對，而是直接運算再將值填入三維陣列中(兩兩交叉比對)
/*				       布林 = True(第一次執行起初是False)
				 step2.用一個 IF (布林函數!=True) 
						包住第一次的整個運算
					     else
					        for (int i=0;i<長度-1;i++)
							if (Record[i][j][0]!=0  or Record[j][i][0] !=0)
								sum += Record[i][+1][0];
							else
								運算  再紀錄到三維裡面
							end if                            */
	}
}
