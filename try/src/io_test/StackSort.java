package io_test;

import java.util.Iterator;
import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();   //�إߤ@��String��Stack
		st.push("a"); st.push("b");	st.push("c"); //��J���
		System.out.println("���|�j�p�G" + st.size());	//���|�j�p
			
		Iterator it = st.iterator(); // st.Iterator()�|���쪫�󤺳�������ƦA�^�Ǩ�Iterator
		// �إ�Iterator���O�w��b���P������(�}�C�B�쵲�B���궰�X)�����}�s������
		// ���X���|�A�̧ǿ�Xa�Bb�Bc
        while(it.hasNext()){
           String value = (String)it.next(); //Iterator��X�Ӫ���ƻݭn�j���૬
           System.out.println("���X���|�G" + value);
        }

		System.out.print("���X���|:" + st.pop() + st.pop() + st.pop() + "\n"); //���X���|�̤W�h����ơAc
        System.out.println("���|�j�p�G" + st.size());        //���|�j�p
	}
}
