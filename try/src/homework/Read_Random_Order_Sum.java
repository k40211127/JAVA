package homework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Random_Order_Sum  {
	public static void main(String[] args) throws IOException{
		String path = "src//homework//xy.txt"; 
		FileReader fr = new FileReader(path); 
		BufferedReader br = new BufferedReader(fr);
		
		String temp = "",readArray[]; 
		double num[][] = new double[11][2]; 
		int count = 0; 
		while((temp = br.readLine()) != null ){
			readArray = temp.split(" "); 		
			for(int i=0 ; i<readArray.length;i++){	
				num[count][i] = Double.parseDouble(readArray[i]);
			}
			count++;
		}

		fr.close();
		br.close();
		
		for(double n[]: num){
			for(double n2:n){ 
				System.out.print(n2+"\t");
			}
			System.out.println();
		}
	}
}
