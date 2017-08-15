package openga_applications_data;

import openga_applications_data.abc;


public class threeFactor4blocksExperiment {
	public threeFactor4blocksExperiment() {
		
		/*
		 * 2.如果要使用abc.java內的方法，請注意方法有分static跟non-static的類型
		 *   static靜態方法是不需要經過物件化程序，直接透過類別名稱.就能呼叫
		 *   例如：abc.main()，也可以透過物件化方式呼叫
		 *   
		 *   但如果不是靜態方法(non-static)的話，是不能透過類別名稱.呼叫方式使用，必須要經過物件化程序
		 *   例如：abc a = new abc();，這才是真的物件化宣告

		 * 3.當我們要呼叫一個非non-static的callTest()方法時，前面的步驟已經宣告物件化，所以要透過a.callTest();方式來呼叫
		 * 4.如果是要呼叫abc類別內的屬性成員時，也有分static和non-static，呼叫時也跟第二步驟和第三步驟說明一樣

		 * 
		 * static 類別成員
		 * non-static 物件成員
		 * 
		 * 兩者差別在於記憶體建立空間使用差異，static在記憶體位置是共用的，共用是指今天如果宣告一個a的變數，當有其他程序呼叫改變此值時，
		 * 例如：
		 * static int a = 1;
		 * B()方法改變了a，將a改變為 a+=1時;
		 * C()方法呼叫了a，並顯示a的參數，顯示結果會是2，而不是1
 
		 * 這樣的差異在多個方法使用同一個共通的class時候，都需要用a這個值時候，b處理完之後，C接著拿到的a是b處理完後的a而不是一開始宣告的a

		 * 你這個我好有興趣，你可以來學校一起研究，我現在也是在用機器學習大數據也有碰到，目前還在摸索研究Tensorflow CNN捲積式神經網路 
		 * 你這個openga專案我剛剛有稍微看一下，它裡面有神經網路的程序，nerual
		 * non-static在記憶體裡面是獨立一個，也就是說當有一個變數宣告成立是non-static型態時候是獨立一個
		 * 
		 * */
		
	   abc a = new abc();
		a.callTest();
		System.out.print(abc.st);//static type，非物件化呼叫
		System.out.println(a.st);//static type，物件化呼叫
		System.out.println(a.nst);//non-static，物件化呼叫
		//這就是呼叫abc 的 callTest 類別 的處理嗎 end　 OK 我差不多也要消化一下 下禮拜就去找老師討論 感恩  你了解static嗎? 原先要問這個問題的 但你已經解說了 我先好好看著 消化一下
	  }

		 /* OpenGA項目，即建立遺傳基本框架*/
	
	//Factor A, B, C, and Block 1.
	public int[][] getCombinations(){
	    int[][] combs = new int[][]
	        {{	1	,	0	,	0	,	0	},
	        {	0	,	1	,	1	,	0	},
	        {	1	,	1	,	0	,	1	},
	        {	0	,	0	,	1	,	1	},
	        {	0	,	1	,	0	,	2	},
	        {	1	,	0	,	1	,	2	},
	        {	0	,	0	,	0	,	3	},
	        {	1	,	1	,	1	,	3	}};
	    return combs;
	  }
		
	/*
	 * 這個二維陣列已經在宣告時就有給她參數了
	 * 這個getCombinations()是一個陣列型態方法，代表說他可以用陣列方式來多重呼叫此方法
	 * 然後這個方法用意是在取值，只要呼叫他就能取得combs這個二維陣列的參數end
	 *
	 * package openga_applications_data2;
	 * 假設我在其他葉面 要呼叫這頁
	 * 就要import openga_applications_data.*; 這樣匯入嗎
	 * 
	 * package 這個是代表當下java檔案所在的位置
	 * 
	 * 如果你要匯入其他的，就要用同一專案名稱底下的哪一個java
	 * 就像我上面所打的end 
	 *
	 *
	 *
	 *	 * */
}
