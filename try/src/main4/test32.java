package main4;

public class test32 {
	public static void main(String[] args) {
		long i1 = 15L;
		int  i2 = (int) 15L;
	    System.out.println(i1);   //块 12.345678901234567  (17 计)
	    System.out.println(i2 + "\n");
	    
		float f1=0.123456789F;
	    float f2=0.1234567890e2F;
	    float f3=123456789F;
	    double d1=0.1234567890123456D;
	    double d2=0.1234567890123456789e2D;
	    double d3=1234567890123456789D;
	    System.out.println(f1);    //块 0.12345679    (8 计ぃ 0)
	    System.out.println(f2);    //块 12.345679      (8 计)
	    System.out.println(f3);    //块 1.23456792E8 (9 计)
	    System.out.println(d1);   //块 0.1234567890123456  (17 计ぃ 0)
	    System.out.println(d2);   //块 12.345678901234567  (17 计)
	    System.out.println(d3);   //块 1.23456789012345677E18 (18 计)
	    
	/*	float f1=123.45f;
		float f2=1.2345e4F;
		double d1=123.45;    // 箇砞 double
		double d2=123.45d;
		double d3=1.2345e4D; 
	*/
	}
}
