import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*(((B-(B/100)*100))/10));
		System.out.println(A*(B/100));
		System.out.println((A*(B%10))+(A*(((B-(B/100)*100))/10))*10+A*(B/100)*100);
		
		
	}

}
