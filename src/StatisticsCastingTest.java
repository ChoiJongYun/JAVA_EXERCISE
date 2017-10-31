
public class StatisticsCastingTest {

	public static void main(String[] args) {
		
		
		double lotto = 0.0000001235;
		long population = 6973738433L;
		
		System.out.println("Original Value :"+ lotto);
		
		int intLotto = (int) lotto;
		System.out.println("int형으로 강제 변환 :"+  intLotto);
		
		int intPopulation = (int) population;
		System.out.println("int형으로 강제 변환 :"+ intPopulation);

	}

}
