package main3;

public class test21 {
	public static void main(String[] args) {
		int a[] = {9,3,7,6,1,8};
		int min = a[0];
		
		for (int i=1;i<a.length;i++){
			if(a[i]< min) min=a[i];
		}
		System.out.println(min);
	}
}
