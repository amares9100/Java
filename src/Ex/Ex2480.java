package Ex;

import java.util.Scanner;

public class Ex2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		
		if(x == y && y == z) {
			System.out.println(10000+(x*1000));
			return;
		}
		else if ((x == y || y == z) && x != z ) {
			System.out.println(1000+(y*100));
		}
		else if ((y == x || x == z) && y != x) {
			System.out.println(1000+(x*100));
		}
		
	}
}
