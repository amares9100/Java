package Ex;

import java.util.Scanner;

public class Ex2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int x = sc.nextInt();
		
		m += x;
		
		if(m >= 60) {
			h += m/60;
			m = m%60;
			if( h > 23) {
				h = h-24;
			}
		}
		System.out.print(h+" ");
		System.out.print(m);
	}
}
