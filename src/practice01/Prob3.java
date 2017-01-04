package practice01;

import java.util.*;

public class Prob3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();
		int sum = 0;

		// for (int i = num; num >= 0; num -= 2) {
		// sum += num;
		// }
		
		if (num % 2 == 0) {
			for (int i = 0; i <= num; i += 2)
				sum += i;
			System.out.println(sum);
		} else {
			for (int i = 1; i <= num; i += 2)
				sum += i;
			System.out.println(sum);
		}
	}

}
