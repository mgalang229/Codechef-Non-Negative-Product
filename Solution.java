import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		outer: for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int [n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int neg = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					System.out.println(0);
					continue outer;
				} else if (a[i] < 0) {
					neg++;
				}
			}
			System.out.println((neg % 2 == 1) ? 1 : 0);
		}
		fs.close();
	}
}
