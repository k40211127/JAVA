package homework;
import java.io.*;
import java.util.Random;

public class Read_Random_Order_Sum {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//homework//xy.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int num = Integer.parseInt(br.readLine()); 
		double xy[][] = new double[num][2];        
		
		String temp="",bf[];
		int count = 0;
		while(count < num){        
			temp = br.readLine();  
			bf = temp.split(" ");  
			for(int i=0;i<2;i++){  
				xy[count][i] = Double.parseDouble(bf[i]); 
			}
			count++;
		}
		fr.close();
		br.close();

		
		Random ran = new Random();       		//�ŧi�ü�
		int ran_num;							//�����üƲ��ͪ���
		int [] num1 = new int[num];				//�}�C0~10��(�m���ɲĤ@��)
		for (int i=0;i<num;i++){num1[i]=i;}	    //
		int [] order = new int[num];
		
		for (int i=0;i<order.length;i++){
			ran_num= ran.nextInt(num-i);
			order[i]=num1[ran_num];	
			//System.out.print(order[i]+" ");
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];
			}
		}

		
		double sum=0.0;
			for (int i=0;i<xy.length-1;i++){					
				sum += Math.sqrt(Math.pow(xy[order[i]][0]-xy[order[i+1]][0], 2)+Math.pow(xy[order[i]][1]-xy[order[i+1]][1], 2));
			}
			sum += Math.sqrt(Math.pow(xy[order[num-1]][0]-xy[order[0]][0], 2)+Math.pow(xy[order[num-1]][1]-xy[order[0]][1], 2));
			System.out.println("�Z���`�M�G"+sum);
			
		
		//  Math.sqrt(36); �ڸ�
		//  Math.pow(2,2); a��b����
		
		//  �@. Ū�ɡF 10�����(�m����)�B
		//	�G. ���ǡF �H���I(���I)�P�U�@���H���s���I(����)
		//	�T. �`�M�F�@����10�Ӯy�г��s��1��, ���ۦb,�s�^�Ĥ@���H���I(���I).
		//  �|. ���ƹB��F
	}
}
