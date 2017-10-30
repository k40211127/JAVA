package homework;
import java.io.*;
import java.util.Random;
import homework.Swap;
public class Read_Random_Order_Sum {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//homework//distanceData16.txt");//讀取xy文字練習檔
		BufferedReader br = new BufferedReader(fr);		//暫存讀檔
		
		int num = Integer.parseInt(br.readLine()); 	//讀總共有幾筆資料(做動態陣列用)
		double xy[][] = new double[num][3];        	//宣告二維陣列
		
		String temp="",bf[];	//讀檔 & 字串分割
		int count = 0;		//陣列的列
		while(count < num){     //第0列到最後一列   
			temp = br.readLine();  
			bf = temp.split(" ");  
			for(int i=0;i<=2;i++){  //寫入 每一列的[count][0]與[count][1]
				xy[count][i] = Double.parseDouble(bf[i]); //由於readLine讀檔是字串型態，所以需要強制轉型數值
			}
			count++;
		}
		fr.close();//關閉讀檔		br.close();//關閉暫存讀檔

	double Record[][][] = new double[num][num][1]; 	
	for (int ii=0;ii<2;ii++){ //一次執行5萬次(10筆) 約2秒多
		
		Random ran = new Random();       	//宣告亂數
		int ran_num;				//接收亂數產生的值
		int [] num1 = new int[num];		//陣列0~9筆(練習檔第一筆)
		for (int i=0;i<num;i++){num1[i]=i;}	//賦予第一個num1[0~9]陣列0~9的數值
		int [] order = new int[num];		//宣告第二個用作記錄順序的陣列
			
		//System.out.print("隨機序：");		
		for (int i=0;i<order.length;i++){	//共執行10次(筆)
			ran_num= ran.nextInt(num-i);	//亂數-i 是因為 假設一開始0~9(亂數範圍) 每取走1個值範圍就減少1筆(0~8)..(0~7)..類推
			order[i]=num1[ran_num];			//將num1[ran_num]內的值取走 給order[0]..1..2類推
			//System.out.print(order[i]+" "); //觀看順序
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];//每取走一筆 將後面每一筆往前挪1格
			}
		}
		//int[] order = {0,3,2,1,4,5};
		
		System.out.print("原序列：");	for (int i=0;i<order.length;i++) {System.out.print(order[i]+" ");}System.out.println();		
		Max(num,xy,order,Record);
		Swap swap = new Swap(order);
		Max(num,xy,order,Record);
		System.out.println();
		
	}
	}
	
	private static void Max(int num, double[][] xy, int[] order, double[][][] Record) {
		double sum2=0.0;
		for (int i=0;i<xy.length-1;i++){
			if(Record[order[i]][order[i+1]][0] ==0 || Record[order[i+1]][order[i]][0] ==0){
				Record[order[i]][order[i+1]][0] = Math.sqrt(Math.pow(xy[order[i]][1]-xy[order[i+1]][1],2) + Math.pow(xy[order[i]][2]-xy[order[i+1]][2],2));
				Record[order[i+1]][order[i]][0] = Record[order[i]][order[i+1]][0]; 
				sum2+=Record[order[i]][order[i+1]][0];
//				System.out.println(i+"與"+(i+1)+"點距離："+Record[order[i]][order[i+1]][0]);
			}
			else{
				sum2+=Record[order[i]][order[i+1]][0];
//				System.out.println(i+"與"+(i+1)+"點距離："+Record[order[i]][order[i+1]][0]);
			}	
		}
		Record[order[num-1]][order[0]][0] = Math.sqrt(Math.pow(xy[order[num-1]][1]-xy[order[0]][1],2) + Math.pow(xy[order[num-1]][2]-xy[order[0]][2],2));
		Record[0][order[order[num-1]]][0] = Record[order[num-1]][order[0]][0];
		sum2+=Record[order[num-1]][order[0]][0];
//		System.out.println("4與0點距離："+Record[order[num-1]][order[0]][0]);
		System.out.println("距離總和為："+sum2); //這邊的結果與下面的結果是一樣的接下來要做第二步
		System.out.println();
	}

	//  Math.sqrt(36); 根號		//  Math.pow(2,2); a的b次方
	
	//  一. 讀檔； 10筆資料(練習檔)、
	//  二. 順序； 隨機點(原點)與下一個隨機連接點(類推)
	//  三. 總和；一直到10個座標都連完1次, 接著在,連回第一個隨機點(原點).
	//  四. 重複運算；第一次執行時判斷三維陣列那格是否為空，若為空先做運算後加入三維陣列指定格內，
	//		 若三維陣列內有值(表示已經運算過且已放入陣列內)，則直接加入sum裡面。
    //  五. 匯入外部java方法(Swap) 以not-static方法呼叫 
}
