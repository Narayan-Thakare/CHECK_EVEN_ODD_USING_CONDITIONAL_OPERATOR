import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner (System.in);
		
		System.out.println("Eneter the no .");
		int no = Integer.parseInt(s.nextLine());
		
		String result = no%2==0 ? "even no " : "odd no " ;
		
		System.out.println(result);
		
		
		
	}

}
