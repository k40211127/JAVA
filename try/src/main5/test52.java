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
			FileWriter fw = new FileWriter("output.txt");//�}�s�ɮ�
			FileReader fr = new FileReader(f.getPath());//getPath()>>�O�@�Ӧr��A���e����M�D���ɮ׸ԲӸ��|
			BufferedReader br = new BufferedReader(fr);
			
			String tempArray[] ,temp;
			
			while((temp = br.readLine()) != null){
				tempArray = temp.split(" ");
					for(int i = 0 ; i < tempArray.length;i++){
						String w = tempArray[i];
						fw.write(w);//�g�ɮ�
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
