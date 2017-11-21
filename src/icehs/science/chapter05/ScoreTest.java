package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		System.out.print("반의 학생 수는?");
		int stuNo=getUserInput();
		int scoreSum=0;
		double avg= 0.0;
		System.out.println(stuNo);
		for(int i=1;i<=stuNo;i++) {
			System.out.print(i+"번 점수는?");
			scoreSum +=getUserInput();
		}
		System.out.println(stuNo+"명의 총점: "+scoreSum);
		System.out.println(stuNo+"명의 평균: "+(double)scoreSum/stuNo);
	}	
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}
