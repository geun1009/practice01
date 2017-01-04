package practice01;
import java.util.*;
public class Prob4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String Method Test
		String s= sc.nextLine();
		//System.out.println(s.length());
		int length = s.length();
		
		for(int i=0;i<length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
