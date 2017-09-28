package co2;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class Co2 {
	public static void main(String[] args) throws ParseException {		 
		SimpleDateFormat Time = new SimpleDateFormat("HH:mm");
		int count = 120,h,m,time,H,M;
		int[] Process = {50,20,80,60,50,65,89,62,40,65,89,77,91,54,69,71,26,12,80,90,21,40,18,1,1,80,80,80,80};
		
		Date h3 = Time.parse("03:00"),h6 = Time.parse("06:00"),h12 = Time.parse("12:00"),
			 h14 = Time.parse("14:00"),h17 = Time.parse("17:00"),h18 = Time.parse("18:00"),
			 h21 = Time.parse("21:00"),h23 = Time.parse("23:00"),h24 = Time.parse("24:00");
			//   0~3   3~6  6~12 12~14 14~17
			// 23~24 21~23 18~21 17~18
			// 0.725 0.700 0.693 0.682 0.669
		String hh = "";
		for (int i=0;i<Process.length;i++) {
			time = count;H=time/60;M=time%60;
			count +=Process[i]; h=count/60; m=count%60;
			hh += h+" ";
			if (h >= 24 || H >=24) {while(h>=24) {h-=24;} while(H>=24) {H-=24;}hh += h+" ";}
			Date startTime = Time.parse(H+":"+M);//System.out.println(Time.format(startTime));
			Date endTime  = Time.parse(h+":"+m); //System.out.println(Time.format(endTime));
			
			
			
			double sum =0;
			switch (H) {
			case 0:case 1:case 2:
				if (startTime.before(h3) && endTime.before(h3) || endTime.equals(h3)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" S");	break;}
				switch (h) {
					case 3:case 4:case 5:case 6:
						if (startTime.before(h3) && endTime.before(h6) || endTime.equals(h6)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to "+Time.format(endTime)+" A");	break;}
					case 7:case 8:case 9:case 10:case 11:
						if (startTime.before(h3) && endTime.before(h12) || endTime.equals(h12)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to "+Time.format(endTime)+" B");	break;}
					case 12:case 13:
						if (startTime.before(h3) && endTime.before(h14) || endTime.equals(h14)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to 12:00 B, 12:00 to "+Time.format(endTime)+" C");	break;}
					case 14:case 15:case 16:
						if (startTime.before(h3) && endTime.before(h17) || endTime.equals(h17)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to "+Time.format(endTime)+" D");	break;}
					case 17:
						if (startTime.before(h3) && endTime.before(h18) || endTime.equals(h18)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to "+Time.format(endTime)+" C");	break;}
					case 18:case 19:case 20:
						if (startTime.before(h3) && endTime.before(h21) || endTime.equals(h21)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to "+Time.format(endTime)+" B");	break;}
					case 21:case 22:
						if (startTime.before(h3) && endTime.before(h23) || endTime.equals(h23)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}
					case 23:
						if (startTime.before(h3) && endTime.before(h24) || endTime.equals(h24)) {
							System.out.println(Time.format(startTime)+" to 03:00 S, 03:00 to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;
			case 3:case 4:case 5:
				if (startTime.before(h6) && endTime.before(h6) || endTime.equals(h6)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" A");	break;}
				switch (h) {	
					case 6:case 7:case 8:case 9:case 10:case 11:
						if (startTime.before(h6) && endTime.before(h12) || endTime.equals(h12)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to "+Time.format(endTime)+" B");	break;}
					case 12:case 13:
						if (startTime.before(h6) && endTime.before(h14) || endTime.equals(h14)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to 12:00 B, 12:00 to "+Time.format(endTime)+" C");	break;}
					case 14:case 15:case 16:
						if (startTime.before(h6) && endTime.before(h17) || endTime.equals(h17)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to "+Time.format(endTime)+" D");	break;}
					case 17:
						if (startTime.before(h6) && endTime.before(h18) || endTime.equals(h18)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to "+Time.format(endTime)+" C");	break;}
					case 18:case 19:case 20:
						if (startTime.before(h6) && endTime.before(h21) || endTime.equals(h21)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to "+Time.format(endTime)+" B");	break;}
					case 21:case 22:
						if (startTime.before(h6) && endTime.before(h23) || endTime.equals(h23)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}	
					case 23:
						if (startTime.before(h6) && endTime.before(h24) || endTime.equals(h24)) {
							System.out.println(Time.format(startTime)+" to 06:00 A, 06:00 to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;
			case 6:case 7:case 8:case 9:case 10:case 11:
				if (startTime.before(h12) && endTime.before(h12) || endTime.equals(h12)) { 
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" B");	break;}
				switch (h) {
				case 12:case 13:
					if (startTime.before(h12) && endTime.before(h14) || endTime.equals(h14)) {
						System.out.println(Time.format(startTime)+" to 12:00 B, 12:00 to "+Time.format(endTime)+" C");	break;}
				case 14:case 15:case 16:
					if (startTime.before(h12) && endTime.before(h17) || endTime.equals(h17)) {
						System.out.println(Time.format(startTime)+" to 12:00 B, 12:00 to 14:00 C, 14:00 to "+Time.format(endTime)+" D");	break;}
				case 17:
					if (startTime.before(h12) && endTime.before(h18) || endTime.equals(h18)) {
						System.out.println(Time.format(startTime)+" to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to "+Time.format(endTime)+" C");	break;}
				case 18:case 19:case 20:
					if (startTime.before(h12) && endTime.before(h21) || endTime.equals(h21)) {
						System.out.println(Time.format(startTime)+" to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to "+Time.format(endTime)+" B");	break;}
				case 21:case 22:
					if (startTime.before(h12) && endTime.before(h23) || endTime.equals(h23)) {
						System.out.println(Time.format(startTime)+" to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}
				case 23:
					if (startTime.before(h12) && endTime.before(h24) || endTime.equals(h24)) {
						System.out.println(Time.format(startTime)+" to 12:00 B, 12:00 to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;
			case 12:case 13:
				if (startTime.before(h14) && endTime.before(h14) || endTime.equals(h14)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" C");	break;}
				switch (h) {			
					case 14:case 15:case 16:
						if (startTime.before(h14) && endTime.before(h17) || endTime.equals(h17)) {
							System.out.println(Time.format(startTime)+" to 14:00 C, 14:00 to "+Time.format(endTime)+" D");	break;}
					case 17:
						if (startTime.before(h14) && endTime.before(h18) || endTime.equals(h18)) {
							System.out.println(Time.format(startTime)+" to 14:00 C, 14:00 to 17:00 D, 17:00 to "+Time.format(endTime)+" C");	break;}
					case 18:case 19:case 20:
						if (startTime.before(h14) && endTime.before(h21) || endTime.equals(h21)) {
							System.out.println(Time.format(startTime)+" to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to "+Time.format(endTime)+" B");	break;}
					case 21:case 22:
						if (startTime.before(h14) && endTime.before(h23) || endTime.equals(h23)) {
							System.out.println(Time.format(startTime)+" to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}
					case 23:
						if (startTime.before(h14) && endTime.before(h24) || endTime.equals(h24)) {
							System.out.println(Time.format(startTime)+" to 14:00 C, 14:00 to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;
			case 14:case 15:case 16:	
				if (startTime.before(h17) && endTime.before(h17) || endTime.equals(h17)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" D");	break;}
				switch (h) {	
					case 17:
						if (startTime.before(h17) && endTime.before(h18) || endTime.equals(h18)) {
							System.out.println(Time.format(startTime)+" to 17:00 D, 17:00 to "+Time.format(endTime)+" C");	break;}
					case 18:case 19:case 20:
						if (startTime.before(h17) && endTime.before(h21) || endTime.equals(h21)) {
							System.out.println(Time.format(startTime)+" to 17:00 D, 17:00 to 18:00 C, 18:00 to "+Time.format(endTime)+" B");	break;}
					case 21:case 22:
						if (startTime.before(h17) && endTime.before(h23) || endTime.equals(h23)) {
							System.out.println(Time.format(startTime)+" to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}
					case 23:
						if (startTime.before(h17) && endTime.before(h24) || endTime.equals(h24)) {
							System.out.println(Time.format(startTime)+" to 17:00 D, 17:00 to 18:00 C, 18:00 to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;	
			case 17:
				if (startTime.before(h18) && endTime.before(h18) || endTime.equals(h18)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" C");	break;}
				switch (h) {
				case 18:case 19:case 20:
					if (startTime.before(h18) && endTime.before(h21) || endTime.equals(h21)) {
						System.out.println(Time.format(startTime)+" to 18:00 C, 18:00 to "+Time.format(endTime)+" B");	break;}
				case 21:case 22:
					if (startTime.before(h18) && endTime.before(h23) || endTime.equals(h23)) {
						System.out.println(Time.format(startTime)+" to 18:00 C, 18:00 to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}
				case 23:
					if (startTime.before(h18) && endTime.before(h24) || endTime.equals(h24)) {
						System.out.println(Time.format(startTime)+" to 18:00 C, 18:00 to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;
			case 18:case 19:case 20:
				if (startTime.before(h21) && endTime.before(h21) || endTime.equals(h21)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" B");	break;}
				switch (h) {		
					case 21:case 22:
						if (startTime.before(h21) && endTime.before(h23) || endTime.equals(h23)) {
							System.out.println(Time.format(startTime)+" to 21:00 B, 21:00 to "+Time.format(endTime)+" A");	break;}
					case 23:
						if (startTime.before(h21) && endTime.before(h24) || endTime.equals(h24)) {
							System.out.println(Time.format(startTime)+" to 21:00 B, 21:00 to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
				}break;
			case 21:case 22:
				if (startTime.before(h23) && endTime.before(h23) || endTime.equals(h23)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+" A");	break;}
				if (startTime.before(h23) && endTime.before(h24) || endTime.equals(h24)) {
					System.out.println(Time.format(startTime)+" to 23:00 A, 23:00 to "+Time.format(endTime)+" S");	break;}
			case 23:
				if (startTime.before(h24) && endTime.before(h24) || endTime.equals(h24)) {
					System.out.println(Time.format(startTime)+" to "+Time.format(endTime)+ " S");	break;}
			}
		}
			//float mm = 40f/100f;
			//System.out.println(Math.rint((mm*100)/100));
	}
}
