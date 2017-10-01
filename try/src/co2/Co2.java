package co2;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class test2 {
	public static void main(String[] args) throws ParseException {		 
		SimpleDateFormat Time = new SimpleDateFormat("HH:mm");
		
		
		/* 寫一新java檔案,Call_Co2
		 * 讀檔,寫入Process[][];
		 * 寫一Period[],Power[];
		 * 呼叫這邊方法,再把這邊變成方法檔案.
		 */
		
		
		
		int[] Process = {16,35,79,30,96,14,87,85,61,30,35,79,30,96,14,87,85,61,30,35,79,30,96,14,87,85,61,30,35,79,30,96,14,87,85,61,30,35,79,30,96,14,87,85,61,30,30,30,30};
		int[] Period = new int[3];
		for (int i=0;i<Process.length;i++) {Period[0] +=Process[i];}
		int[] Power = {20,30,15};
		
		double startTime = (double) Time.parse("02:00").getTime() / (1000*60); 
		double Co2kg = 0, Co2kw=0, totalCo2kg=0, totalCo2kw=0, totalCo2kWh=0;
	    
		double h3 = Time.parse("03:00").getTime()/(1000*60),h6 = Time.parse("06:00").getTime()/(1000*60),h12 = Time.parse("03:00").getTime()/(1000*60);
		double h14 = Time.parse("14:00").getTime()/(1000*60),h17 = Time.parse("17:00").getTime()/(1000*60),h18 = Time.parse("18:00").getTime()/(1000*60);
		double h21 = Time.parse("21:00").getTime()/(1000*60),h23 = Time.parse("23:00").getTime()/(1000*60),h24 = Time.parse("24:00").getTime()/(1000*60);
		//   0~3   3~6  6~12 12~14 14~17
		// 23~24 21~23 18~21 17~18
		// 0.725 0.700 0.693 0.682 0.669
		for (int i=0;i<Process.length;i++) {
			System.out.print("startTime : "+startTime+"\t"+Time.format(startTime*60000)+"\t");
			double endTime = (double) startTime + Process[i]; System.out.print((endTime-startTime)+"\t"+Time.format(endTime*60000)+"\t");
				if (startTime < h3) { // 00:00~03:00  0.725 
					if (endTime > h3) {
						Co2kg = (h3-startTime) /60*0.725; totalCo2kg += Co2kg;
						Co2kw = (h3-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h3;
					}else {
						Co2kg = (endTime-startTime) /60*0.725; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h3 && startTime < h6) { // 03:00~06:00  0.700
					if (endTime > h6) {
						Co2kg = (h6-startTime) /60*0.700;	totalCo2kg += Co2kg;
						Co2kw = (h6-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h6;
					}else {
						Co2kg = (endTime -startTime) /60*0.700; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h6 && startTime < h12) { // 06:00~12:00 0.693
					if (endTime > h12) {
						Co2kg = (h12-startTime)/60*0.693; totalCo2kg += Co2kg;
						Co2kw = (h12-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h12;
					}else {
						Co2kg = (endTime-startTime)/60*0.693; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h12 && startTime <h14) { // 12:00~14:00 0.682
					if (endTime > h14) {
						Co2kg = (h14-startTime)/60*0.682; totalCo2kg += Co2kg;
						Co2kw = (h14-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h14;
					}else {
						Co2kg = (endTime-startTime)/60*0.682; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h14 && startTime <h17) { // 14:00~17:00 0.669
					if (endTime > h17) {
						Co2kg = (h17-startTime)/60*0.669; totalCo2kg += Co2kg;
						Co2kw = (h17-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h17;
					}else {
						Co2kg = (endTime-startTime)/60*0.669; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h17 && startTime <h18) { // 17:00~18:00 0.682
					if (endTime > h18) {
						Co2kg = (h18-startTime)/60*0.682; totalCo2kg += Co2kg;
						Co2kw = (h18-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h18;
					}else {
						Co2kg = (endTime-startTime)/60*0.682; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h18 && startTime <h21) { // 18:00~21:00 0.693
					if (endTime > h21) {
						Co2kg = (h21-startTime)/60*0.693; totalCo2kg += Co2kg;
						Co2kw = (h21-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h21;
					}else {
						Co2kg = (endTime-startTime)/60*0.693; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h21 && startTime <h23) { // 21:00~23:00 0.700
					if (endTime > h23) {
						Co2kg = (h23-startTime)/60*0.700; totalCo2kg += Co2kg;
						Co2kw = (h23-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h23;
					}else {
						Co2kg = (endTime-startTime)/60*0.700; totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime >=h23 && startTime <h24) { // 23:00~24:00 0.725
					if (endTime >h24) {
						Co2kg = (h24-startTime)/60*0.725; totalCo2kg += Co2kg;
						Co2kw = (h24-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
						startTime = h24; //結束時間大於24:00.getTime值
					}else {
						Co2kg = (endTime-startTime)/60*0.725;	totalCo2kg += Co2kg;
						Co2kw = (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
						totalCo2kWh += Co2kg*Co2kw;
					}
				}
				if (startTime == h24) {  // 開始換日 
					startTime-=1320;     // startTime = 02:00.getTime值
					endTime-=1320;       // endTime   = 02:xx.getTime值
						if (endTime>h3) {// 結束時間>3點,則先計算(3點-開工時間)的值
							Co2kg += (h3-startTime)/60*0.725; totalCo2kg += Co2kg;
							Co2kw += (h3-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
							startTime = h3;
							totalCo2kWh += Co2kg*Co2kw;
						}else {//若無>3點,則表示結束時間在隔日開工時間的第一個區段內
							Co2kg += (endTime-startTime)/60*0.725; totalCo2kg += Co2kg;
							Co2kw += (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
							totalCo2kWh += Co2kg*Co2kw;
						}
						if (startTime >=h3 && endTime>h6) { // 結束時間>6點,則先計算(6點-第二區段開始)的值
							Co2kg += (h6-startTime)/60*0.700; totalCo2kg += Co2kg;
							Co2kw += (h6-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
							startTime = h6;
							totalCo2kWh += Co2kg*Co2kw;
						}else {//若無>6點,則表示結束時間在隔日開工時間第一時間區段+上第二個區段內時間
							Co2kg += (endTime-startTime)/60*0.700; totalCo2kg += Co2kg;
							Co2kw += (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
							totalCo2kWh += Co2kg*Co2kw;
						}
						if (startTime >=h6 && endTime>h12) {// 結束時間>12點,則先計算(12點-第三區段開始)的值
							Co2kg += (h12-startTime)/60*0.693; totalCo2kg += Co2kg;
							Co2kw += (h12-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
							startTime = h12;//這邊的if判斷 先暫時寫三個時間區段
							totalCo2kWh += Co2kg*Co2kw;
						}else {//若無>12點,則表示結束時間在隔日開工時間至第一、二時間區段+上第三個區段內時間
							Co2kg += (endTime-startTime)/60*0.693; totalCo2kg += Co2kg;
							Co2kw += (endTime-startTime)/Period[0]*Power[0]; totalCo2kw += Co2kw;
							totalCo2kWh += Co2kg*Co2kw;
						}
				}
				startTime = endTime;
				System.out.println(Math.rint(Co2kg*1000)/1000+"\t"+Math.rint(Co2kw*1000)/1000);
		}
		System.out.print("\n"+"totalCo2kg: "+Math.rint(totalCo2kg*1000)/1000+"\t"+"totalCo2kw: "+ Math.rint(totalCo2kw*1000)/1000+"\t"+"totalCo2kWh: "+ Math.rint(totalCo2kWh*1000)/1000);
	}
}
