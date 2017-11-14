package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int base= 1000000;
		int year= base*12;
		int tex1=year/10; 
		int after1= year-tex1;
		int bonus=base*8/10;
		int tex2=bonus*55/1000;
		int after2=bonus-tex2;
		int fin= after1+after2;
		
		System.out.println("연봉:"+year);
		System.out.println("세후 연봉:"+after1);
		System.out.println("보너스:"+bonus);
		System.out.println("세후 보너스:"+after2);
		System.out.println("지급액:"+fin);
		

	}

}
