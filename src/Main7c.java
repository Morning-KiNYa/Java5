
public class Main7c {
	// 練習問題1-4

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("整数1を入れてください>");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.print("整数2を入れてください>");
		int b = new java.util.Scanner(System.in).nextInt();
		System.out.print("整数3を入れてください>");
		int c = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("3つの整数値の最大は"+max(a,b,c)+"です。");
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

}
