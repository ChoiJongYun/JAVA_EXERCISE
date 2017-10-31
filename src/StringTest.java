
public class StringTest {

	public static void main(String[] args) {
		
		String name = "¼¼Á¾´ë¿Õ" ;
		String cost = "10000";
		int thisyear = 2017;
		
		System.out.println(name +":"+ cost );
		System.out.println(thisyear+"³â");
		System.out.println(cost + thisyear);
		
		int parseCost = Integer.parseInt(cost);
		

	}

}
