package co2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Call_test {
	public static void main(String[] args) throws IOException {
		//讀取(練習檔) 位址
		FileReader fr = new FileReader("src//co2//p10x3_0.txt");
		BufferedReader br = new BufferedReader(fr); 
		
		//讀入 (練習檔) 第一行 字串分割 10筆處理與3台機器
		String temp = br.readLine(),str[]=temp.split("	"); int pro = Integer.parseInt(str[0]),robo=Integer.parseInt(str[1]); 
		
		double[][] Process = new double[robo][pro*2];
		double[] Period = new double[robo];
		int [] Power = {20,30,15,10,15,30,10,20};
		int count=0;
		
		//讀進(練習檔) 每台機器的利問與處理時間
		while(br.ready()) {
			temp = br.readLine(); 	str=temp.split("	");
			for(int i=0;i<str.length;i++) {
				Process[i][count]=Double.parseDouble(str[i]);//System.out.print(str[i]+"\t");
			}count++;//System.out.println();
		}
		fr.close();		br.close();
		
		//顯示(練習檔) 每台機器與處理時間
		for (int i=0; i<pro*2;i++) {
			for (int j=0;j<robo;j++) {
				System.out.print(Process[j][i]+"\t");
			}System.out.println();
		}
		
		//每台機器 開始至結束 總花費時間
		for (int i=0;i<robo;i++) {
			for (int j=pro;j<pro*2;j++) {
				Period[i] += Process[i][j];
			}System.out.println(Period[i]);
		}
		
  //呼叫Co2方法
	}
}
