package icehs.science.chapter04;

public class SeparateNumberTest {

	public static void main(String[] args) {
		int base= 456;
		int hund= base/100;
	    int remain1= base%100;
		int ten= remain1/10;  
	    int remain2= remain1%10;
		int one= remain2;
		
		System.out.println("����:"+base);
		System.out.println("���� �ڸ���:"+hund);
		System.out.println("���� �ڸ���:"+ten);
		System.out.println("���� �ڸ���:"+one);

	}

}
