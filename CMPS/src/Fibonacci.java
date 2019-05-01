
public class Fibonacci {
	public static void main(String[] args) {
		int n = 20;
		System.out.print(fib(n));
		
		int f_2 = 0;
		int f_1 = 1;
		int f = 1;
		for(int i=0;i<=(n-2);i++) {
			f = f_1 + f_2;
			f_2 = f_1;
			f_1=f;
		}
		int sum = f;
		System.out.print(" "+sum+" ");
	}
	public static int fib(int num) {
		return (num <= 1) ? num : (fib(num -1) + fib(num-2));
	}
}
