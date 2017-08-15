package main4;

public class test33 {
	  static byte by;
	  static short s;
	  static int i;
	  static long l;
	  static float f;
	  static double d;
	  static char c;
	  static boolean bo;
	public static void main(String[] args) {
		
		System.out.println(by);  // 輸出 0
	    System.out.println(s);   // 輸出 0
	    System.out.println(i);   // 輸出 0
	    System.out.println(l);   // 輸出 0
	    System.out.println(f);   // 輸出 0.0
	    System.out.println(d);   // 輸出 0.0
	    System.out.println(c);   // 輸出
	    System.out.println(bo);  // 輸出 false

	    //類別的成員若為原始型態變數, 即使宣告時未初始化, JDK 編譯器仍會自動賦予預設值 0
	}
}
