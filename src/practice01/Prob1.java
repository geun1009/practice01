package practice01;
import java.util.*;
public class Prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%3==0)
			System.out.println("3의 배수 입니다");
		else
			System.out.println("3의 배수가 아닙니다");
	}
}
