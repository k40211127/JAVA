package main5;

public class test42 {
	public static void main(String[] args) {
        System.out.println("使用out輸出訊息"); 
        System.err.println("使用err輸出訊息"); 
        
        System.out.println("\u0048\u0065\u006C\u006C\u006F");
        
        // 十進位 19 轉成二進位 10011
        System.out.println(Integer.toBinaryString(19));

        // 十進位 19 轉成十六進位 13
        System.out.println(Integer.toHexString(19));

        // 十進位 19 轉成八進位 23
        System.out.println(Integer.toOctalString(19));
        
        // 輸出 19 的十進位表示
        System.out.printf("%d%n", 19);

        // 輸出 19 的八進位表示
        System.out.printf("%o%n", 19);

        // 輸出 19 的十六進位表示
        System.out.printf("%x%n", 19);
        
        System.out.printf("example:%.2f%n", 19.234);
        System.out.printf("example:%6.2f%n", 19.234);
        
	}
}
