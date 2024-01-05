
public class Main6a {
	//練習5-2＆3
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		email("メールの宛先アドレス","メールの本文");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名："+title);
		System.out.println("本文："+text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文："+text);
	}
}
