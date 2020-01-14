package aplineproject;

public class Runner {
	public static void main(String[] args) {
		APLine line1 = new APLine(5, 4, -17);
		double xIntercept = line1.getXIntercept (); // xIntercept = 3.4
		double yIntercept = line1.getYIntercept (); // yIntercept = 4.25
		
		System.out.printf("%.2f", xIntercept);
		System.out.println();
		
		System.out.printf("%.2f", yIntercept);
		System.out.println();
		
		APLine line2 = new APLine (-25, 40, 30);
		xIntercept = line2.getXIntercept (); // xIntercept = 1.2
		yIntercept = line2.getYIntercept (); // yIntercept = -0.75
		System.out.printf("%.2f", xIntercept);
		System.out.println();
		
		System.out.printf("%.2f", yIntercept);
		System.out.println();
	}
}
