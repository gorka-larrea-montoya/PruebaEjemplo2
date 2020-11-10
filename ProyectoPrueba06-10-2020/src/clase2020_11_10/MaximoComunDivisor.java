package clase2020_11_10;

public class MaximoComunDivisor {
	
	public static int mdc(int n, int m) {
		if (n == m) {
			return n;
		}else if (n>m) {
			return mdc(n-m,m);
		}else if (n<m) {
			return mdc(n,m-n);
		}else
		return 1;

	}
	public static void main(String[] args) {
		System.out.println(mdc(12,16));
		System.out.println(mdc(99,97));
	}
}
