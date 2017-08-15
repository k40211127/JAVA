package main5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test52 {
	public static void main(String[] args) {
		File f = new File("src//main5//abc.txt");	

		try {
			FileWriter fw = new FileWriter("output.txt");//開新檔案
			FileReader fr = new FileReader(f.getPath());//getPath()>>是一個字串，內容為找尋道的檔案詳細路徑
			BufferedReader br = new BufferedReader(fr);
			
			String tempArray[] ,temp;
			
			while((temp = br.readLine()) != null){
				tempArray = temp.split(" ");
					for(int i = 0 ; i < tempArray.length;i++){
						String w = tempArray[i];
						fw.write(w);//寫檔案
						System.out.println(w);
					}
				fw.write("\n");
			}
			fw.close();			
			fr.close();	
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
