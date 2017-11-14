package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
         
		int result=0;
		int result2=0;
		int result3=0;
		for(int i=0; i<=1000; i++) {
			result3 += i;
			if(i%2==0) {
				result += i;
			}
			else if(i%2==1) {
				result2 += i;
			}
		}
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
