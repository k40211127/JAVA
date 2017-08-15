package main1;


public class test3 {
	public static void main(String args[]){
		boolean logic = true;
		logic = 3 == 1;	System.out.println(logic);
		logic = 3 > 1 ;	System.out.println(logic);
		logic = (3>2) & (3>1);	System.out.println(logic);
		logic = (3>2) | (3<1);	System.out.println(logic);
		logic = 1!=2; System.out.println(logic);
		logic = !(1==2); System.out.println(logic);
		
		int a=0,b=2,c=1,d=1,e=5,f=4;
		logic = ((a>b)&(c>=d))|(!(e<f));
		/* (false & true)|(!(false))
		 * (false)|(true) 
		 *  true */
		System.out.println("\n" + logic);
	}
}
