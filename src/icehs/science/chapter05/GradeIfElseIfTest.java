package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		 
		int gildong = 92;
		
		if(gildong<= 100 && gildong>=90)
			System.out.println("A학점 입니다." );
		else if(gildong<= 100 && gildong>=90)
			System.out.println("B학점 입니다." );
		else if(gildong< 90 && gildong>=80)
			System.out.println("C학점 입니다." );
		else if(gildong<80 && gildong>=70)
			System.out.println("D학점 입니다." );
		else if(gildong<70 && gildong>=60)	
			System.out.println("E학점 입니다." );
	}

}
