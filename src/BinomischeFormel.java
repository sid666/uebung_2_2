
public class BinomischeFormel {

	public static void main(String[] args) {
		 double a = 8;
		 double b = 3;
		 
		 double linkerAusdruck = ((a+b)*(a+b));
		 double rechterAusdruck = ((a*a)+2*(a*b)+(b*b));
		 
		 double loesung1 = linkerAusdruck;
		 double loesung2 = rechterAusdruck;
		 
		 System.out.println("x1 =" + loesung1);
		 System.out.println("x2 =" + loesung2);

	}
}