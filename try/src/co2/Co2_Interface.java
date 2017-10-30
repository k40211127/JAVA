package co2;

public interface Co2_Interface {
		
    
	void setCo2data(double[] Process,int Power,double startTime);		
	
	
	
	//implements Co2_Interface
	//void Co2(double[] Process,int Power,double startTime);
		
	/* 繼承 物件導向設計

	/* 有ship , car , motor 這麼多個不同的物件時，
	 * 共通的性質，例如都要吃油，之類的方法通通先囊括成interface，
	 * 再由各個implement 這個 interface 的 subclass 去各自寫自己 吃油 的方法。 
	 */
	
	// 有 void (不回傳值）
	// 無 void (可回傳值)

	
	int test();
	
	public static void abc(double[] Process,int Power,double startTime) {
		System.out.println("\nabc");	
	}
}
