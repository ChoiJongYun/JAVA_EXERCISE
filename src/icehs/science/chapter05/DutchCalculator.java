package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int sumExpense=0;
		System.out.print("������ �� ������ ����Ǿ�����?");
		int numofCha= getUserInput();
		System.out.println("==========================");
		System.out.println("�� ������ �� ����� �Է��ϼ���.");
		for(int i=1;i<=numofCha;i++) {
			System.out.print(i+ "�� ��� :");
			sumExpense += getUserInput();
		}
		System.out.println("�� �����" +sumExpense+"�� �Դϴ�.");
		System.out.println("==========================");
		System.out.print("������ �ο����� �Է��ϼ���.");
		int numofPeop= getUserInput();
		System.out.println("==========================");
		System.out.println("��ġ���� �ݾ�");
		int dutchMoney= sumExpense/numofPeop;
		for(int i=1;i<=numofPeop;i++) {
			if(i== numofPeop) {
				System.out.println(numofPeop+":"+sumExpense);
			}else {
				System.out.println(i+":"+dutchMoney);
				sumExpense -= dutchMoney;
			}
		}
		
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
