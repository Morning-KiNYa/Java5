
public class Main7b {
	//練習問題1-3

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("整数を入れてください>>");
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.println(num+"を3乗すると、"+sanjou(num)+"です");
	}
	
	public static int sanjou(int num) {
		int ans = num*num*num;
		return ans;
	}

}
