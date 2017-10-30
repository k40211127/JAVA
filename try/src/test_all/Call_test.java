package test_all;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

import co2.Co2;

public class Call_test {
	public static void main(String[] args) throws IOException, Exception {
		//讀取(練習檔) 位址
		FileReader fr = new FileReader("src//co2//p10x3_0.txt");
		BufferedReader br = new BufferedReader(fr); 
		
		//讀入 (練習檔) 第一行 字串分割 10筆處理與3台機器
		String temp = br.readLine(),str[]=temp.split("	"); int pro = Integer.parseInt(str[0]),many_robo=Integer.parseInt(str[1]); 
		
		double[][] Process = new double[many_robo][pro*2];
		double[] Period = new double[many_robo];
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
		for (int i=0; i<many_robo;i++) {
			for (int j=Process[i].length/2;j<Process[i].length;j++) {
				System.out.print(Process[i][j]+"\t");
			}System.out.println();
		}
		
		//每台機器 開始至結束 總花費時間
		for (int i=0;i<many_robo;i++) {
			for (int j=Process[i].length/2;j<Process[i].length;j++) {
				Period[i] += Process[i][j];
			}System.out.print(Period[i]+"\t");
		}System.out.println();
		
		
		SimpleDateFormat Time = new SimpleDateFormat("HH:mm");
		double startTime = Time.parse("02:00").getTime() / (1000*60);
		
		Te callco2 = new Te(Process,Period,Power,startTime,many_robo);
		
	}
}
