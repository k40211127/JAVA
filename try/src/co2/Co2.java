package co2;

public class Co2 {
	public static void main(String[] argsp) {
		
		int[] Process = {50,20,80,60,50,100,80,60,40,60,80,70,90,50,60,70,50,10};
		int[] Power = {20,30,15,10,15,30,10,20};
		boolean temp = false;
		int count = 360,hour = count/60,min = count%60;
		for (int i=0;i<Process.length;i++) {
				System.out.print("�}�l�ɶ��G"+count/60+"�G"+count%60+"\t");
				int sum = count; count += Process[i];	hour = count/60;	min = count%60;
				if (count >=   0 && count < 420) {System.out.println("�B�z�F"+Process[i]+"������"+"�ثe�ɶ��� "+hour+":"+min+" ���b"+"Off-peak�Ϭq");}
				else if (sum <420 && count>=420) {System.out.println("�B�z�F"+Process[i]+"����,�䤤"+hour+":"+min+"��7:00�O Off-peak�϶�,"+"7:00��"+count/60+":"+count%60+"�OMid-peak�϶�");}
				else if (count >= 420 && count < 900) {System.out.println("�B�z�F"+Process[i]+"������"+"�ثe�ɶ��� "+hour+":"+min+" ���b"+"Mid-peak�Ϭq");}
				else if (sum <900 && count>=900) {System.out.println("�B�z�F"+Process[i]+"����,�䤤"+hour+":"+min+"��15:00�O Mid-peak�϶�,"+"15:00��"+count/60+":"+count%60+"�OOn-peak�϶�");}
				else if (count >= 900 && count <1200) {System.out.println("�B�z�F"+Process[i]+"������"+"�ثe�ɶ��� "+hour+":"+min+" ���b"+"On -peak�Ϭq");}
				else if (sum <1200 && count>=1200) {System.out.println("�B�z�F"+Process[i]+"����,�䤤"+hour+":"+min+"��20:00�O On-peak�϶�,"+"20:00��"+count/60+":"+count%60+"�OMid-peak�϶�");}
				else if (count >=1200 && count <1320) {System.out.println("�B�z�F"+Process[i]+"������"+"�ثe�ɶ��� "+hour+":"+min+" ���b"+"Mid-peak�Ϭq");}
				else if (sum <1320 && count>=1320) {System.out.println("�B�z�F"+Process[i]+"����,�䤤"+hour+":"+min+"��22:00�O Mid-peak�϶�,"+"22:00��"+count/60+":"+count%60+"�OOff-peak�϶�");}
				else if (count >=1320 && count <=1440) {System.out.println("�B�z�F"+Process[i]+"������"+"�ثe�ɶ��� "+hour+":"+min+" ���b"+"Off-peak�Ϭq");}
		}
		//    7    15  20 22
		// 0 4 8 12 16 20 24
	}
}
