
public class Main7d {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("1からいくつまで足しますか？>>");
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.println("1から"+num+"までの和は"+sumSystem(num)+"です");

	}
	
	public static int sumSystem(int n) {
		int sum = 0;
		for (int i=1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	

}
