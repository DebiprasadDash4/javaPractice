package javaPractice;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		m.sum(5, 10);
		m.sum(4, 5, 6);

	}

	public int sum(int a, int b) {
		return a+b;
	}

	public int sum(int a, int b, int c) {
		return a+b+c;
	}

}
