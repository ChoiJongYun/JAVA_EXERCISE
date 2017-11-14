package icehs.science.chapter04;

public class Operatiortest {

	public static void main(String[] args) {
		int number= 64;
		
		boolean result1= (number%2 ==0)&& (number%7 == 0);
		boolean result2=(number%2 == 0) || (number%7 == 0);

		
		System.out.println(number%2 == 0);
		System.out.println(number > 10);
		System.out.println(result1);
		System.out.println(result2);
	}

}
