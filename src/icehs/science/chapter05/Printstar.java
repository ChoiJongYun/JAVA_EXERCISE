package icehs.science.chapter05;

public class Printstar {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<=9;j++) {
				if(j==5) continue;
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		

	}

}
