package main4;

public class test34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Byte b=new Byte((byte)127);             //�����j���૬
		Short s=new Short("32767");
		Integer i=new Integer(12345);             //�����j���૬
		Float f=new Float(1234.56789);
		Double d=new Double("23.59123e10");
		
		System.out.println(b.doubleValue());    // ��X  127.0
		System.out.println(s.floatValue());     // ��X  32767.0
		System.out.println(f.intValue());       // ��X  1234 (���~�t)
		System.out.println(d.floatValue());     // ��X  2.35912298e11 (���~�t)
	}

}
