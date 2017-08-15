package main3;

public class test28 {
	public static void main(String[] args) {
		for (int i=1;i<=9;i++){
			for (int j=1;j<=9;j++){
				if (i*j <=9 && j>=2){	System.out.print(j+"*"+i+"="+" "+i*j+" ");	}
				else {	System.out.print(j+"*"+i+"="+i*j+" ");	}
			}
			System.out.println("");
		}
	}
}
