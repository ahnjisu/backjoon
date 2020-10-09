import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double grade[] = new double[N];
		double max = 0;
		double sum = 0;
		double avg;
		
		for(int i=0;i<grade.length;i++) {
			grade[i]=scanner.nextInt();
		}
		for (int i = 0; i < grade.length; i++) {
			max = max > grade[i] ? max : grade[i];
		}
		for (int i = 0; i < grade.length; i++) {
			grade[i]=grade[i]/max*100;
			sum += grade[i];
		}
		
		System.out.println(sum/N);
		
	}
}
