package icehs.science.chapter04;

public class SeparateNumberTest {

	public static void main(String[] args) {
		int base= 456;
		int hund= base/100;
	    int remain1= base%100;
		int ten= remain1/10;  
	    int remain2= remain1%10;
		int one= remain2;
		
		System.out.println("숫자:"+base);
		System.out.println("백의 자리수:"+hund);
		System.out.println("십의 자리수:"+ten);
		System.out.println("일의 자리수:"+one);

	}

}
