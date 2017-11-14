package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
	
		int first=10;
		int second=20;
		int third=40;
		int forth=50;
		int fifth=80;
		double member= first*second/2*0.6;
		member += (third+forth)/2 *0.13;
		member += fifth*0.27;
		
		System.out.println(member);
		
		if(member<= 100 && member>=95)
			System.out.println("Special Class" );
		else if(member<= 95 && member>=90)
			System.out.println("Gold Class" );
		else if(member< 90 && member>=85)
			System.out.println("Silver Class" );
		else if(member<85 && member>=80)
			System.out.println("Bronze Class" );
		else 	
			System.out.println("Member");

	}

}
