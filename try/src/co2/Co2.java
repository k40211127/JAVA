package co2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Co2 {
	//public Co2(int Process[]) {}
	public static void main(String[] argsp) throws ParseException {
		
		SimpleDateFormat simple = new SimpleDateFormat("HH:mm");
		 
		String TimeRecord[][][][] = new String[24][60][25][60];
		int[] Process = {50,20,80,60,50,100,89,62,40,65,89,77,91,50,60,70,26,1};
		//int[] Process = {50,20,80,60,50,99,89,99,87,50,60,70,80,50};
		//int[] Power = {20,30,15,10,15,30,10,20};
		int count = 360,hour = count/60,min = count%60;
		
		for (int i=0;i<Process.length;i++) {
			int time = count;	
			count += Process[i];  hour = count/60;	 min = count%60; 
			String sT = time/60 +":"+ time%60 , nT = hour+":"+min;
			
			int a = (int) (simple.parse(sT).getTime()/(60000));
			String startTime = "開始時間："+simple.format(a*60000)+"分,處理了"+Process[i]+"分鐘後,";
			
			Date nt = simple.parse(nT),st = simple.parse(sT);
			String nowtime="目前時間為 "+simple.format(nt);	
			
			
			if (count >= 0 && count <420){TimeRecord[time/60][time%60][hour][min] = startTime + nowtime+" 落在"+"Off-peak區間";}
				else if (time  < 420 && count >= 420 && count <900){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到7:00是 C區間,"+"7:00到"+simple.format(nt)+"分是B區間";}
				else if (time  < 420 && count >  900 && count<1200){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到7:00是 C區間,"+"7:00到15:00是B區間,15:00到"+simple.format(nt)+"分是A區間";}
				else if (time  < 420 && count > 1200 && count<1320){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到7:00是 C區間,"+"7:00到15:00是B區間,15:00到20:00是A區間,20:00到"+simple.format(nt)+"分是B區間";}
				else if (time  < 420 && count > 1320 && count<1440){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到7:00是 C區間,"+"7:00到15:00是B區間,15:00到20:00是A區間,20:00到22:00是B區間,22:00到"+simple.format(nt)+"分是C區間";}	
			else if (count >=420 && count <  900) {TimeRecord[time/60][time%60][hour][min] = startTime + nowtime+" 落在"+"Mid-peak區間";}
				else if (time  < 900 && count >  900 && count<1200){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到15:00是 B區間,"+"15:00到"+simple.format(nt)+"分是A區間";}
				else if (time  < 900 && count > 1200 && count<1320){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到15:00是 B區間,"+"15:00到20:00是A區間,20:00到"+simple.format(nt)+"分是B區間";}
				else if (time  < 900 && count > 1320 && count<1440){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到15:00是 B區間,"+"15:00到20:00是A區間,20:00到22:00是B區間,22:00到"+simple.format(nt)+"分是C區間";}			  
			else if (count >=900 && count < 1200) {TimeRecord[time/60][time%60][hour][min] = startTime + nowtime+" 落在"+"On -peak區間";}	
				else if (time  < 1200 && count > 1200 && count<1320){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到20:00是 A區間,"+"20:00到"+simple.format(nt)+"分是B區間";}
				else if (time  < 1200 && count > 1320 && count<1440){TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到20:00是 A區間,"+"20:00到22:00是B區間,22:00到"+simple.format(nt)+"分是C區間";}
			else if (count >=1200 && count< 1320) {TimeRecord[time/60][time%60][hour][min] = startTime + nowtime+" 落在"+"Mid-peak區間";}
				else if (time  < 1320 && count>=1320 &&count<=1440) {TimeRecord[time/60][time%60][hour][min] = startTime+"其中"+simple.format(st)+"分到22:00是 Mid-peak區間,"+"22:00到"+simple.format(nt)+"是Off-peak區間";}
			else if (count >=1320 && count< 1440) {TimeRecord[time/60][time%60][hour][min] = startTime + nowtime+" 落在"+"Off-peak區間";}
		}	
		//    7    15  20 22
		// 0 4 8 12 16 20 24
		
		for (int i=0;i<24;i++) {
			for (int j=0;j<60;j++) {
				for (int ii=0;ii<25;ii++) {
					for (int jj=0;jj<60;jj++) {
						if (TimeRecord[i][j][ii][jj]!=null) {System.out.println(TimeRecord[i][j][ii][jj]);}
					}
				}
			}
		}

	}
}
