package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.print("첫 번째수를 입력하세요.");
		int first=getUserInput();
		System.out.print("두번째 수를 입력하세요.");
		int second=getUserInput();
		

	}
	public static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		return input;
		
		

	}
}
