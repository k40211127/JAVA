package co2;

public class Co2 {
	public static void main(String[] argsp) {
		
		String TimeRecord[][][][] = new String[24][60][25][60];
		int[] Process = {50,20,80,60,50,100,89,62,40,65,89,77,91,50,60,70,27,1};
		//int[] Process = {20};
		int[] Power = {20,30,15,10,15,30,10,20};
		int count = 360,hour = count/60,min = count%60;
		for (int i=0;i<Process.length;i++) {
			int time = count;	//System.out.print("開始時間："+time/60+"："+time%60+"\t");
			count += Process[i];  hour = count/60;	 min = count%60;
			if (count >= 0 && count <420) 					   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Off-peak區間";}
				else if (time  < 420 && count >= 420 && count <900){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"："+time%60+"分到7點是 C區間,"+"7點到"+count/60+":"+count%60+"是B區間";}
				else if (time  < 420 && count >  900 && count<1200){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到7點是 C區間,"+"7點到15點是B區間,15點到"+count/60+"點"+count%60+"分是A區間";}
				else if (time  < 420 && count > 1200 && count<1320){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到7點是 C區間,"+"7點到15點是B區間,15點到20點是A區間,20點到"+count/60+"點"+count%60+"分是B區間";}
				else if (time  < 420 && count > 1320 && count<1440){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到7點是 C區間,"+"7點到15點是B區間,15點到20點是A區間,20點到22點是B區間,22點到"+count/60+"點"+count%60+"分是C區間";}
			else if (count >=420 && count <  900) 			   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Mid-peak區間";}
				else if (time  < 900 && count >  900 && count<1200){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到15點是 B區間,"+"15點到"+count/60+"點"+count%60+"分是A區間";}
				else if (time  < 900 && count > 1200 && count<1320){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到15點是 B區間,"+"15點到20點是A區間,20點到"+count/60+"點"+count%60+"分是B區間";}
				else if (time  < 900 && count > 1320 && count<1440){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到15點是 B區間,"+"15點到20點是A區間,20點到22點是B區間,22點到"+count/60+"點"+count%60+"分是C區間";}
			else if (time  < 900 && count >= 900) 			   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+":"+time%60+"到15:00是 Mid-peak區間,"+"15:00到"+count/60+":"+count%60+"是On-peak區間";}
			else if (count >=900 && count < 1200) 			   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"On -peak區間";}	
				else if (time  < 1200 && count > 1200 && count<1320){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到20點是 A區間,"+"20點到"+count/60+"點"+count%60+"分是B區間";}
				else if (time  < 1200 && count > 1320 && count<1440){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+"點"+time%60+"分到20點是 A區間,"+"20點到22點是B區間,22點到"+count/60+"點"+count%60+"分是C區間";}
			else if (time  < 1200 && count>=1200)			   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+":"+time%60+"到20:00是 On-peak區間,"+"20:00到"+count/60+":"+count%60+"是Mid-peak區間";}
			else if (count >=1200 && count< 1320) 			   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Mid-peak區間";}
				else if (time  < 1320 && count>=1320 &&count<=1440){TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘,其中"+time/60+":"+time%60+"到22:00是 Mid-peak區間,"+"22:00到"+hour+":"+min+"是Off-peak區間";}
			else if (count >=1320 && count<=1440) 			   {TimeRecord[time/60][time%60][hour][min] = "開始時間："+time/60+"："+time%60+"\t"+"處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Off-peak區間";}
			else if (count > 1440) {break;}
		}
		// 偏左為if區間內,偏右if為各區間跨區間情況
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
