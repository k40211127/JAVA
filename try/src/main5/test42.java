package main5;

public class test42 {
	public static void main(String[] args) {
        System.out.println("�ϥ�out��X�T��"); 
        System.err.println("�ϥ�err��X�T��"); 
        
        System.out.println("\u0048\u0065\u006C\u006C\u006F");
        
        // �Q�i�� 19 �ন�G�i�� 10011
        System.out.println(Integer.toBinaryString(19));

        // �Q�i�� 19 �ন�Q���i�� 13
        System.out.println(Integer.toHexString(19));

        // �Q�i�� 19 �ন�K�i�� 23
        System.out.println(Integer.toOctalString(19));
        
        // ��X 19 ���Q�i����
        System.out.printf("%d%n", 19);

        // ��X 19 ���K�i����
        System.out.printf("%o%n", 19);

        // ��X 19 ���Q���i����
        System.out.printf("%x%n", 19);
        
        System.out.printf("example:%.2f%n", 19.234);
        System.out.printf("example:%6.2f%n", 19.234);
        
	}
}
