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
		
		System.out.println("����:"+year);
		System.out.println("���� ����:"+after1);
		System.out.println("���ʽ�:"+bonus);
		System.out.println("���� ���ʽ�:"+after2);
		System.out.println("���޾�:"+fin);
		

	}

}
