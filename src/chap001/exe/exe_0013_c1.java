//Nhập số liệu cho 2 dãy số thực  a0 , a1 ,..., am-1   và  b0 , b1 ,..., bn-1. Giả sử cả 2 dãy này đã được sắp theo thứ tự tăng dần.
//Hãy tận dụng tính sắp xếp của 2 dãy và tạo dãy c0 , c1 ,..., cm+n-1  là hợp của 2 dãy trên, sao cho dãy  ci  cũng có thứ tự tăng dần . 

package chap001.exe;

import java.util.*;

public class exe_0013_c1 {
	public static void main(String[] args) {
		//Input
		//A[i]
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ket hop 2 day A,B thanh day C ");
		System.out.println("Day so thuc A: a0, a1, ... , a(m-1)");
		System.out.print("Nhap m = ");
		int m = scanner.nextInt();
		double[] A = new double[m];
		System.out.println("Nhap a0, a1, ..., a"+(m-1) +":");
		for (int i = 0; i <m; i++) {
			A[i] = scanner.nextDouble();
		}
		//B[i]
		System.out.println("Day so thuc B: b0, b1, ... , b(n-1)");
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		double[] B = new double[n];
		System.out.println("Nhap b0, b1, ..., b"+(n-1) +":");
		for (int i = 0; i <n; i++) {
			B[i] = scanner.nextDouble();
		}
		scanner.close();
		Arrays.sort(A);
		Arrays.sort(B);
		//Solve
		long begin = Calendar.getInstance().getTimeInMillis();
		int indexA = 0;
		int indexB = 0;
		double[] C = new double[m+n];
		for (int indexC = 0; indexC < m+n; indexC++) {
			if (A[indexA]<= B[indexB]) {
				C[indexC] = A[indexA];
				indexA++;		
			}else {
				C[indexC] = B[indexB];
				indexB++;
			}
			if (indexA== m) {
				for (int j = indexC+1; j <m+n;j++) {
					C[j] = B[indexB];
					indexB++;
				}
				break;
			}else if (indexB == n) {
				for (int j = indexC+1; j <m+n;j++) {
					C[j] = A[indexA];
					indexA++;
				}
				break;
			}
		}
		//Output
		System.out.print("Day C:\t");
		for (double i: C) {
			System.out.print(i+"  ");
		}
		System.out.println();
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.printf("Runtime:\t%dms",(end-begin));
	}
}
