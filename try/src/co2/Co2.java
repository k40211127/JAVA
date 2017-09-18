package co2;

public class Co2 {
	public static void main(String[] argsp) {
		
		int[] Process = {50,20,80,60,50,100,80,60,40,60,80,70,90,50,60,70,50,10};
		int[] Power = {20,30,15,10,15,30,10,20};
		boolean temp = false;
		int count = 360,hour = count/60,min = count%60;
		for (int i=0;i<Process.length;i++) {
				System.out.print("開始時間："+count/60+"："+count%60+"\t");
				int sum = count; count += Process[i];	hour = count/60;	min = count%60;
				if (count >=   0 && count < 420) {System.out.println("處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Off-peak區段");}
				else if (sum <420 && count>=420) {System.out.println("處理了"+Process[i]+"分鐘,其中"+hour+":"+min+"到7:00是 Off-peak區間,"+"7:00到"+count/60+":"+count%60+"是Mid-peak區間");}
				else if (count >= 420 && count < 900) {System.out.println("處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Mid-peak區段");}
				else if (sum <900 && count>=900) {System.out.println("處理了"+Process[i]+"分鐘,其中"+hour+":"+min+"到15:00是 Mid-peak區間,"+"15:00到"+count/60+":"+count%60+"是On-peak區間");}
				else if (count >= 900 && count <1200) {System.out.println("處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"On -peak區段");}
				else if (sum <1200 && count>=1200) {System.out.println("處理了"+Process[i]+"分鐘,其中"+hour+":"+min+"到20:00是 On-peak區間,"+"20:00到"+count/60+":"+count%60+"是Mid-peak區間");}
				else if (count >=1200 && count <1320) {System.out.println("處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Mid-peak區段");}
				else if (sum <1320 && count>=1320) {System.out.println("處理了"+Process[i]+"分鐘,其中"+hour+":"+min+"到22:00是 Mid-peak區間,"+"22:00到"+count/60+":"+count%60+"是Off-peak區間");}
				else if (count >=1320 && count <=1440) {System.out.println("處理了"+Process[i]+"分鐘後"+"目前時間為 "+hour+":"+min+" 落在"+"Off-peak區段");}
		}
		//    7    15  20 22
		// 0 4 8 12 16 20 24
	}
}
