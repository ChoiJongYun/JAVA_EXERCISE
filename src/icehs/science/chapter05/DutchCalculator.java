package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int sumExpense=0;
		System.out.print("모임이 몇 차까지 진행되었나요?");
		int numofCha= getUserInput();
		System.out.println("==========================");
		System.out.println("각 차수에 쓴 비용을 입력하세요.");
		for(int i=1;i<=numofCha;i++) {
			System.out.print(i+ "차 비용 :");
			sumExpense += getUserInput();
		}
		System.out.println("총 비용은" +sumExpense+"원 입니다.");
		System.out.println("==========================");
		System.out.print("모임의 인원수를 입력하세요.");
		int numofPeop= getUserInput();
		System.out.println("==========================");
		System.out.println("더치페이 금액");
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
