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
		
		System.out.println(by);  // ��X 0
	    System.out.println(s);   // ��X 0
	    System.out.println(i);   // ��X 0
	    System.out.println(l);   // ��X 0
	    System.out.println(f);   // ��X 0.0
	    System.out.println(d);   // ��X 0.0
	    System.out.println(c);   // ��X
	    System.out.println(bo);  // ��X false

	    //���O�������Y����l���A�ܼ�, �Y�ϫŧi�ɥ���l��, JDK �sĶ�����|�۰ʽᤩ�w�]�� 0
	}
}
