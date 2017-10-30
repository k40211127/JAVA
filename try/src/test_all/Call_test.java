package test_all;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

import co2.Co2;

public class Call_test {
	public static void main(String[] args) throws IOException, Exception {
		//Ū��(�m����) ��}
		FileReader fr = new FileReader("src//co2//p10x3_0.txt");
		BufferedReader br = new BufferedReader(fr); 
		
		//Ū�J (�m����) �Ĥ@�� �r����� 10���B�z�P3�x����
		String temp = br.readLine(),str[]=temp.split("	"); int pro = Integer.parseInt(str[0]),many_robo=Integer.parseInt(str[1]); 
		
		double[][] Process = new double[many_robo][pro*2];
		double[] Period = new double[many_robo];
		int [] Power = {20,30,15,10,15,30,10,20};
		int count=0;
		
		//Ū�i(�m����) �C�x�������Q�ݻP�B�z�ɶ�
		while(br.ready()) {
			temp = br.readLine(); 	str=temp.split("	");
			for(int i=0;i<str.length;i++) {
				Process[i][count]=Double.parseDouble(str[i]);//System.out.print(str[i]+"\t");
			}count++;//System.out.println();
		}
		fr.close();		br.close();
		
		//���(�m����) �C�x�����P�B�z�ɶ�
		for (int i=0; i<many_robo;i++) {
			for (int j=Process[i].length/2;j<Process[i].length;j++) {
				System.out.print(Process[i][j]+"\t");
			}System.out.println();
		}
		
		//�C�x���� �}�l�ܵ��� �`��O�ɶ�
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
