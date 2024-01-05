
public class Main7a {
	//練習問題1-2
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("お名前を入力してください>>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("年齢を入れてください>>");
		int age = new java.util.Scanner(System.in).nextInt();
		greeting(name,age);
	}
	public static void greeting(String name,int age) {
		System.out.println(name+"("+age+")さん、こんにちは！");
	}

}
