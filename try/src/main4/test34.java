package main4;

public class test34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Byte b=new Byte((byte)127);             //必須強制轉型
		Short s=new Short("32767");
		Integer i=new Integer(12345);             //不須強制轉型
		Float f=new Float(1234.56789);
		Double d=new Double("23.59123e10");
		
		System.out.println(b.doubleValue());    // 輸出  127.0
		System.out.println(s.floatValue());     // 輸出  32767.0
		System.out.println(f.intValue());       // 輸出  1234 (有誤差)
		System.out.println(d.floatValue());     // 輸出  2.35912298e11 (有誤差)
	}

}
