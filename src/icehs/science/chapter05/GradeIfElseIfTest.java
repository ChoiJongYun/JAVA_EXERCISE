package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		 
		int gildong = 92;
		
		if(gildong<= 100 && gildong>=90)
			System.out.println("A���� �Դϴ�." );
		else if(gildong<= 100 && gildong>=90)
			System.out.println("B���� �Դϴ�." );
		else if(gildong< 90 && gildong>=80)
			System.out.println("C���� �Դϴ�." );
		else if(gildong<80 && gildong>=70)
			System.out.println("D���� �Դϴ�." );
		else if(gildong<70 && gildong>=60)	
			System.out.println("E���� �Դϴ�." );
	}

}
