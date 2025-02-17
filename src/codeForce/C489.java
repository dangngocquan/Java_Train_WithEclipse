package codeForce;

import java.util.Scanner;

public class C489 {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		scanner.close();
		//Solve
		String min = "-1";
		String max = "-1";
		if (s == 0 && m == 1) {
			min = "0";
			max = "0";
		}
		if (1<=s && s <= 9*m) {
			min = "";
			max = "";
			//Min
			for (int i = 1; i <= (s-1)/9; i++) {
				min = "9"+min;
			}
			int n1 = m - min.length();
			if (n1 ==1) {
				min = (s-((s-1)/9)*9) + min;
			}else if (n1 > 1) {
				min = (s-1)%9 + min;
				for (int i = 1; i <= n1 -2; i++) {
					min = "0" + min;
				}
				min = "1" + min;
			}
			//Max
			for (int i = 1; i <= s/9; i++) {
				max = max +"9";
			}
			int n2 = m - max.length();
			if (n2 == 1) {
				max = max + (s%9);
			}else if (n2 > 1){
				max = max + (s%9);
				for (int i = 1; i <= n2-1; i++) {
					max = max +"0";
				}
			}
		}
		//Output
		System.out.println(min + " " + max);
	}
}
