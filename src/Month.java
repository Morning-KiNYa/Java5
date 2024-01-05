
public class Month {
	//練習問題2-1
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("月を入力してください>>");
		int month = new java.util.Scanner(System.in).nextInt();
		System.out.print(month+"月の日数は"+monthDays(month)+"です");
	}
	
	public static int monthDays(int days) {
		switch (days) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		default:
			return 30;
		}
	}

}
