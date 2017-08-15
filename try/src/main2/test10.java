package main2;

public class test10 {
	public static void main(String args[]){
		double price = 1.5;
		int quantity=0;
		
		if (price>3){
			quantity=0;
		}
		else if (price>2){
			quantity=3;
		}
		else if (price>1){
			quantity=5;
		}
		else if (price>0.5){
			quantity=8;
		}
		else if (price>0){
			quantity=10;
		}				
		else{
			System.out.println("invalid input");
		}
		System.out.println(quantity);	
	}
}
