package icehs.science.chapter05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int koreaScore=0;
		do {
			System.out.print("�ѱ��� ������ �Է��ϼ���.");
			koreaScore=getUserInput();
		}while(koreaScore<0 ||koreaScore>100);
		System.out.println("�ѱ��� ������"+koreaScore+"�Դϴ�.");
	} 
		        public static int getUserInput() {
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				return input;}
	}


