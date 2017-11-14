package icehs.science.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		int first=10;
		int second=20;
		int third=40;
		int forth=50;
		int fifth=80;
		double member= first*second/2*0.6;
		member += (third+forth)/2 *0.13;
		member += fifth*0.27;
				
		System.out.println("평가점수:"+ (int)member);
		int intmember=(int)member/10;
		switch(intmember) {
		case 9: System.out.println("Special Class" );break;
		case 8: System.out.println("Gold Class" );break;
		case 7: System.out.println("Silver Class" );break;
		case 6: System.out.println("Bronze Class" );break;
		default: System.out.println("Member");
	}

}

	}


