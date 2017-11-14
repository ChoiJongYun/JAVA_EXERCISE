package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int myscore= 75;
		
		boolean result1 = (90 <= myscore)&&(myscore <= 100);
		boolean result2 = (80 <= myscore)&&(myscore <= 89);
	    boolean result3 = (70 <= myscore)&&(myscore <= 79);
	    boolean result4 = (60 <= myscore)&&(myscore <= 69);
			
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
