package co2;

public interface Co2_Interface {
		
    
	void setCo2data(double[] Process,int Power,double startTime);		
	
	
	
	//implements Co2_Interface
	//void Co2(double[] Process,int Power,double startTime);
		
	/* �~�� ����ɦV�]�p

	/* ��ship , car , motor �o��h�Ӥ��P������ɡA
	 * �@�q���ʽ�A�Ҧp���n�Y�o�A��������k�q�q���n�A��interface�A
	 * �A�ѦU��implement �o�� interface �� subclass �h�U�ۼg�ۤv �Y�o ����k�C 
	 */
	
	// �� void (���^�ǭȡ^
	// �L void (�i�^�ǭ�)

	
	int test();
	
	public static void abc(double[] Process,int Power,double startTime) {
		System.out.println("\nabc");	
	}
}
