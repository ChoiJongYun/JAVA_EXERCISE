package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		//int x=23;
		//int y=26;
		System.out.print("�Ҽ����� �����ϰ� ���� ���ڸ� �Է��ϼ��� :");
		int a=getUserInput();
		for(int i=2; i<=a;i++) {
			if(a==i) {
				System.out.println(a+"�� �Ҽ��Դϴ�");
				
			}else if(a%i==0) {System.out.println(a+"�� �Ҽ��� �ƴմϴ�");
			break;
			}}
		}
		/*
		for(int i=2; i<=y;i++) {
			if(x==i) {
				System.out.println(y+"�� �Ҽ��Դϴ�");
				
			}else if(y%i==0) { System.out.println(y+"�� �Ҽ��� �ƴմϴ�");
			break;
			}
		}


	}

}
*/
		    public static int getUserInput() {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			return input;}
	}