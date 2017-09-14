package SCF;

import java.util.Random;
import SCF.SCF;

public class Call_SCF {
	public static void main(String[] args) {
				
		int[] Parent1 = new int[9];
		int[] Parent2 = new int[9];
		
		System.out.print("Parent1�G");	Random_gene(Parent1);	System.out.println();
		System.out.print("Parent2�G");	Random_gene(Parent2);	System.out.println();
		SCF call_scf = new SCF(Parent1,Parent2);
	}
	
	
	private static void Random_gene(int Parent[]) {
		Random ran = new Random();       	 //�ŧi�ü�
		int ran_num;						 //�����üƲ��ͪ���
		int [] num1 = new int[Parent.length];//�}�C0~9��(�m���ɲĤ@��)
				
		for (int i=0;i<Parent.length;i++){num1[i]=i;}	//�ᤩ�Ĥ@��num1[0~9]�}�C0~9���ƭ�
		for (int i=0;i<Parent.length;i++){	 //�@����10��(��)
			ran_num= ran.nextInt(Parent.length-i);	    //�ü�-i �O�]�� ���]�@�}�l0~9(�üƽd��) �C����1�ӭȽd��N���1��(0~8)..(0~7)..����
			Parent[i]=num1[ran_num];		 //�Nnum1[ran_num]�����Ȩ��� ��order[0]..1..2����
			System.out.print(Parent[i]+" "); //�[�ݶ���
			for (int j=ran_num;j<Parent.length-i-1;j++){
				num1[j] = num1[j+1];		 //�C�����@�� �N�᭱�C�@�����e��1��
			}
		}
	}
}
