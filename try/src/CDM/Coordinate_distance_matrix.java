package CDM;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Coordinate_distance_matrix {
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("src//CDM//test10.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int count=0;
		String bf="",str[],How_many=br.readLine();
		double xy[][] = new double[Integer.parseInt(How_many)][3];
		while(br.ready()) {
			bf = br.readLine();
			str = bf.split(" ");
			for (int i=0;i<=2;i++) {
				xy[count][i] = Double.parseDouble(str[i]);
			}count++;
		}fr.close();br.close();
		
		/* �@�BŪ��.�s�i�G���}�C
		 * �G�B�ŧi�@���}�C �N���I�P�C���I�������Z���s�i�h (���t�ۤv�P�ۤv)
		 * �T�B�ŧi�G���}�C �����I�~�C���I�P��l�I�������Z�� (�]�t�ۤv�P�ۤv)
		 * �|�B��X�@���P�G��
		 */
		
		//�b�@���}�C�̭��������I�P�C���I�������Z���ÿ�X (���t�ۤv�P�ۤv)
		double Record[] = new double[Integer.parseInt(How_many)-1];
		for (int i=0;i<xy.length-1;i++) {
			Record[i]=Math.sqrt(Math.pow(xy[0][1]-xy[i+1][1],2) + Math.pow(xy[0][2]-xy[i+1][2],2));
			System.out.print((int)Record[i]+"\t");
		}System.out.println("\n");
		
		//�b�G���}�C�̭����������I�~��l�I�P�I��ⶡ���Z���ÿ�X (�]�t�ۤv�P�ۤv)
		double Matrix[][] = new double[Integer.parseInt(How_many)-1][Integer.parseInt(How_many)-1];
		for (int i=1;i<xy.length;i++){
			for (int j=1;j<xy.length;j++) {
				if (i!=j) {
					if(Matrix[i-1][j-1] ==0 || Matrix[j-1][i-1] ==0){
						Matrix[i-1][j-1] = Math.sqrt(Math.pow(xy[i][1]-xy[j][1],2) + Math.pow(xy[i][2]-xy[j][2],2));
						Matrix[j-1][i-1] = Matrix[i-1][j-1];
					}
				}System.out.print((int)Matrix[i-1][j-1]+"\t");
			}System.out.println();
		}System.out.println();
		
		
		//��X10*10�x�} �@�[���
//		System.out.print(0+"\t");
//		for (int i=0;i<Matrix.length;i++) {System.out.print((int)Record[i]+"\t");}   System.out.println();
//		for (int i=0;i<Matrix.length;i++) {System.out.print((int)Record[i]+"\t");
//		for (int j=0;j<Matrix.length;j++) {System.out.print((int)Matrix[i][j]+"\t");}System.out.println();}
		
	}
}
