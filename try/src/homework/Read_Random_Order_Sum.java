package homework;
import java.io.*;
import java.util.Random;
import homework.Swap;
public class Read_Random_Order_Sum {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src//homework//distanceData16.txt");//Ū��xy��r�m����
		BufferedReader br = new BufferedReader(fr);		//�ȦsŪ��
		
		int num = Integer.parseInt(br.readLine()); 	//Ū�`�@���X�����(���ʺA�}�C��)
		double xy[][] = new double[num][3];        	//�ŧi�G���}�C
		
		String temp="",bf[];	//Ū�� & �r�����
		int count = 0;		//�}�C���C
		while(count < num){     //��0�C��̫�@�C   
			temp = br.readLine();  
			bf = temp.split(" ");  
			for(int i=0;i<=2;i++){  //�g�J �C�@�C��[count][0]�P[count][1]
				xy[count][i] = Double.parseDouble(bf[i]); //�ѩ�readLineŪ�ɬO�r�ꫬ�A�A�ҥH�ݭn�j���૬�ƭ�
			}
			count++;
		}
		fr.close();//����Ū��		br.close();//�����ȦsŪ��

	double Record[][][] = new double[num][num][1]; 	
	for (int ii=0;ii<2;ii++){ //�@������5�U��(10��) ��2��h
		
		Random ran = new Random();       	//�ŧi�ü�
		int ran_num;				//�����üƲ��ͪ���
		int [] num1 = new int[num];		//�}�C0~9��(�m���ɲĤ@��)
		for (int i=0;i<num;i++){num1[i]=i;}	//�ᤩ�Ĥ@��num1[0~9]�}�C0~9���ƭ�
		int [] order = new int[num];		//�ŧi�ĤG�ӥΧ@�O�����Ǫ��}�C
			
		//System.out.print("�H���ǡG");		
		for (int i=0;i<order.length;i++){	//�@����10��(��)
			ran_num= ran.nextInt(num-i);	//�ü�-i �O�]�� ���]�@�}�l0~9(�üƽd��) �C����1�ӭȽd��N���1��(0~8)..(0~7)..����
			order[i]=num1[ran_num];			//�Nnum1[ran_num]�����Ȩ��� ��order[0]..1..2����
			//System.out.print(order[i]+" "); //�[�ݶ���
			for (int j=ran_num;j<order.length-i-1;j++){
				num1[j] = num1[j+1];//�C�����@�� �N�᭱�C�@�����e��1��
			}
		}
		//int[] order = {0,3,2,1,4,5};
		
		System.out.print("��ǦC�G");	for (int i=0;i<order.length;i++) {System.out.print(order[i]+" ");}System.out.println();		
		Max(num,xy,order,Record);
		Swap swap = new Swap(order);
		Max(num,xy,order,Record);
		System.out.println();
		
	}
	}
	
	private static void Max(int num, double[][] xy, int[] order, double[][][] Record) {
		double sum2=0.0;
		for (int i=0;i<xy.length-1;i++){
			if(Record[order[i]][order[i+1]][0] ==0 || Record[order[i+1]][order[i]][0] ==0){
				Record[order[i]][order[i+1]][0] = Math.sqrt(Math.pow(xy[order[i]][1]-xy[order[i+1]][1],2) + Math.pow(xy[order[i]][2]-xy[order[i+1]][2],2));
				Record[order[i+1]][order[i]][0] = Record[order[i]][order[i+1]][0]; 
				sum2+=Record[order[i]][order[i+1]][0];
//				System.out.println(i+"�P"+(i+1)+"�I�Z���G"+Record[order[i]][order[i+1]][0]);
			}
			else{
				sum2+=Record[order[i]][order[i+1]][0];
//				System.out.println(i+"�P"+(i+1)+"�I�Z���G"+Record[order[i]][order[i+1]][0]);
			}	
		}
		Record[order[num-1]][order[0]][0] = Math.sqrt(Math.pow(xy[order[num-1]][1]-xy[order[0]][1],2) + Math.pow(xy[order[num-1]][2]-xy[order[0]][2],2));
		Record[0][order[order[num-1]]][0] = Record[order[num-1]][order[0]][0];
		sum2+=Record[order[num-1]][order[0]][0];
//		System.out.println("4�P0�I�Z���G"+Record[order[num-1]][order[0]][0]);
		System.out.println("�Z���`�M���G"+sum2); //�o�䪺���G�P�U�������G�O�@�˪����U�ӭn���ĤG�B
		System.out.println();
	}

	//  Math.sqrt(36); �ڸ�		//  Math.pow(2,2); a��b����
	
	//  �@. Ū�ɡF 10�����(�m����)�B
	//  �G. ���ǡF �H���I(���I)�P�U�@���H���s���I(����)
	//  �T. �`�M�F�@����10�Ӯy�г��s��1��, ���ۦb,�s�^�Ĥ@���H���I(���I).
	//  �|. ���ƹB��F�Ĥ@������ɧP�_�T���}�C����O�_���šA�Y���ť����B���[�J�T���}�C���w�椺�A
	//		 �Y�T���}�C������(��ܤw�g�B��L�B�w��J�}�C��)�A�h�����[�Jsum�̭��C
    //  ��. �פJ�~��java��k(Swap) �Hnot-static��k�I�s 
}
