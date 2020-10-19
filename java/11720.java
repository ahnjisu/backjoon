import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 정수 N 선언 및 입력
		String A = scanner.next(); // 문자열 A 선언 및 입력
		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum = sum + (int) A.charAt(i) - 48; // i번째 문자를 숫자로 변환
		}

		System.out.println(sum); // 계산한 sum 출력
	}
}
