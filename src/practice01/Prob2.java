package practice01;


public class Prob2 {

	public static void main(String[] args) {
		int count = 1;
		for(int i=1;i<10;i++){
			count=i;
			for(int j=0;j<10;j++){
				
				System.out.print((count++)+" ");
			}
			System.out.println();
		}
	}

}
