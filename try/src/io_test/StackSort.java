package io_test;

import java.util.Iterator;
import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();   //建立一個String的Stack
		st.push("a"); st.push("b");	st.push("c"); //堆入資料
		System.out.println("推疊大小：" + st.size());	//堆疊大小
			
		Iterator it = st.iterator(); // st.Iterator()會先到物件內部收集資料再回傳到Iterator
		// 建立Iterator的是針對在不同的物件(陣列、鏈結、雜湊集合)的公開存取介面
		// 走訪推疊，依序輸出a、b、c
        while(it.hasNext()){
           String value = (String)it.next(); //Iterator抓出來的資料需要強制轉型
           System.out.println("走訪堆疊：" + value);
        }

		System.out.print("取出堆疊:" + st.pop() + st.pop() + st.pop() + "\n"); //推出堆疊最上層的資料，c
        System.out.println("堆疊大小：" + st.size());        //堆疊大小
	}
}
