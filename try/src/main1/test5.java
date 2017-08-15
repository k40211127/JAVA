package main1;

public class test5 {
	public static void main(String args[]){
		boolean logic;
		int x=4,y=2,z=8,w=3;
		
		logic = (x-1 >= y) & (!((z<w) | (y+6!=z)));
		/* true & !(false | false) 
		 * true & !false 
		 * true & true	*/  
		System.out.println(logic);
	}
}
