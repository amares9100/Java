package Ex;

import java.util.Scanner;

public class Ex2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
		
		if(m < 0 ) {
			m = m+60;
			h--;
			if(h == -1 ) {
				h = 23;
			}
		}
		
		System.out.print(h + " ");
		System.out.print(m);
		
	}
}
