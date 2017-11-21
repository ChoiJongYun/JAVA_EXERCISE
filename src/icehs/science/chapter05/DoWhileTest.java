package icehs.science.chapter05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int koreaScore=0;
		do {
			System.out.print("한국엉 점수를 입력하세요.");
			koreaScore=getUserInput();
		}while(koreaScore<0 ||koreaScore>100);
		System.out.println("한국엉 점수는"+koreaScore+"입니다.");
	} 
		        public static int getUserInput() {
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				return input;}
	}


