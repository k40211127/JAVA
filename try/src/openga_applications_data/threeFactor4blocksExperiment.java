package openga_applications_data;

import openga_applications_data.abc;


public class threeFactor4blocksExperiment {
	public threeFactor4blocksExperiment() {
		
		/*
		 * 2.�p�G�n�ϥ�abc.java������k�A�Ъ`�N��k����static��non-static������
		 *   static�R�A��k�O���ݭn�g�L����Ƶ{�ǡA�����z�L���O�W��.�N��I�s
		 *   �Ҧp�Gabc.main()�A�]�i�H�z�L����Ƥ覡�I�s
		 *   
		 *   ���p�G���O�R�A��k(non-static)���ܡA�O����z�L���O�W��.�I�s�覡�ϥΡA�����n�g�L����Ƶ{��
		 *   �Ҧp�Gabc a = new abc();�A�o�~�O�u������ƫŧi

		 * 3.��ڭ̭n�I�s�@�ӫDnon-static��callTest()��k�ɡA�e�����B�J�w�g�ŧi����ơA�ҥH�n�z�La.callTest();�覡�өI�s
		 * 4.�p�G�O�n�I�sabc���O�����ݩʦ����ɡA�]����static�Mnon-static�A�I�s�ɤ]��ĤG�B�J�M�ĤT�B�J�����@��

		 * 
		 * static ���O����
		 * non-static ���󦨭�
		 * 
		 * ��̮t�O�b��O����إߪŶ��ϥήt���Astatic�b�O�����m�O�@�Ϊ��A�@�άO�����Ѧp�G�ŧi�@��a���ܼơA����L�{�ǩI�s���ܦ��ȮɡA
		 * �Ҧp�G
		 * static int a = 1;
		 * B()��k���ܤFa�A�Na���ܬ� a+=1��;
		 * C()��k�I�s�Fa�A�����a���ѼơA��ܵ��G�|�O2�A�Ӥ��O1
 
		 * �o�˪��t���b�h�Ӥ�k�ϥΦP�@�Ӧ@�q��class�ɭԡA���ݭn��a�o�ӭȮɭԡAb�B�z������AC���ۮ��쪺a�Ob�B�z���᪺a�Ӥ��O�@�}�l�ŧi��a

		 * �A�o�ӧڦn������A�A�i�H�ӾǮդ@�_��s�A�ڲ{�b�]�O�b�ξ����ǲߤj�ƾڤ]���I��A�ثe�٦b�N����sTensorflow CNN���n�����g���� 
		 * �A�o��openga�M�קڭ�観�y�L�ݤ@�U�A���̭������g�������{�ǡAnerual
		 * non-static�b�O����̭��O�W�ߤ@�ӡA�]�N�O�����@���ܼƫŧi���߬Onon-static���A�ɭԬO�W�ߤ@��
		 * 
		 * */
		
	   abc a = new abc();
		a.callTest();
		System.out.print(abc.st);//static type�A�D����ƩI�s
		System.out.println(a.st);//static type�A����ƩI�s
		System.out.println(a.nst);//non-static�A����ƩI�s
		//�o�N�O�I�sabc �� callTest ���O ���B�z�� end�@ OK �ڮt���h�]�n���Ƥ@�U �U§���N�h��Ѯv�Q�� �P��  �A�F��static��? ����n�ݳo�Ӱ��D�� ���A�w�g�ѻ��F �ڥ��n�n�ݵ� ���Ƥ@�U
	  }

		 /* OpenGA���ءA�Y�إ߿�ǰ򥻮ج[*/
	
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
	 * �o�ӤG���}�C�w�g�b�ŧi�ɴN�����o�ѼƤF
	 * �o��getCombinations()�O�@�Ӱ}�C���A��k�A�N���L�i�H�ΰ}�C�覡�Ӧh���I�s����k
	 * �M��o�Ӥ�k�ηN�O�b���ȡA�u�n�I�s�L�N����ocombs�o�ӤG���}�C���Ѽ�end
	 *
	 * package openga_applications_data2;
	 * ���]�ڦb��L���� �n�I�s�o��
	 * �N�nimport openga_applications_data.*; �o�˶פJ��
	 * 
	 * package �o�ӬO�N���Ujava�ɮשҦb����m
	 * 
	 * �p�G�A�n�פJ��L���A�N�n�ΦP�@�M�צW�٩��U�����@��java
	 * �N���ڤW���ҥ���end 
	 *
	 *
	 *
	 *	 * */
}
