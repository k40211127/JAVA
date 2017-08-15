package main5;
public class txt1 {
	public static void main(String[] args) {
		
		//可以只寫一個catch()代表全部Exception 例如:catch(Exception ex)
		/*
		 * public static void main(String[] args) {
		 * 		getProcessingTime();>>他會拋出例外
		 * }
		 * 第一種
		 * 當前類別底下的方法  
		 * public static void main(String[] args)throws Exception {
		 * 		getProcessingTime(); 呼叫當前類別的其他類別方法
		 * 		T1 t1 = new T1();	t1.getProcessingTime();  呼叫同一類別底下的類別內方法
		 * }
		 * public static  int getProcessingTime() throws Exception {} <<寫在這邊 就是 拋還給 main 嗎??>> 是的
		 * class T1{
		 * 		public int getProcessingTime() throws Exception {}
		 * }
		 * 
		 * 如果你要呼叫的類別使用他的方法，但這個類別不再當下的java檔案內，而是其他的java檔案時
		 * import 類別名稱.*;
		 * 
		 * 第二種
		 * public static void main(String[] args){
		 * 	try{
		 * 	 	getProcessingTime();
		 *  }catch(Exception ex){
		 *  	ex.printStackTrace();
		 *  }
*/

	}

}
